package decorator_pattern.design_refactoring.beverages;

import decorator_pattern.design_refactoring.Beverage;

/**
 * HouseBlend
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    public double cost() {
        return 0.99;
    }
}