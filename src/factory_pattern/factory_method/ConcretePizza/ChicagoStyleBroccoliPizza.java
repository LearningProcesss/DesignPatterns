package factory_pattern.factory_method.ConcretePizza;

import factory_pattern.factory_method.Pizza;

/**
 * ChicagoStyleBroccoliPizza
 */
public class ChicagoStyleBroccoliPizza extends Pizza {

    public ChicagoStyleBroccoliPizza() {
        this.name = "Chicago Broccoli pizza";
        this.dough = "Thin solid crunch";
        this.sauce = "sauce";
        this.toppings.add("broccoli");
    }

}