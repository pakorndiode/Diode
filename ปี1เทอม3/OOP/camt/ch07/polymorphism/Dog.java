package camt.ch07.polymorphism;

public class Dog extends Animal {
  @Override
  public void animalSound() {
    System.out.println("Woof");
  }
}