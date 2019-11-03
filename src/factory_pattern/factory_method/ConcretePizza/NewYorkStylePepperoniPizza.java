package factory_pattern.factory_method.ConcretePizza;

import factory_pattern.factory_method.Pizza;

/**
 * NewYorkStylePepperoniPizza
 */
public class NewYorkStylePepperoniPizza extends Pizza {

    public NewYorkStylePepperoniPizza() {
        this.name = "New York style sauce and pepperoni pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("pepperoni");
    }

}