
package decorator_pattern.design_problem;

/**
 * Beverage
 */
public abstract class Beverage {

    protected String description;

    protected abstract double cost();
    
    public String getDescription() {
        return this.description;
    }
}