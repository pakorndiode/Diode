package camt.ch04.access_modifiers.xyzpackage;

import camt.ch04.access_modifiers.abcpackage.*;

public class Test02 extends Addition02 {
  public static void main(String args[]) {
    Addition02 obj = new Addition02();
    //obj.addTwoNumbers(10, 21); // error
  }
}
