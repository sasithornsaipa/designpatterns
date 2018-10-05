package csku.adapterpattern;

public class DuckSimulator {
    public static void main(String[] args){
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate(){
        Quackable mallardDuck = new MallardDuck();
        Quackable redHeadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck Simulator");
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(rubberDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
