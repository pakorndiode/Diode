package camt.ch05.lab;

public class Triangle {
    double base;
    double height;

    double calArea() {
        return Math.mul(0.5, Math.mul(this.base, this.height));
    }
}
