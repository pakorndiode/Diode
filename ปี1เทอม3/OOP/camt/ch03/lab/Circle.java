package camt.ch03.lab;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        setRadius(radius);
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double calArea() {
        return Math.mul(Math.PI, Math.mul(getRadius(), getRadius()));
    }
}
