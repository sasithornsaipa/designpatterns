package csku.abstractfactorypattern;

import csku.models.*;

public abstract class AbstractDuckFactory {
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
}
