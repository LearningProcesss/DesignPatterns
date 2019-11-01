package decorator_pattern.design_refactoring.condiment;

import decorator_pattern.design_refactoring.Beverage;

abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return this.beverage.getSize();
    }
    
}