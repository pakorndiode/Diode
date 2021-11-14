package camt.ch07.overriding;

public class MyChildClass extends MyBaseClass {
//  protected static void disp() {
//    System.out.println("Child class method");
//  }

  public static void main(String args[]) {
    MyChildClass obj = new MyChildClass();
    obj.disp();
  }
}