package randoop.main;

import randoop.main.GenInputsAbstract.BehaviorType;
import randoop.sequence.ExecutableSequence;

/**
 * Method {@link #classify} classifies exceptions thrown by a test sequence based on the {@link
 * GenInputsAbstract.BehaviorType} command-line arguments.
 */
public class ExceptionBehaviorClassifier {

  private ExceptionBehaviorClassifier() {
    throw new Error("Do not instantiate");
  }

  /**
   * Classifies a {@code Throwable} thrown by the {@code ExecutableSequence} using the command-line
   * arguments {@link GenInputsAbstract#checked_exception}, {@link
   * GenInputsAbstract#unchecked_exception}, {@link GenInputsAbstract#npe_on_null_input}, {@link
   * GenInputsAbstract#oom_exception}, and {@link GenInputsAbstract#sof_exception}.
   *
   * @param t the {@code Throwable} to classify
   * @param s the {@code ExecutableSequence} that threw exception
   * @return {@code BehaviorType} determined by command-line arguments
   */
  public static BehaviorType classify(Throwable t, ExecutableSequence s) {

    if (t instanceof RuntimeException || t instanceof Error) {
      // check for specific unchecked exceptions

      if (t instanceof NullPointerException) {
        if (s.hasNullInput()) {
          return GenInputsAbstract.npe_on_null_input;
        } else { // formerly known as the NPE on non-null input contract
          return GenInputsAbstract.npe_on_non_null_input;
        }
      }

      if (t instanceof OutOfMemoryError) {
        return GenInputsAbstract.oom_exception;
      }

      if (t instanceof StackOverflowError) {
        return GenInputsAbstract.sof_exception;
      }

      // default failure exceptions
      if (t instanceof AssertionError || t instanceof StackOverflowError) {
        return BehaviorType.ERROR;
      }

      return GenInputsAbstract.unchecked_exception;

    } else {
      return GenInputsAbstract.checked_exception;
    }
  }
}
