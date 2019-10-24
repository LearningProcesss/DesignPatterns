package app;

import strategy_pattern.design_refactoring.behavior.concrete.FlyConcreteWings;
import strategy_pattern.design_refactoring.duck.*;
import strategy_pattern.design_refactoring.duck.types.MallardDuck;
import strategy_pattern.design_refactoring.duck.types.RocketDuck;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("******************* Strategy Pattern *******************");
        
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck rocket = new RocketDuck();
        rocket.performFly();
        System.out.println("change behavior runtime!");
        rocket.setFlyBehavior(new FlyConcreteWings());
        rocket.performFly();
    }
}