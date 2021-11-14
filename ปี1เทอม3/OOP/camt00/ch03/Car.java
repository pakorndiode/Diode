package camt.ch03;

public class Car {
  // Create a fullThrottle() method
  public void fullThrottle() {
    System.out.println("The car is going as fast as it can!");
  }

  // Create a speed() method and add a parameter
  public void speed(int maxSpeed) {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main, call the methods on the myCar object
  public static void main(String[] args) {
    // TODO: Create a myCar object
    Car mycar = new Car();
    Car mycar2 = new Car();

    // TODO: Call the fullThrottle() method
    mycar.fullThrottle();

    // TODO: Call the speed(200) method
    mycar.speed(200);
    mycar2.speed(400);
    
  }

}