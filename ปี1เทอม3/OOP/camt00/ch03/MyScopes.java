package camt.ch03;

public class MyScopes {
    static String root = "I'm available to all lines of code within my context";

    public static void main(String[] args) {
        String spy = "I'm a spy";
        //TODO Remove the curly brackets { and }
        {
            String insideCurlyBrackets="I'm an insider";
            System.out.println(insideCurlyBrackets);
        }
        System.out.println(root);
        System.out.println(spy);
    }
}

