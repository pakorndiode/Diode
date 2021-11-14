package camt.ch04.lab;

import java.util.Random;

public class CatRun {
    public static void main(String [] args) {
        final int NUM_CAT = 3;
        Cat [] cats = new Cat[NUM_CAT];
        for (int i=0; i<NUM_CAT; i++) {
            cats[i] = new Cat();
        }
        Random rand = new Random();
        for (int j=0; j<20; j++) {
            for (int i=0; i<NUM_CAT; i++) {
                Cat cat = cats[i];
                int n = rand.nextInt() % 3;
                if (n == 0) {
                    cat.play();
                } else if (n == 1) {
                    cat.feed();
                } else {
                    cat.sleep();
                }
            }
        }
        for (int i=0; i<NUM_CAT; i++) {
            System.out.println(cats[i]);
        }
    }
}
