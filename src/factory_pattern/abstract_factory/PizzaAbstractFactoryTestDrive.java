package factory_pattern.abstract_factory;

import factory_pattern.abstract_factory.pizza.Pizza;
import factory_pattern.abstract_factory.store.PizzaStore;
import factory_pattern.abstract_factory.store.concrete.NewYorkPizzaStore;

/**
 * PizzaAbstractFactoryTestDrive
 */
public class PizzaAbstractFactoryTestDrive {

    public static  void run() {

        PizzaStore pizzaStore = new NewYorkPizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
    }
    
}