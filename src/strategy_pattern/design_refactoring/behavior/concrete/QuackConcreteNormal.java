package strategy_pattern.design_refactoring.behavior.concrete;

import strategy_pattern.design_refactoring.behavior.interfaces.IQuackBehavior;

/**
 * QuackConcreteNormal
 */
public class QuackConcreteNormal implements IQuackBehavior {

    public QuackConcreteNormal() {

    }

    @Override
    public void quack() {
        System.out.println(String.format("%s class implements quack()", this.getClass().getSimpleName()));
    }
}