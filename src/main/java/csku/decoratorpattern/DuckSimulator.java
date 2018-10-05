package csku.decoratorpattern;

import csku.models.*;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){

        Quackable mallardDuck = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redHeadDuck = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable goose = new QuackCounter(new QuackEcho(new GooseAdapter(new Goose())));
        Quackable pigeon =new QuackCounter(new QuackEcho(new PigeonAdapter(new Pigeon())));

        System.out.println("\nDuck Simulator: With Decorator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
        simulate(goose);
        simulate(pigeon);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
