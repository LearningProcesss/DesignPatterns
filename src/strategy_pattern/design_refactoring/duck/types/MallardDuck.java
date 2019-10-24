package strategy_pattern.design_refactoring.duck.types;

import strategy_pattern.design_refactoring.behavior.concrete.FlyConcreteWings;
import strategy_pattern.design_refactoring.behavior.concrete.QuackConcreteNormal;
import strategy_pattern.design_refactoring.duck.Duck;

/**
 * MallardDuck
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyConcreteWings();
        this.quackBehavior = new QuackConcreteNormal();
    }

    @Override
    public void display() {

    }
}