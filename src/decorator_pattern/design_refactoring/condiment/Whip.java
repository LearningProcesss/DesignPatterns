package decorator_pattern.design_refactoring.condiment;

import decorator_pattern.design_refactoring.Beverage;

/**
 * Whip
 */
public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }
    
    public String getDescription() {
        return this.beverage.getDescription() + ", Whip";
    }

    
    public double cost() {
        return this.beverage.cost() + .10;
    }

     
}