package strategy_pattern.design_refactoring.behavior.concrete;

import strategy_pattern.design_refactoring.behavior.interfaces.IFlyBehavior;

/**
 * FlyConcreteRocket
 */
public class FlyConcreteRocket implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println(String.format("%s class implements fly()", this.getClass().getSimpleName()));
    }
}