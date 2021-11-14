package camt.ch05.lab;

public class Circle {
    double radius;

    double calArea() {
        return Math.mul(Math.PI, Math.mul(this.radius, this.radius));
    }
}
