package camt.ch03.lab;

public class Triangle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        setBase(base);
        setHeight(height);
    }

    public double calArea() {
        return Math.mul(Math.mul(getBase(), getHeight()), 0.5);
    }
}
