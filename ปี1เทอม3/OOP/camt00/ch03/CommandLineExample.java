package camt.ch03;

import java.util.Scanner;

public class CommandLineExample {
    public void test() {
        Scanner in = new Scanner(System.in);

        System.out.print("Please type a string: ");
        String s = in.nextLine();
        System.out.println("You entered string " + s);

        System.out.print("Please type a int value: ");
        int a = in.nextInt();
        System.out.println("You entered integer " + a);

        System.out.print("Please type a float falue: ");
        float b = in.nextFloat();
        System.out.println("You entered float " + b);

        // closing scanner
        in.close();
    }
}
