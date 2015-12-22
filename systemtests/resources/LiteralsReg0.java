
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LiteralsReg0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test001"); }


    randoop.literals.A a1 = new randoop.literals.A(100);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test002"); }


    randoop.literals.A a1 = new randoop.literals.A("");

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test003"); }


    randoop.literals.A a1 = new randoop.literals.A("111");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test004"); }


    randoop.literals.A a1 = new randoop.literals.A((-1));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test005"); }


    randoop.literals.A a1 = new randoop.literals.A("hi!");

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test006"); }


    randoop.literals.A a1 = new randoop.literals.A(1);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test007"); }


    randoop.literals.A a1 = new randoop.literals.A(111);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test008"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test((short)(-1));
    a21.test(1L);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test009"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0d);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test010"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(1L);
    a21.test(' ');

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test011"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test("");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test012"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test('a');

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test013"); }


    randoop.literals.A a1 = new randoop.literals.A(0);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test014"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test((-1));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test015"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(0);
    a21.test(1.0f);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test016"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(100);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test017"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("");
    a21.test((byte)100);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test018"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((byte)10);
    a21.test((byte)100);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test019"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10);
    a21.test(1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test020"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test(0);
    a21.test('a');
    a21.test(100.0f);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test021"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test("111");
    a21.test(222);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test022"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test((short)(-1));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test023"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test((byte)22);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test024"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test(1);
    a21.test((short)222);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test025"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test("");

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test026"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222);
    a21.test(100.0d);
    a21.test((-1.0d));
    a21.test("");

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test027"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test(1);
    a21.test((-1.0d));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test028"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(222L);
    a21.test((byte)(-1));
    a21.test(222L);
    a21.test((byte)10);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test029"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((short)0);
    a21.test((short)(-1));
    a21.test((byte)10);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test030"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test((short)1);
    a21.test((short)100);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test031"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test("hi!");
    a21.test((byte)100);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test032"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test((byte)10);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test033"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(0);
    b0.test(10);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test034"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((byte)10);
    a21.test((-1.0f));
    a21.test("222");
    a21.test(111);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test035"); }


    randoop.literals.A a1 = new randoop.literals.A(10);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test036"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test(0.0d);
    a21.test((byte)1);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test037"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test((short)(-1));
    a21.test('#');

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test038"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test((-1.0d));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test039"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(1L);
    a21.test(222.0f);
    a21.test("");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test040"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test((short)(-1));
    a21.test('#');

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test041"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test(' ');
    a21.test(222.0f);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test042"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test("hi!");
    a21.test((short)10);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test043"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)0);
    a21.test((byte)(-1));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test044"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0L);
    a21.test((-1.0f));
    a21.test("111");
    a21.test("111");
    a21.test((byte)10);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test045"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test("");
    b0.test(0);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test046"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test(10L);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test047"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test(222);
    a21.test(1);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test048"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test("");
    a21.test((-1.0f));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test049"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test((short)1);
    a21.test(100L);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test050"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((byte)22);
    a21.test("");
    a21.test(100);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test051"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test((short)0);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test052"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test('#');
    a21.test((short)222);
    a21.test((byte)(-1));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test053"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test((byte)(-1));
    a21.test((short)1);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test054"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(10.0f);
    a21.test(100);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test055"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test((byte)10);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test056"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test("");
    b0.test((-1));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test057"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("333");
    b0.test(333);
    b0.test("hi!");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test058"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0L);
    a21.test((-1.0f));
    a21.test("111");
    a21.test((short)10);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test059"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("");
    a21.test(1L);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test060"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test(222.0f);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test061"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test((byte)22);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test062"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test(10);
    a21.test("");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test063"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("hi!");
    a21.test(10.0f);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test064"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(0L);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test065"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(' ');
    a21.test("");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test066"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test("222");

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test067"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(222.0f);
    a21.test("111");

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test068"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1L));
    a21.test(10.0f);
    a21.test(10);
    a21.test("hi!");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test069"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(0);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test070"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(10.0f);
    a21.test('\"');

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test071"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test((byte)(-1));
    a21.test(10.0f);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test072"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test("hi!");
    a21.test((-1.0d));
    a21.test((short)10);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test073"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test(100);
    b0.test(10);
    b0.test(10);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test074"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);
    b0.test("");
    b0.test(100);
    b0.test(10);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test075"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(222L);
    a21.test(10L);
    a21.test((-1.0f));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test076"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test(0.0f);
    a21.test((byte)100);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test077"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test(10.0f);
    a21.test(222.0f);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test078"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((-1.0f));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test079"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test("hi!");

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test080"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0L);
    a21.test(1.0d);
    a21.test('4');

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test081"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)100);
    a21.test("222");
    a21.test(10.0f);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test082"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((short)222);
    a21.test((short)100);
    a21.test('a');
    a21.test('a');

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test083"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test(1);
    a21.test('4');
    a21.test(10.0f);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test084"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1L));
    a21.test((short)0);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test085"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);
    b0.test("");
    b0.test(100);
    b0.test("333");

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test086"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test("111");

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test087"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test('#');
    a21.test("");
    a21.test(100L);
    a21.test(10L);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test088"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("hi!");
    a21.test(100L);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test089"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test(222.0f);
    a21.test((short)1);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test090"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("");
    b0.test("333");

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test091"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test("hi!");
    a21.test("222");

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test092"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(222L);
    a21.test((short)100);
    a21.test(100.0d);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test093"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test((short)100);
    a21.test(222.0d);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test094"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(222L);
    a21.test(10.0f);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test095"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test("");
    a21.test(222.0d);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test096"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(222L);
    a21.test((byte)(-1));
    a21.test(222L);
    a21.test(222.0f);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test097"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(1L);
    a21.test(222.0f);
    a21.test(100L);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test098"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((byte)22);
    a21.test("");
    a21.test("222");

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test099"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test(100.0f);
    a21.test('4');

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test100"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("");
    b0.test("hi!");
    b0.test("");

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test101"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test(1);
    a21.test('4');
    a21.test(222.0f);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test102"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1L));
    a21.test(10.0f);
    a21.test(10);
    a21.test((-1.0f));
    a21.test(' ');

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test103"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test(1L);
    a21.test(0.0f);
    a21.test((short)100);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test104"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test("");

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test105"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test((short)1);
    a21.test((short)(-1));
    a21.test(222);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test106"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test(1L);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test107"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test("hi!");
    b0.test("hi!");
    b0.test(10);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test108"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(0);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test109"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test("111");
    a21.test((byte)(-1));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test110"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test((byte)10);
    a21.test("");

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test111"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test(10.0d);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test112"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test((byte)10);
    a21.test('#');

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test113"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(10L);
    a21.test(1L);
    a21.test("");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test114"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(222L);
    a21.test((-1.0d));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test115"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test((short)10);
    a21.test((short)(-1));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test116"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);
    b0.test("333");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test117"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)100);
    a21.test((short)100);
    a21.test((short)100);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test118"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("hi!");
    b0.test("");

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test119"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(10L);
    a21.test(1L);
    a21.test("hi!");

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test120"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test(333);
    b0.test("333");
    b0.test(1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test121"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test(100.0d);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test122"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(10.0f);
    a21.test("");
    a21.test((-1L));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test123"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test(1);
    a21.test((-1));
    a21.test(222);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test124"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test(100);
    b0.test("333");

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test125"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test(222.0f);
    a21.test(222.0f);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test126"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test(100L);
    a21.test((short)(-1));
    a21.test(10.0d);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test127"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(100);
    a21.test(10);
    a21.test((byte)10);
    a21.test((short)222);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test128"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test("hi!");
    a21.test((byte)10);
    a21.test("222");

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test129"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test("hi!");
    a21.test((short)222);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test130"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test("hi!");
    a21.test(222);
    a21.test(1.0d);
    a21.test((-1));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test131"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("hi!");
    b0.test((-1));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test132"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("111");
    a21.test(1.0d);
    a21.test(222.0f);
    a21.test((byte)100);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test133"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test((-1));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test134"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((short)10);
    a21.test(1L);
    a21.test('\"');

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test135"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test("hi!");
    a21.test((-1.0d));
    a21.test(1);
    a21.test(100.0d);
    a21.test((byte)(-1));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test136"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test((byte)(-1));
    a21.test("111");

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test137"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(111);
    a21.test((byte)100);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test138"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test(100);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test139"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)0);
    a21.test(1.0d);
    a21.test((byte)10);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test140"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100);
    a21.test(100.0f);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test141"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(111);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test142"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test(100);
    b0.test((-1));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test143"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test((short)10);
    a21.test((short)1);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test144"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test('#');
    a21.test((short)222);
    a21.test((byte)1);
    a21.test((-1.0f));

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test145"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(100);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test146"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222);
    a21.test(100.0d);
    a21.test((-1.0d));
    a21.test("hi!");

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test147"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0L);
    a21.test(1.0d);
    a21.test((byte)100);
    a21.test((byte)10);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test148"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)1);
    a21.test(10.0f);
    a21.test(111);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test149"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test((short)222);
    a21.test(10.0d);
    a21.test(' ');

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test150"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((byte)0);
    a21.test((-1.0f));
    a21.test(222);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test151"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test(' ');
    a21.test(100.0d);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test152"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(100);
    b0.test("hi!");
    b0.test(10);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test153"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test((byte)(-1));
    a21.test(222);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test154"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test((byte)1);
    a21.test(10.0f);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test155"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(10.0f);
    a21.test((byte)10);
    a21.test(222);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test156"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test(10L);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test157"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222L);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test158"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100);
    a21.test((short)10);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test159"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)0);
    a21.test((byte)100);
    a21.test((short)10);
    a21.test('\"');

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test160"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test161"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test((-1));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test162"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0.0f);
    a21.test((short)222);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test163"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)0);
    a21.test(10L);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test164"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test((-1));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test165"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("hi!");
    b0.test((-1));
    b0.test("333");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test166"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test(222);
    a21.test("222");

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test167"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test(' ');
    a21.test((short)1);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test168"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test((byte)0);
    a21.test('\"');
    a21.test("222");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test169"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(10);
    a21.test(111);
    a21.test(100L);
    a21.test('#');

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test170"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(1.0f);
    a21.test('#');

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test171"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(0);
    b0.test(1);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test172"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("111");
    a21.test(10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test173"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test((short)10);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test174"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test((-1L));
    a21.test((short)222);
    a21.test("hi!");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test175"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test(0.0d);
    a21.test(100L);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test176"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(222.0d);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test177"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test("hi!");

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test178"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10);
    a21.test((-1.0f));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test179"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test("hi!");
    a21.test((byte)100);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test180"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test("hi!");
    a21.test(100.0d);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test181"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((byte)0);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test182"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10);
    a21.test(100);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test183"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(333);
    b0.test("hi!");

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test184"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test("hi!");

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test185"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test(100);
    b0.test("hi!");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test186"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(111);
    a21.test((short)10);
    a21.test(10.0d);
    a21.test((byte)0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test187"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test(100.0d);
    a21.test("111");

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test188"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test('#');
    a21.test((-1.0d));
    a21.test(10);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test189"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(100.0d);
    a21.test(222.0f);
    a21.test(10.0d);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test190"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test((-1.0f));
    a21.test(0.0d);
    a21.test((short)100);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test191"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("hi!");
    b0.test(0);
    b0.test("hi!");
    b0.test(100);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test192"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)1);
    a21.test(0L);
    a21.test((byte)1);
    a21.test(222);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test193"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test((short)100);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test194"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test((byte)0);
    a21.test(100.0f);
    a21.test((byte)(-1));
    a21.test(1.0f);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test195"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test("222");
    a21.test(10.0f);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test196"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(1L);
    a21.test("");
    a21.test(222.0d);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test197"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("hi!");
    a21.test((-1.0f));

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test198"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((short)222);
    a21.test((short)100);
    a21.test('a');
    a21.test('#');

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test199"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(222L);
    a21.test((short)10);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test200"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test(222.0d);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test201"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test((byte)22);
    a21.test(222L);
    a21.test("222");

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test202"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test(1);
    a21.test((short)1);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test203"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("hi!");
    b0.test((-1));
    b0.test("");
    b0.test(333);
    b0.test(333);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test204"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test(100);
    b0.test("");
    b0.test("");

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test205"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((byte)22);
    a21.test("");
    a21.test(100.0f);
    a21.test(100);
    a21.test(100L);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test206"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test("");
    a21.test(10L);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test207"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test("222");
    a21.test(1.0f);
    a21.test((short)1);
    a21.test(100.0d);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test208"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222);
    a21.test("111");
    a21.test(222.0f);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test209"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(222L);
    a21.test(10L);
    a21.test((-1L));

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test210"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test211"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(333);
    b0.test("");
    b0.test("");
    b0.test((-1));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test212"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(111);
    a21.test('\"');
    a21.test((byte)10);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test213"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test('#');
    a21.test((-1));
    a21.test(0);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test214"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("333");
    b0.test(100);
    b0.test(10);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test215"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test(10.0f);
    a21.test(222.0d);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test216"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test(100.0d);
    a21.test((-1.0d));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test217"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((short)0);
    a21.test('a');
    a21.test(111);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test218"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(1);
    a21.test("222");

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test219"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test((byte)(-1));
    a21.test("111");

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test220"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(0L);
    a21.test(100.0f);
    a21.test(1.0d);
    a21.test(0);

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test221"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test('#');
    a21.test((short)222);
    a21.test((byte)1);
    a21.test('4');

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test222"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((-1.0d));
    a21.test((-1L));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test223"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test((short)(-1));

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test224"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test("333");
    b0.test("");
    b0.test(333);
    b0.test(100);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test225"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("hi!");
    a21.test(100);
    a21.test('\"');

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test226"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("333");
    b0.test("hi!");
    b0.test((-1));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test227"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test(222.0f);
    a21.test('#');

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test228"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(1);
    b0.test(333);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test229"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test("333");
    b0.test("333");

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test230"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("111");

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test231"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test('a');
    a21.test((short)100);
    a21.test(100L);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test232"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("111");
    a21.test(0.0d);
    a21.test(0);
    a21.test((byte)10);
    a21.test((short)100);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test233"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(222L);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test234"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test("hi!");
    b0.test("333");

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test235"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("hi!");

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test236"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test('#');
    a21.test('a');

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test237"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test('a');
    a21.test((short)100);
    a21.test("");

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test238"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1L));
    a21.test(10.0f);
    a21.test(10);
    a21.test(0.0d);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test239"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(0.0d);
    a21.test("222");

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test240"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test((-1));
    b0.test("333");

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test241"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(100.0d);
    a21.test('4');
    a21.test((short)100);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test242"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test((short)(-1));
    a21.test((short)(-1));

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test243"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(222.0f);
    a21.test(1.0d);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test244"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test("222");
    a21.test(1.0f);
    a21.test(1.0f);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test245"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((short)100);
    a21.test((short)(-1));
    a21.test(222.0d);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test246"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test("hi!");
    a21.test(222);
    a21.test((byte)(-1));
    a21.test(222L);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test247"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(10);
    b0.test(0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test248"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test('#');
    a21.test('4');
    a21.test((byte)0);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test249"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((short)222);
    a21.test((short)100);
    a21.test((byte)100);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test250"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("");
    b0.test(100);
    b0.test(0);
    b0.test(1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test251"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test((byte)22);
    a21.test(222L);
    a21.test((-1L));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test252"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((byte)0);
    a21.test('#');
    a21.test(111);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test253"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test((short)(-1));
    a21.test(100);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test254"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(333);
    b0.test("333");

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test255"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('#');
    a21.test("");
    a21.test((short)222);
    a21.test((-1.0f));
    a21.test((short)100);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test256"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("hi!");
    a21.test(100);
    a21.test(' ');

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test257"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test("111");
    a21.test(111);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test258"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test(10.0d);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test259"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test(222L);
    a21.test((short)100);
    a21.test("");

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test260"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test("111");
    a21.test(0.0d);
    a21.test(1L);
    a21.test('#');

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test261"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test('#');
    a21.test((short)222);
    a21.test('#');
    a21.test("222");

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test262"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test((short)10);
    a21.test('#');
    a21.test(100.0f);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test263"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test(1);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test264"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test((-1));
    b0.test(0);
    b0.test("hi!");
    b0.test(333);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test265"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test("222");

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test266"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test("hi!");
    b0.test("");
    b0.test(333);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test267"); }


    randoop.literals.A2 a21 = new randoop.literals.A2((-1));
    a21.test(222.0d);
    a21.test((-1));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test268"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((short)222);
    a21.test((short)100);
    a21.test('a');
    a21.test(1L);
    a21.test(0.0f);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test269"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test(1L);
    a21.test(111);
    a21.test((byte)10);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test270"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(0L);
    a21.test(100.0f);
    a21.test(100.0f);
    a21.test('a');

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test271"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(10L);
    a21.test((short)222);
    a21.test((-1));
    a21.test(0.0d);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test272"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test(100.0d);
    a21.test(1.0f);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test273"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test("hi!");
    a21.test(100L);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test274"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test((byte)22);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test275"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test(100.0f);
    a21.test("222");

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test276"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test("hi!");
    b0.test("333");
    b0.test("");

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test277"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test((-1.0d));
    a21.test("111");

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test278"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test("hi!");
    b0.test("333");
    b0.test(100);
    b0.test("");

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test279"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("333");
    b0.test(333);
    b0.test(0);
    b0.test(0);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test280"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test(10);
    a21.test("222");

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test281"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test(10.0d);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test282"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(100);
    a21.test((-1));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test283"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)1);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test284"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test("333");
    b0.test((-1));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test285"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test(222.0f);
    a21.test((short)10);
    a21.test((short)10);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test286"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("hi!");
    b0.test("");
    b0.test(10);
    b0.test(1);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test287"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test(0L);
    a21.test(222L);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test288"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test(0.0d);
    a21.test((short)(-1));
    a21.test(10L);
    a21.test((short)222);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test289"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test("hi!");
    a21.test("111");

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test290"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test(222.0f);
    a21.test('4');

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test291"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(0);
    a21.test(0.0d);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test292"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)0);
    a21.test(10.0f);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test293"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test((byte)0);
    a21.test((short)10);
    a21.test((short)(-1));
    a21.test("hi!");
    a21.test((short)100);
    a21.test(0L);
    a21.test(100.0f);

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test294"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('#');
    a21.test(1.0f);
    a21.test(0.0d);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test295"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("111");
    a21.test(1.0d);
    a21.test(222.0f);
    a21.test('4');
    a21.test((short)100);
    a21.test(1);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test296"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test(100.0d);
    a21.test('a');

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test297"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test("222");
    a21.test(1.0f);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test298"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test((byte)(-1));
    a21.test((short)1);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test299"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test((byte)10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test300"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test(222);
    a21.test((-1.0f));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test301"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(0);
    b0.test((-1));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test302"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test((short)(-1));
    a21.test(222);

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test303"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test((short)0);
    a21.test((short)100);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test304"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test(1);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test305"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test((byte)22);
    a21.test((-1L));
    a21.test((short)(-1));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test306"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1.0d));
    a21.test(10);
    a21.test((byte)0);
    a21.test(222L);
    a21.test('#');
    a21.test("");

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test307"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test((byte)0);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test308"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test("333");
    b0.test("");
    b0.test("333");
    b0.test("");
    b0.test(333);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test309"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test(222.0d);
    a21.test(10L);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test310"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(100);
    a21.test(10);
    a21.test((byte)10);
    a21.test("");
    a21.test(10);
    a21.test('4');
    a21.test((short)100);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test311"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test((short)(-1));
    a21.test(0L);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test312"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test((short)10);
    a21.test((byte)10);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test313"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test('#');

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test314"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test((byte)(-1));
    a21.test(0.0f);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test315"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test("111");
    a21.test(0.0d);
    a21.test(0);
    a21.test(111);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test316"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0.0f);
    a21.test((byte)(-1));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test317"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test("");

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test318"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((byte)0);
    a21.test('#');
    a21.test('#');
    a21.test("");

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test319"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((short)10);
    a21.test(1L);
    a21.test(10.0f);
    a21.test((-1.0f));

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test320"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test((byte)(-1));
    a21.test(1L);
    a21.test((byte)0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test321"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test("222");
    a21.test(1.0f);
    a21.test((short)1);
    a21.test(1.0d);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test322"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)100);
    a21.test((byte)22);
    a21.test((byte)100);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test323"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(0.0d);
    a21.test(0.0f);
    a21.test('a');

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test324"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((byte)0);
    a21.test("222");

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test325"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("");
    a21.test(222);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test326"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1L);
    a21.test("111");

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test327"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test((short)0);
    a21.test(0L);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test328"); }


    randoop.literals.A2 a21 = new randoop.literals.A2((-1));
    a21.test(222.0d);
    a21.test(' ');
    a21.test((short)222);
    a21.test("hi!");

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test329"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('#');
    a21.test("");
    a21.test((short)222);
    a21.test((-1));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test330"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test("");
    a21.test(' ');

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test331"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test("111");
    a21.test("111");
    a21.test('#');

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test332"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(222L);
    a21.test(222.0f);
    a21.test(1.0d);
    a21.test(0.0d);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test333"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(111);
    a21.test('\"');
    a21.test((byte)100);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test334"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)0);
    a21.test((-1));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test335"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("");
    a21.test(1.0d);
    a21.test((byte)10);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test336"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((byte)22);
    a21.test(1.0d);
    a21.test(0.0d);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test337"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test(100.0f);
    a21.test('a');
    a21.test((byte)22);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test338"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((byte)0);
    a21.test((-1.0f));
    a21.test((short)222);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test339"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)100);
    a21.test(100.0d);
    a21.test(10.0d);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test340"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test("222");
    a21.test(222.0f);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test341"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test(1);
    a21.test((-1));
    a21.test(222.0d);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test342"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('#');
    a21.test((short)0);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test343"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test(222.0f);
    a21.test(0L);
    a21.test((byte)(-1));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test344"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test((byte)0);
    a21.test((short)10);
    a21.test(1);
    a21.test(' ');

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test345"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(10.0f);
    a21.test("");
    a21.test((byte)1);
    a21.test("");
    a21.test('4');

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test346"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("");
    b0.test("hi!");
    b0.test(1);
    b0.test("hi!");

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test347"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100);
    a21.test('#');
    a21.test(222.0d);
    a21.test("");
    a21.test(100.0d);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test348"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('\"');
    a21.test((short)10);
    a21.test(1.0f);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test349"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(' ');
    a21.test(222.0f);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test350"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((short)100);
    a21.test((short)(-1));
    a21.test(10);
    a21.test((-1));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test351"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(111);
    a21.test((short)222);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test352"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test("222");
    a21.test(1.0f);
    a21.test(100.0f);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test353"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test(100.0f);
    a21.test('a');
    a21.test(100L);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test354"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test((byte)0);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test355"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test((-1L));
    a21.test((short)222);
    a21.test(1);
    a21.test((-1.0d));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test356"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((-1L));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test357"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)100);
    a21.test(100.0d);
    a21.test(100.0f);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test358"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test("hi!");
    a21.test((byte)22);
    a21.test(1.0d);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test359"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test(1);
    a21.test(10);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test360"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("hi!");
    b0.test((-1));
    b0.test("");
    b0.test(333);
    b0.test("");
    b0.test((-1));

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test361"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((short)100);
    a21.test(0.0f);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test362"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test((byte)0);
    a21.test(100.0f);
    a21.test((-1.0f));
    a21.test(222);
    a21.test((short)(-1));
    a21.test((short)1);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test363"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("hi!");
    b0.test((-1));
    b0.test((-1));
    b0.test("333");

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test364"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test((short)222);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test365"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test(333);
    b0.test(333);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test366"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test("222");
    a21.test(0);
    a21.test(222.0f);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test367"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1L));
    a21.test(10.0f);
    a21.test('#');

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test368"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222);
    a21.test("hi!");

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test369"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test(222.0f);
    a21.test((byte)22);
    a21.test(1.0f);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test370"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test(222L);
    a21.test("222");

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test371"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)1);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test372"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test((byte)22);
    a21.test(111);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test373"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test((short)10);
    a21.test("222");

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test374"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("");
    b0.test(100);
    b0.test("");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test375"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test("333");
    b0.test(1);
    b0.test("333");

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test376"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test(10.0f);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test377"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test((byte)0);
    a21.test((short)10);
    a21.test(1);
    a21.test((byte)1);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test378"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)1);
    a21.test(0L);
    a21.test((byte)1);
    a21.test((byte)10);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test379"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test(10.0f);
    a21.test("");
    a21.test((byte)1);
    a21.test("");
    a21.test(1L);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test380"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test('#');
    a21.test((-1));
    a21.test("111");
    a21.test(222.0f);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test381"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test(222.0f);
    a21.test((short)10);
    a21.test((-1L));
    a21.test(10.0f);
    a21.test("222");
    a21.test(100L);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test382"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test(10.0f);
    a21.test((byte)0);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test383"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(333);
    b0.test((-1));
    b0.test(1);
    b0.test(1);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test384"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test(100.0d);
    a21.test((byte)10);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test385"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test((byte)10);
    a21.test('4');

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test386"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(100);
    a21.test(10);
    a21.test("111");
    a21.test((short)222);
    a21.test((-1L));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test387"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test((-1L));
    a21.test((-1.0d));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test388"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test(1);
    b0.test("hi!");

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test389"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test("111");
    a21.test(0.0d);
    a21.test(0L);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test390"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test((short)10);
    a21.test(100.0d);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test391"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(10.0d);
    a21.test((byte)22);
    a21.test((byte)100);
    a21.test(1.0f);
    a21.test(100.0f);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test392"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)22);
    a21.test("222");
    a21.test(10.0f);
    a21.test("222");
    a21.test(10.0f);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test393"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("333");
    b0.test(333);
    b0.test("333");

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test394"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("hi!");
    b0.test((-1));
    b0.test(100);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test395"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((short)10);
    a21.test('#');
    a21.test(10L);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test396"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test((byte)22);
    a21.test(0);
    a21.test("111");
    a21.test("111");
    a21.test(0.0f);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test397"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(111);
    a21.test((byte)1);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test398"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("");
    a21.test(222L);
    a21.test((-1.0d));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test399"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);
    b0.test("");
    b0.test(0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test400"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test("");

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test401"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(100.0d);
    a21.test((byte)1);
    a21.test(0L);
    a21.test((short)1);
    a21.test(' ');

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test402"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(111);
    a21.test(0);
    a21.test("222");

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test403"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(222L);
    a21.test(10L);
    a21.test("");
    a21.test(1.0d);

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test404"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(1);
    a21.test("hi!");
    a21.test(10.0d);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test405"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(10L);
    a21.test(' ');
    a21.test('4');
    a21.test("222");
    a21.test(10L);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test406"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test(10L);
    a21.test("hi!");
    a21.test((byte)10);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test407"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(1);
    a21.test('4');
    a21.test((short)0);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test408"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test(0);
    a21.test((byte)22);
    a21.test(10.0f);
    a21.test(222.0d);
    a21.test((byte)22);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test409"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test(' ');

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test410"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(100.0d);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test411"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test(222L);
    a21.test(1L);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test412"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(100);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test413"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test(0);
    a21.test((short)222);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test414"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test(10L);
    a21.test((short)222);
    a21.test((byte)22);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test415"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(10);
    b0.test("");
    b0.test(100);
    b0.test("hi!");
    b0.test("");
    b0.test(333);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test416"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(111);
    a21.test(0);
    a21.test(1.0f);
    a21.test((short)0);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test417"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test('\"');
    a21.test((-1.0f));

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test418"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test((byte)0);
    a21.test((short)10);
    a21.test((-1));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test419"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test(1L);
    a21.test((-1));

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test420"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("hi!");

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test421"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test("222");
    a21.test("222");

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test422"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(10.0f);
    a21.test((short)1);
    a21.test((short)1);
    a21.test('\"');
    a21.test("222");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test423"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test('#');
    a21.test((byte)10);
    a21.test((short)0);
    a21.test('#');

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test424"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("hi!");
    b0.test(0);
    b0.test(333);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test425"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((byte)22);
    a21.test("");
    a21.test(100.0f);
    a21.test(100);
    a21.test(10.0f);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test426"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test(0.0d);
    a21.test((-1L));
    a21.test("111");

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test427"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test(1);
    a21.test("111");

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test428"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test("");
    a21.test(10L);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test429"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test(1);
    b0.test(10);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test430"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1.0d));
    a21.test(10);
    a21.test((byte)0);
    a21.test(10.0f);
    a21.test((short)222);
    a21.test(222L);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test431"); }


    randoop.literals.A2 a21 = new randoop.literals.A2((-1));
    a21.test(222.0d);
    a21.test(' ');
    a21.test((-1L));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test432"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test("");
    b0.test("");
    b0.test("hi!");

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test433"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test('\"');
    a21.test(100);
    a21.test(222.0f);
    a21.test(222.0f);
    a21.test((short)10);
    a21.test(222);
    a21.test(222.0f);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test434"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test(333);
    b0.test("hi!");
    b0.test("");

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test435"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((byte)100);
    a21.test((-1));

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test436"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test((-1));
    b0.test("333");
    b0.test("");
    b0.test("");
    b0.test("");

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test437"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test(1);
    a21.test(10.0d);
    a21.test('\"');

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test438"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test((short)(-1));

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test439"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((byte)0);
    a21.test("");

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test440"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test('#');
    a21.test(' ');
    a21.test('\"');

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test441"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(222L);
    a21.test((short)222);
    a21.test(222);
    a21.test("hi!");

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test442"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test('#');
    a21.test((short)222);
    a21.test(1L);
    a21.test(1.0d);
    a21.test(10);
    a21.test("222");

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test443"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((short)0);
    a21.test('a');
    a21.test(222L);
    a21.test((short)100);

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test444"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test("111");
    a21.test((-1.0d));
    a21.test("222");

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test445"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)100);
    a21.test((byte)1);
    a21.test((-1L));
    a21.test(1);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test446"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((short)10);
    a21.test((-1.0d));

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test447"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test(0.0d);
    a21.test('4');
    a21.test(222);
    a21.test((short)222);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test448"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test(100L);
    a21.test(100.0d);
    a21.test((byte)(-1));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test449"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test((-1.0d));
    a21.test('#');
    a21.test(1);
    a21.test('#');

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test450"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test("222");
    a21.test("222");
    a21.test("111");
    a21.test('#');
    a21.test(10.0f);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test451"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test("333");

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test452"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((-1.0d));
    a21.test((-1.0d));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test453"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test(100L);
    a21.test(1L);
    a21.test(100L);
    a21.test((byte)0);

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test454"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)0);
    a21.test((short)100);
    a21.test((short)1);
    a21.test((short)(-1));
    a21.test(1.0d);
    a21.test(100L);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test455"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test(1.0f);
    a21.test((short)100);
    a21.test(100);
    a21.test("222");
    a21.test((short)0);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test456"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test((short)100);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test457"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test(0L);
    a21.test(100.0d);
    a21.test((short)10);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test458"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((short)0);
    a21.test(10);
    a21.test(100.0d);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test459"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test(100.0f);
    a21.test((byte)1);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test460"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test(222.0d);
    a21.test((byte)100);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test461"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test(222.0d);
    a21.test('\"');

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test462"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((byte)1);
    a21.test("hi!");
    a21.test((-1.0f));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test463"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test((short)10);
    a21.test((short)100);
    a21.test(222);
    a21.test(10L);
    a21.test("");

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test464"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test(333);
    b0.test("");
    b0.test("");
    b0.test(1);
    b0.test("hi!");

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test465"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test("hi!");
    b0.test("");
    b0.test(10);
    b0.test(0);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test466"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test("");
    a21.test('4');
    a21.test('#');

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test467"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test((byte)22);
    a21.test("111");
    a21.test("hi!");
    a21.test((-1.0d));
    a21.test(' ');
    a21.test("111");
    a21.test((byte)0);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test468"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(0L);
    a21.test(100L);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test469"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((short)100);
    a21.test('a');
    a21.test(10.0f);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test470"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test("");
    b0.test(333);
    b0.test((-1));
    b0.test("hi!");
    b0.test(0);
    b0.test("hi!");
    b0.test(333);
    b0.test(0);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test471"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(222);
    a21.test(0);
    a21.test("");
    a21.test((byte)10);
    a21.test((-1.0d));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test472"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((short)(-1));
    a21.test("");
    a21.test('a');
    a21.test('#');
    a21.test(222L);
    a21.test("hi!");

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test473"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(10);
    a21.test((byte)10);
    a21.test("111");
    a21.test("111");
    a21.test('a');
    a21.test(' ');
    a21.test((byte)0);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test474"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('#');
    a21.test((byte)0);
    a21.test(100.0f);
    a21.test((byte)(-1));
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((short)1);
    a21.test(' ');

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test475"); }


    randoop.literals.A2 a21 = new randoop.literals.A2((-1));
    a21.test(222.0d);
    a21.test(10.0d);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test476"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)0);
    a21.test(100.0d);
    a21.test((byte)(-1));
    a21.test((short)100);
    a21.test((short)(-1));
    a21.test(100.0f);
    a21.test("");

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test477"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(1);
    a21.test('#');
    a21.test('a');
    a21.test((short)100);
    a21.test(111);
    a21.test((short)10);
    a21.test(10.0d);
    a21.test(10L);
    a21.test("");

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test478"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(100);
    a21.test((short)10);
    a21.test('a');
    a21.test(0.0d);
    a21.test((short)0);
    a21.test(10L);
    a21.test(1L);
    a21.test((short)0);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test479"); }


    randoop.literals.B b0 = new randoop.literals.B();
    b0.test(333);
    b0.test(100);
    b0.test("333");
    b0.test(1);
    b0.test(10);
    b0.test(1);
    b0.test("hi!");
    b0.test("hi!");

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","LiteralsReg0.test480"); }


    randoop.literals.A2 a21 = new randoop.literals.A2(100);
    a21.test((short)1);
    a21.test(1.0f);
    a21.test((byte)10);
    a21.test('\"');
    a21.test(' ');
    a21.test(222);
    a21.test("hi!");
    a21.test("111");
    a21.test(10.0f);
    a21.test((byte)22);

  }

}
