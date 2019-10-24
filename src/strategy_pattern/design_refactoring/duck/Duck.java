package strategy_pattern.design_refactoring.duck;

import strategy_pattern.design_refactoring.behavior.interfaces.IFlyBehavior;
import strategy_pattern.design_refactoring.behavior.interfaces.IQuackBehavior;

/**
 * Duck
 */
public abstract class Duck {

    protected IFlyBehavior flyBehavior;
    
    protected IQuackBehavior quackBehavior;

    public void setFlyBehavior(IFlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        this.quackBehavior = qb;
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }

    public void performFly() {
        this.flyBehavior.fly();
    }

    public abstract void display();
}