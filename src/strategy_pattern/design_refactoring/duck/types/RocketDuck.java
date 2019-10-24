package strategy_pattern.design_refactoring.duck.types;

import strategy_pattern.design_refactoring.behavior.concrete.FlyConcreteRocket;
import strategy_pattern.design_refactoring.behavior.concrete.QuackConcreteSqueak;
import strategy_pattern.design_refactoring.duck.Duck;

/**
 * RocketDuck
 */
public class RocketDuck extends Duck {

    public RocketDuck() {
        this.flyBehavior = new FlyConcreteRocket();
        this.quackBehavior = new QuackConcreteSqueak();
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub

    }

}