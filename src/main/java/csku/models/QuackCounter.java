package csku.models;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numOfQuacks;

    public QuackCounter(Quackable duck){
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        if (duck.getClass().getName().contains("Duck")){
            numOfQuacks++;
        }
    }

    public static int getQuacks() {
        return numOfQuacks;
    }
}
