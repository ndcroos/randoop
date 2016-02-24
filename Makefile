
# This makefile contains targets to build and test Randoop
#
# ONE-LINE INSTRUCTIONS: before doing a commit, run target "all".
#
# Other notable test targets:

default:
	@echo "================"
	@echo "Randoop Makefile"
	@echo "================"
	@echo "Main targets:"
	@echo ""
	@echo "all            do everything (build and run test)."
	@echo "build          compile Randoop (does NOT make randoop.jar)."
	@echo "clean          remove build-related auto-generated files."
	@echo "clean-tests    remove test-related auto-generated files."
	@echo "results        display results of tests."
	@echo "tests          run tests."
	@echo "update-goals   update test goal files."
	@echo "manual         update the manual's list of options and table of contents."
	@echo "javadoc        update the API documentation."
	@echo "distribution-files  create distribution zip and jar files, in dist/ dir"
	@echo "                    (also updates manual)."
	@echo "copy-to-gh-pages  copy documentation to gh-pages branch, and push"

# Put user-specific changes in your own Makefile.user.
# Make will silently continue if that file does not exist.
-include Makefile.user

RANDOOP_HOME ?= $(shell pwd)

# Sets common variables, including CLASSPATH
include common.mk

JAVAC ?= javac

JAVAC_TARGET ?= ${TARGET_DEFAULT}

# Build arguments
# use -Xlint:-classfile to suppress checker framework introduced annotation
# warnings from using annotated plume.jar.
JAVAC_ARGS ?= -Xlint:-classfile

# User may set JAVAC_JAR
# User may set JAVAC_EXTRA_ARGS
JAVAC_COMMAND ?= ${JAVAC} ${JAVAC_TARGET} ${JAVAC_ARGS} ${JAVAC_EXTRA_ARGS}

SORT_DIRECTORY_ORDER ?= ${RANDOOP_HOME}/utils/plume-lib/bin/sort-directory-order

export PATH

.SUFFIXES: .java .class

.java.class:

############################################################
# Targets for compiling and doing basic tests on Randoop.

## All the source files.
# These aren't sorted with ${SORT_DIRECTORY_ORDER} because
# the first time the Makefile is run, that script doesn't exist.
# These are mostly used as dependencies rather than in commands,
# so the fact that the order is nondeterministic should be OK.
RANDOOP_FILES = $(shell find src/ tests/ systemtests/src/java_collections -name '*.java')
RANDOOP_SRC_FILES = $(shell find src/ -name '*.java')
RANDOOP_SRC_TXT_FILES = $(shell find src/ -name '*.txt')
RANDOOP_TESTS_FILES = $(shell find tests/ -name '*.java')
RANDOOP_TESTS_TXT_FILES = $(shell find tests/ -name '*.txt')
SYSTEMTESTS_FILES = $(shell find systemtests/src/ -name '*.java')
SYSTEMTESTS_TXT_FILES = $(shell find systemtests/src/ -name '*.txt')

# Build and run tests
all: clean build tests

# Build, run tests, create documentation, create distribution.
all-dist: all javadoc manual distribution-files

# Remove generated .class files.
clean:
	rm -rf bin systemtests/bin mapcall_agent.jar exercised_agent.jar

# Build Randoop.
build: bin mapcall_agent.jar exercised_agent.jar
compile: build

.PHONY: bin-dirs

bin-dirs:
	mkdir -p bin
	mkdir -p systemtests/bin

bin: bin-dirs $(RANDOOP_SRC_FILES) $(RANDOOP_SRC_TXT_FILES)
	@echo ${JAVAC_COMMAND} -Xlint -Xlint:unchecked -g -d bin ...
	@${JAVAC_COMMAND} -Xlint -g -d bin $(RANDOOP_SRC_FILES)
	touch bin

systemtests/bin: bin $(RANDOOP_TESTS_FILES) $(RANDOOP_TESTS_TXT_FILES) $(SYSTEMTESTS_FILES) $(SYSTEMTESTS_TXT_FILES)
	@echo "Compiling test files ..."
	@${JAVAC_COMMAND} -cp $(CLASSPATH):bin -nowarn -g -d systemtests/bin $(RANDOOP_TESTS_FILES)
	@echo "Compiling systemtests files ..."
	@${JAVAC_COMMAND} -cp $(CLASSPATH):bin -nowarn -g -d systemtests/bin $(SYSTEMTESTS_FILES)
	mkdir -p systemtests/bin/randoop/test/resources
	cp tests/randoop/test/resources/*.txt systemtests/bin/randoop/test/resources
	touch systemtests/bin

# Run all tests.
tests: clean-tests bin systemtests/bin result-dir randoop-tests  results

# Make the result directory
.PHONY: result-dir
result-dir:
	mkdir -p systemtests/results

# Runs pure Randoop-related tests.
randoop-tests: unit randoop-help ds-coverage randoop1 randoop2 randoop3 randoop-contracts randoop-checkrep randoop-literals randoop-long-string randoop-visibility randoop-no-output test-reflection test-generation exercised-instrumentation

# build mapcall-agent instrumentation jar
MAPCALL_JAVA_FILES = $(wildcard src/randoop/instrument/mapcallagent/*.java)
bin/randoop/instrument/mapcallagent/Premain.class: bin $(MAPCALL_JAVA_FILES)
	${JAVAC_COMMAND} -Xlint -g -d bin -cp src:$(CLASSPATH) $(MAPCALL_JAVA_FILES)
mapcall_agent.jar : bin/randoop/instrument/mapcallagent/Premain.class src/randoop/instrument/mapcallagent/manifest.txt
	cd bin && jar cfm ../mapcall_agent.jar ../src/randoop/instrument/mapcallagent/manifest.txt \
	  randoop/instrument/mapcallagent/Premain.class


# build exercised-class instrumentation agent
EXERCISED_JAVA_FILES = $(wildcard src/randoop/instrument/exercisedagent/*.java)
bin/randoop/instrument/exercisedagent/ExercisedAgent.class: bin $(EXERCISED_JAVA_FILES)
	${JAVAC_COMMAND} -Xlint -g -d bin -cp src:$(CLASSPATH) $(EXERCISED_JAVA_FILES)
exercised_agent.jar: bin/randoop/instrument/exercisedagent/ExercisedAgent.class src/randoop/instrument/exercisedagent/manifest.txt
	cd bin && jar cfm ../exercised_agent.jar ../src/randoop/instrument/exercisedagent/manifest.txt \
	  randoop/instrument/exercisedagent/ExercisedAgent.class \
	  randoop/instrument/exercisedagent/ExercisedClassTransformer.class


# documentation
ifneq (,$(findstring 1.8.,$(shell java -version 2>&1)))
  DOCLINT?=-Xdoclint:all,-missing
endif

javadoc: plume-lib-update
	\rm -rf doc/javadoc
	mkdir -p doc/javadoc
	find src/randoop -name "*.java" | ${SORT_DIRECTORY_ORDER} \
		| xargs javadoc ${DOCLINT} -d doc/javadoc -quiet -noqualifier all -notimestamp
jdoc: javadoc

ideas:
	kramdown doc/projectideas/ProjectIdeas.md > doc/projectideas/projectideas.html

.PHONY: tags
tags: TAGS
TAGS: $(RANDOOP_FILES) plume-lib-update
	find src/ tests/ -name "*.java" | ${SORT_DIRECTORY_ORDER} | xargs etags


############################################################
# Targets to test Randoop.

# The tests run correctly under Java 1.6. Using an earlier version of
# Java may result in test failures.
unit: systemtests/bin
	@echo "******running unit tests******"
	java ${XMXHEAP} -ea -cp $(CLASSPATH) \
	  junit.textui.TestRunner \
	   randoop.test.AllRandoopTests

# The tests run correctly under Java 1.6. Using an earlier version of
# Java may result in test failures.
ds-coverage: systemtests/bin
	@echo "******running ds-coverage******"
	java ${XMXHEAP} -ea -cp $(CLASSPATH) \
	  junit.textui.TestRunner \
	   randoop.test.ICSE07ContainersTest

# Basic smoke test: help command does not crash.
randoop-help:
	java -ea -classpath $(CLASSPATH) randoop.main.Main help
	java -ea -classpath $(CLASSPATH) randoop.main.Main help help
	java -ea -classpath $(CLASSPATH) randoop.main.Main help gentests
	java -ea -classpath $(CLASSPATH) randoop.main.Main help --unpub gentests
	java -ea -classpath $(CLASSPATH) randoop.main.Main help --unpub help

# Runs Randoop on Collections and TreeSet.
randoop1: systemtests/bin result-dir
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --no-error-revealing-tests \
	   --inputlimit=500 \
	   --testclass=java2.util2.TreeSet \
	   --testclass=java2.util2.Collections \
	   --regression-test-basename=TestClass \
	   --npe-on-null-input=EXPECTED \
	   --junit-package-name=foo.bar \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/log.txt \
	   --debug_checks \
	   --observers=systemtests/resources/randoop1_observers.txt \
	   --output-tests-serialized=systemtests/scratch/sequences_serialized.gzip \
	   --omit-field-list=systemtests/resources/testclassomitfields.txt
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
	  foo/bar/TestClass*.java
	cd systemtests/scratch && \
	  java  -cp .:$(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
	  org.junit.runner.JUnitCore foo.bar.TestClass
	cp systemtests/scratch/foo/bar/TestClass0.java systemtests/results/TestClass0.java

# Runs Randoop on Collections and TreeSet, capture output.
randoop2: systemtests/bin result-dir
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --inputlimit=100 \
	   --testclass=java2.util2.TreeSet \
	   --testclass=java2.util2.ArrayList \
	   --testclass=java2.util2.LinkedList \
	   --testclass=java2.util2.Collections \
	   --regression-test-basename=NaiveRegression \
	   --error-test-basename=NaiveError \
	   --junit-package-name=foo.bar \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/log.txt \
	   --output-tests-serialized=systemtests/scratch/sequences_serialized.gzip \
	   --omit-field-list=systemtests/resources/naiveomitfields.txt
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
	  foo/bar/Naive*.java
	cp systemtests/scratch/foo/bar/Naive*0.java systemtests/results/

# Sanity check. Runs Randoop on a large collections of classes from the JDK,
# with a set of options, and just makes sure that Randoop terminates normally.
randoop3: systemtests/bin
	@echo "***** randoop3 *****"
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME):systemtests/bin:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --inputlimit=1000 \
	   --null-ratio=0.3 \
	   --alias-ratio=0.3 \
	   --small-tests \
	   --clear=100 \
	   --classlist=systemtests/resources/jdk_classlist.txt \
	   --regression-test-basename=JDK_Tests_regression \
	   --error-test-basename=JDK_Tests_error \
	   --junit-package-name=jdktests \
	   --junit-output-dir=systemtests/scratch
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin/:$(CLASSPATH) \
		jdktests/JDK_Tests_regression.java

randoop-contracts: systemtests/bin
	@echo "***** randoop-contracts *****"
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --no-regression-tests \
	   --inputlimit=1000 \
	   --classlist=systemtests/resources/buggyclasses.txt \
	   --error-test-basename=BuggyTest \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/randoop-contracts-log.txt \
	   --output-tests-serialized=systemtests/scratch/sequences_serialized.gzip
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) BuggyTest.java
	cd systemtests/scratch && \
	  java  -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.RandoopContractsTest

randoop-checkrep: systemtests/bin
	@echo "****** randoop-checkrep *****"
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --no-regression-tests \
	   --timelimit=2 \
	   --testclass=examples.CheckRep1 \
	   --testclass=examples.CheckRep2 \
	   --error-test-basename=CheckRepTest \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/randoop-checkrep-contracts-log.txt
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) CheckRepTest.java
	cd systemtests/scratch && \
	  java  -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.RandoopCheckRepTest

# Reads file systemtests/resources/literalsfile.txt.
# Creates file randoop/systemtests/scratch/Literals0.java.
randoop-literals: systemtests/bin result-dir
	@echo "***** randoop-literals *****"
	rm -rf systemtests/scratch
	java -ea -classpath $(CLASSPATH) \
	  randoop.main.Main gentests \
	   --inputlimit=1000 \
	   --testclass=randoop.literals.A \
	   --testclass=randoop.literals.A2 \
	   --testclass=randoop.literals.B \
	   --regression-test-basename=LiteralsReg \
	   --error-test-basename=LiteralsErr \
	   --junit-output-dir=systemtests/scratch \
	   --literals-level=CLASS \
	   --literals-file=systemtests/resources/literalsfile.txt
	cp systemtests/scratch/Literals*0.java systemtests/results/
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) LiteralsReg.java

randoop-long-string: systemtests/bin result-dir
	@echo "***** randoop-long-string ******"
	rm -rf systemtests/scratch
	java -ea -classpath $(CLASSPATH) \
	  randoop.main.Main gentests \
	   --timelimit=1 \
	   --testclass=randoop.test.LongString \
	   --regression-test-basename=LongString \
	   --junit-output-dir=systemtests/scratch
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(CLASSPATH) LongString.java
	cd systemtests/scratch && \
	  java  -cp .:$(CLASSPATH) org.junit.runner.JUnitCore LongString
	cp systemtests/scratch/LongString0.java \
	  systemtests/results/LongString0.java

# Tests that Randoop does not create tests for methods that return non-public types, as this would
# lead to non-compilable tests.
# Actually, it should create the tests but declare them with a supertype!
randoop-visibility: systemtests/bin
	@echo "***** randoop-visibility *****"
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --timelimit=2 \
	   --testclass=examples.Visibility \
	   --regression-test-basename=VisibilityTest \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/log.txt
	cd systemtests/scratch && \
	  ${JAVAC_COMMAND} -nowarn -cp .:$(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) VisibilityTest.java

# Ensure that no output goes to console if user specifies --noprogressdisplay.
# This is important for plugin, since console output results in a Console window
# popping up during Randoop run.
#
# Test only checks for no output on the happy (no errors) path.
randoop-no-output: systemtests/bin
	@echo "***** randoop-no-output *****"
	rm -rf systemtests/scratch
	mkdir systemtests/scratch
	java -ea -classpath $(RANDOOP_HOME)/systemtests/bin:$(CLASSPATH) \
	  randoop.main.Main gentests \
	   --timelimit=1 \
	   --testclass=java.util.LinkedList \
	   --regression-test-basename=NoOutputTest \
	   --junit-output-dir=systemtests/scratch \
	   --log=systemtests/scratch/log.txt \
	   --noprogressdisplay \
	   > systemtests/scratch/stdout.txt 2> systemtests/scratch/stderr.txt
	cp $(RANDOOP_HOME)/systemtests/scratch/stdout.txt $(RANDOOP_HOME)/systemtests/resources
	cp $(RANDOOP_HOME)/systemtests/scratch/stderr.txt $(RANDOOP_HOME)/systemtests/resources


# Performance tests. Removed from Randoop tests because results highly dependent on machine that
# tests are run, resulting in many false positives.
perf: perf1 perf2

# -Xrunhprof:cpu=samples,depth=30
perf1: systemtests/bin
	java ${XMXHEAP} -ea \
	  junit.textui.TestRunner \
	  randoop.test.RandoopPerformanceTest

perf2: systemtests/bin
	java ${XMXHEAP} -ea \
	  junit.textui.TestRunner \
	  randoop.test.NaivePerformanceTest


### Note that this is not a target under tests
test-constants: bin
	java -ea randoop.util.ClassFileConstants bin/randoop/util/ClassFileConstants.class

# runs JUnit4 tests on reflection
test-reflection: bin
	@echo "**** test-reflection ****"
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.operation.EnumConstantTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.operation.EnumReflectionTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.field.InstanceFieldTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.field.StaticFieldTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.field.StaticFinalFieldTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.field.PublicFieldParserTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.operation.FieldGetterTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.operation.FieldSetterTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.operation.FieldReflectionTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.reflection.VisibilityBridgeTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.reflection.VisibilityTest

# run JUnit4 test generation tests
test-generation: bin
	@echo "**** test-generation ****"
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.sequence.TestFilteringTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.sequence.TestClassificationTest
	java -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.test.predicate.ExceptionPredicateTest

exercised-instrumentation: bin
	java -javaagent:exercised_agent.jar -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.instrument.CoveredClassTest
	java -javaagent:exercised_agent.jar -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.instrument.ExerciseInstrumentationTest
	java -javaagent:exercised_agent.jar -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.instrument.SpecialCoveredClassTest
	java -javaagent:exercised_agent.jar -cp $(CLASSPATH) org.junit.runner.JUnitCore randoop.instrument.LoadingWithAnnotationTest

############################################################
# Targets for creating and printing the results of test diffs.

goal_files = $(shell find systemtests/goals -name "*.goal")

# Contains the goal file names, without the .goal suffix.
goal_files_bases = $(basename $(goal_files))

# Contains the diff file names. Diff files written to base directory.
diff_files = $(foreach base, $(goal_files_bases), $(base).diff)

update_goal_targets = $(foreach base, $(goal_files_bases), $(base)-update-goal)

# Calls Make recursively to update the goal files.
update-goals:
	make $(update_goal_targets)

# Given target F-update-goal, copies F -> F.goal.
%-update-goal:
	cp $* $*.goal

# Removes any previously-generated diff or auto-generated files.
clean-tests:
	rm -f $(diff_files)
	rm -f $(goal_files_bases)
	rm -rf systemtests/results
	rm -rf systemtests/scratch

# Calls Make recursively to make the necessary .diff files.
diffs:
	make $(diff_files)

# Creates a .diff file by comparing a file F with F.goal.  If F does
# not exist, creates a F.diff file with a message saying that the F
# file does not exist.
%.diff: .FORCE
	if [ -e $* ]; then \
	  (diff -u $*.goal $* > $*.diff) || true; \
	else \
	  echo "Target file does not exist: $*" > $*.diff; \
	fi

# output display; can be called from children (they will set BASE)
BASE?=.
# removes fields before the size (ie, permissions, owner, group).
PERL_CLEANUP_LS_OUTPUT = perl -ne 'BEGIN { $$failure=0; } /^\S+\s+\S+\s+\S+\s+\S+\s+(\d+)\s+(.*)\s+(\S+)$$/; print "$$1\t$$2\t$$3\n"; if ($$1 > 0) { $$failure++; } END { if ($$failure == 1) { print "1 test failed.\n"; exit 1; } elsif ($$failure) { print "$$failure tests failed.\n"; exit 1; } else { print "All tests succeeded.\n"; } }'
# args to 'find' program, to find files containg results
RESULTS_PATTERN :=    -name '*.diff'

results: diffs results_header summary

results_header:
	@echo ""
	@echo "=== RESULTS ==="
	@echo ""

summary:
	@ls -l $(diff_files) \
	  | perl -pe 's|\Q${BASE}|.|;' \
	  | ${PERL_CLEANUP_LS_OUTPUT}


############################################################
# Plume-lib
# Only needed for scripts to wrangle documentation;
# get lib/plume.jar using instructions in lib/README

# Checks out a copy of the plume libraries.
# We only use the html-update and sort-directory-order scripts.
utils/plume-lib:
	mkdir -p utils
	cd utils && git clone https://github.com/mernst/plume-lib.git plume-lib

plume-lib-update: utils/plume-lib
	cd utils/plume-lib && git pull

############################################################
# Updating Randoop's manual.
# Keeping it simple: manual is all in index.html.

# List of .java files is from GenTests.java's "new Options" expression.
GENTESTS_OPTIONS_JAVA = \
      src/randoop/Globals.java \
      src/randoop/main/GenTests.java \
      src/randoop/main/GenInputsAbstract.java \
      src/randoop/util/Log.java \
      src/randoop/util/ReflectionExecutor.java \
      src/randoop/sequence/ForwardGenerator.java \
      src/randoop/sequence/AbstractGenerator.java

# "build" is a prerequisite because javadoc reads .class files to determine
# annotations.
# Also run "make plume-lib-update" to get the latest  html-update-toc.
manual: build plume-lib-update
	javadoc -quiet -doclet plume.OptionsDoclet -i -docfile doc/index.html ${GENTESTS_OPTIONS_JAVA}
	utils/plume-lib/bin/html-update-toc doc/index.html
	utils/plume-lib/bin/html-update-toc doc/dev.html

plugin-manual: build plume-lib-update
	utils/plume-lib/bin/html-update-toc plugin/doc/index.html
	utils/plume-lib/bin/html-update-toc plugin/doc/dev.html

# A separate target because the "validate" tool might not be installed.
# It does not depend on "manual" because that always does a build.
validate-manual:
	validate doc/index.html
	validate doc/dev.html


############################################################
# Targets for updating Randoop's distribution.

# Creates the zip file for other people to download.
distribution-files: manual mapcall_agent.jar plume-lib-update
	rm -rf randoop dist
	mkdir randoop
	mkdir randoop/bin
	cp mapcall_agent.jar randoop/
	cp exercised_agent.jar randoop/
# Copy sources and required libraries.
	cp -R src randoop/src
	cp -R tests randoop/tests
	cp -R systemtests randoop/systemtests
# Copy sources and required libraries.
	cp -R doc randoop/doc
# Copy required libraries.
	mkdir randoop/lib
	cp lib/plume.jar randoop/lib
	cp lib/javassist.jar randoop/lib
# Copy license.
	cp license.txt randoop/
# Copy eclipse project files.
	cp .project randoop/.project
	cp .classpath-dist randoop/.classpath
# Make sure everything works.
	cd randoop && \
	  find src/ -name "*.java" | ${SORT_DIRECTORY_ORDER} | xargs ${JAVAC_COMMAND} -d bin -cp 'lib/plume.jar:lib/javassist.jar' && \
		find tests/ -name "*.java" | ${SORT_DIRECTORY_ORDER} | xargs ${JAVAC_COMMAND} -d systemtests/bin -cp 'lib/plume.jar:lib/javassist.jar'
# Why doesn't this work (any more)?
#	cd randoop && \
#	  find src/ tests/ -name "*.java" | ${SORT_DIRECTORY_ORDER} | xargs ${JAVAC_COMMAND} -d bin -cp 'lib/*'
# (Alternative that may be necessary with certain OpenJDK builds whose javac erroneously double-evaluates command-line arguments.)
# 	cd randoop && \
#	  find src/ tests/ -name "*.java" | ${SORT_DIRECTORY_ORDER} | xargs ${JAVAC_COMMAND} -d bin -cp `ls lib/*.jar | perl -p -e 's/\n/:/g'`
# Make randoop.jar.
	mkdir randoop/tmp
	cp -r randoop/bin/* randoop/tmp
	cd randoop/tmp && jar xf ../lib/plume.jar
	cd randoop/tmp && jar xf ../lib/javassist.jar
	cd randoop/tmp && jar cf randoop.jar *
	mv randoop/tmp/randoop.jar randoop/
	rm -r randoop/tmp
# Sanity test jar: invoking randoop terminates normally.
	java -cp randoop/randoop.jar randoop.main.Main
# Create dist zip file.
	rm -f randoop.zip
	rm -rf `find randoop -name '*~'`
	zip -r randoop.zip randoop
# Put zip and jar in "dist" directory.
	mkdir dist
	mv randoop/randoop.jar dist
	mv randoop.zip dist
	mv randoop/mapcall_agent.jar dist
	mv randoop/exercised_agent.jar dist
# Remove scratch directory.
	rm -r randoop

../randoop-gh-pages:
	(cd .. && git clone git@github.com:randoop/randoop.git && git checkout gh-pages)

copy-to-gh-pages: ../randoop-gh-pages javadoc manual
	(cd ../randoop-gh-pages && git pull)
# Remove all files from manual/ except README, then copy new contents
	(cd ../randoop-gh-pages/manual && find . -type f -not -name 'README' | xargs rm -f)
	cp -pr doc/dev.html doc/index.html doc/stylesheets ../randoop-gh-pages/manual
# Remove all Javadoc files, then copy new contents
	rm -rf ../randoop-gh-pages/api
	cp -pr doc/javadoc ../randoop-gh-pages/api
# Git operations
	(cd ../randoop-gh-pages && git stage .)

showvars:
	@echo "CLASSPATH = $(CLASSPATH)"
	@echo "RANDOOP_HOME = $(RANDOOP_HOME)"
	@echo "RANDOOP_FILES = $(RANDOOP_FILES)"
	@echo "RANDOOP_SRC_FILES = $(RANDOOP_SRC_FILES)"
	@echo "RANDOOP_TESTS_FILES = $(RANDOOP_TESTS_FILES)"
	@echo "RANDOOP_TXT_FILES = $(RANDOOP_TXT_FILES)"

.FORCE:
