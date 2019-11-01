package decorator_pattern.design_refactoring;

/**
 * Beverage
 */
public abstract class Beverage {

    protected enum Size {
        TALL, GRANDE, VENTI
    };

    protected String description = "unknown beverage";

    protected Size size = Size.TALL;

    public String getDescription() {
        return this.description;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public abstract double cost();
}