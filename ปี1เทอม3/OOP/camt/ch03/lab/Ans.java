package camt.ch03.lab;

public class Ans {
    public static void main(String [] args) {
        Student s = new Student("xyz");
        Student a = new Student();

        System.out.println(s.name);
        System.out.println(a.name);

        Circle c = new Circle(5);
        c.calArea();
    }
}
