package camt.ch03.lab;

public class Car {
    String brand;

    Car() {
        brand = "Ford";
    }

    String getBrand() {
        return brand;
    }

    void run() {
        System.out.println("Car is running...");
    }
}
