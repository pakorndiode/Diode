package camt.ch04.lab;

public class Cat {
    private int mood;
    private int hungry;
    private int energy;

    Cat() {}

    Cat(int mood, int hungry, int energy) {
        this.mood = mood;
        this.hungry = hungry;
        this.energy = energy;
    }

    private void meow() {
        System.out.println("Meow!!");
    }

    @Override
    public String toString() {
        return "Mood: " + mood + ", Hungry: " + hungry + ", Energy: " + energy;
    }

    public void sleep() {
        this.energy++;
        this.hungry++;
    }

    public void play() {
        this.mood++;
        this.energy--;
        meow();
    }

    public void feed() {
        this.hungry--;
        this.mood++;
        meow();
    }

}
