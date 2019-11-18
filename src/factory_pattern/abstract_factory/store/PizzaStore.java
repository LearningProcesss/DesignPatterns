package factory_pattern.abstract_factory.store;
import factory_pattern.abstract_factory.pizza.Pizza;

/**
 * PizzaStore
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return  pizza;

    }

    protected abstract Pizza createPizza(String type);

}