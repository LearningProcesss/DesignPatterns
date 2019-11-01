package decorator_pattern.design_refactoring.beverages;

import decorator_pattern.design_refactoring.Beverage;

/**
 * HouseBlend
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    public double cost() {
        return 0.89;
    }

    
}