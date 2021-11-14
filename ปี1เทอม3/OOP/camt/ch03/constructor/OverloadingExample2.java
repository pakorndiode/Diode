package camt.ch03.constructor;

public class OverloadingExample2 {
  int rollNum;
  OverloadingExample2() {
    rollNum = 100;
  }
  OverloadingExample2(int rnum) {
    this();
    /*
     * this() is used for calling the default constructor from parameterized
     * constructor. It should always be the first statement inside constructor body.
     */
    rollNum = rollNum + rnum;
  }
  public static void main(String args[]) {
    OverloadingExample2 obj = new OverloadingExample2(12);
    System.out.println(obj.rollNum);
  }
}