package camt.ch05.inf;

class Demo implements MyInterface {
  /*
   * This class must have to implement both the abstract methods else you will get
   * compilation error
   */
  public void method1() {
    System.out.println("implementation of method1");
  }

  public void method2() {
    System.out.println("implementation of method2");
  }

  public static void main(String arg[]) {
    MyInterface obj = new Demo();
    obj.method1();
  }
}