package csku.abstractfactorypattern;

import csku.models.*;

public class CountingDuckFactory extends AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
}
