package factory_pattern.factory_method.ConcretePizza;

import factory_pattern.factory_method.Pizza;

/**
 * NewYorkStyleCheesePizza
 */
public class NewYorkStyleCheesePizza extends Pizza {
    
    public NewYorkStyleCheesePizza() {
        this.name = "New York style sauce and cheese pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "MArinara Sauce";
        this.toppings.add("Grated Reggiano cheese");
    }
    
}