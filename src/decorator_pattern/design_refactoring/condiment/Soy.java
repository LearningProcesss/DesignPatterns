package decorator_pattern.design_refactoring.condiment;

import decorator_pattern.design_refactoring.Beverage;

/**
 * Soy
 */
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return this.beverage.cost() + .15;

        // Implementation SIZE cost
        // double cost = this.beverage.cost();
        // if(this.size == Size.TALL) {
        // cost += .10;
        // }
    }

}