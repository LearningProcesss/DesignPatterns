
package factory_pattern.factory_method;

import java.util.ArrayList;
import java.util.List;

/**
 * Pizza
 */
public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String sauce;

    protected List<String> toppings = new ArrayList<String>();

    void prepare() {
        System.out.println(String.format("Preparing %s", this.name));
        System.out.println("Tossing dough..");
        System.out.println("Adding sauce..");
        System.out.println("Adding toppings:");

        this.toppings.forEach(topping -> System.out.println(String.format("      %s", topping)));
    }

    void bake() {
        System.out.println("Bake fro 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return this.name;
    }

}