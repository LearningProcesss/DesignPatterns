
package decorator_pattern.design_refactoring.beverages;

import decorator_pattern.design_refactoring.Beverage;

/**
 * Espresso
 */
public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}