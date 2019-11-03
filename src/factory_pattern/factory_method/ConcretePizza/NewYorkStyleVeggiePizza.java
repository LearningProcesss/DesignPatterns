package factory_pattern.factory_method.ConcretePizza;

import factory_pattern.factory_method.Pizza;

/**
 * NewYorkStyleVeggiePizza
 */
public class NewYorkStyleVeggiePizza extends Pizza {

    public NewYorkStyleVeggiePizza() {
        this.name = "New York style sauce and veggie pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("onions");
    }
    
}