package decorator_pattern.design_refactoring.beverages;

import decorator_pattern.design_refactoring.Beverage;

/**
 * Decaf
 */
public class Decaf extends Beverage {

    public Decaf() {
        this.description = "Decaf";
    }

    public double cost() {
        return 1.05;
    }

    
}