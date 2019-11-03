package factory_pattern.factory_method.ConcreteStore;

import factory_pattern.factory_method.Pizza;
import factory_pattern.factory_method.PizzaStore;
import factory_pattern.factory_method.ConcretePizza.ChicagoStyleBroccoliPizza;

public class ChicagoPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("broccoli")) {
            pizza = new ChicagoStyleBroccoliPizza();
        }
        //  else if(type.equals("veggie")) {
        //     pizza = new NewYorkStyleVeggiePizza();
        // } else if(type.equals("pepperoni")) {
        //     pizza = new NewYorkStylePepperoniPizza();
        // }

        return pizza;
    }

}