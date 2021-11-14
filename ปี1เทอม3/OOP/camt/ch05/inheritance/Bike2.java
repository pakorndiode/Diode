package camt.ch05.inheritance;

public class Bike2 extends Bike {

  public Bike2() {
    System.out.println("Bike2 is created");
  }

  public static void main(String args[]) {
    // calling a default constructor
    Bike2 b = new Bike2();
  }
}