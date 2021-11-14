package camt.ch03;

import camt.ch03.lab.Circle;
import camt.ch03.lab.Rectangle;
import camt.ch03.lab.Triangle;

import java.util.Scanner;

public class LabTest {
    public void start() {
        Scanner in = new Scanner(System.in);

        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.print("Please select [1-3]: ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.print("Enter the radius: ");
            double radius = in.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("The circle area is : " + circle.calArea());
        } else if (choice == 2) {
            System.out.print("Enter the width: ");
            double width = in.nextDouble();
            System.out.print("Enter the height: ");
            double height = in.nextDouble();
            Rectangle rectangle = new Rectangle(width, height);
            System.out.println("The circle area is : " + rectangle.calArea());
        } else if (choice == 3) {
            System.out.print("Enter the base: ");
            double base = in.nextDouble();
            System.out.print("Enter the height: ");
            double height = in.nextDouble();
            Triangle triangle = new Triangle(base, height);
            System.out.println("The circle area is : " + triangle.calArea());
        }

        in.close();
    }
}
