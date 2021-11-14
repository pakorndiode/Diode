package camt.ch05.lab;

import java.util.Scanner;

public class TestRun {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1.Circle");
        System.out.println("2.Rectangle");
        System.out.println("3.Triangle");
        System.out.print("Please select [1-3]: ");
        int choice = in.nextInt();

        if (choice == 1) {
            System.out.print("Enter the radius: ");
            double radius = in.nextDouble();
            Circle circle = new Circle();
            circle.radius = radius;
            System.out.println("The circle area is : " + circle.calArea());
        } else if (choice == 2) {
            System.out.print("Enter the width: ");
            double width = in.nextDouble();
            System.out.print("Enter the height: ");
            double height = in.nextDouble();
            Rectangle rectangle = new Rectangle();
            rectangle.width = width;
            rectangle.height = height;
            System.out.println("The circle area is : " + rectangle.calArea());
        } else if (choice == 3) {
            System.out.print("Enter the base: ");
            double base = in.nextDouble();
            System.out.print("Enter the height: ");
            double height = in.nextDouble();
            Triangle triangle = new Triangle();
            triangle.base = base;
            triangle.height = height;
            System.out.println("The circle area is : " + triangle.calArea());
        }

        in.close();
    }
}
