package decorator_pattern.design_refactoring.condiment;

import decorator_pattern.design_refactoring.Beverage;

/**
 * Mocha
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    
    public double cost() {
        return this.beverage.cost() + .20;
    }

     
}