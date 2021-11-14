package camt.ch03.lab;

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    
    public double calArea() {
        return Math.mul(getWidth(), getHeight());
    }
}
