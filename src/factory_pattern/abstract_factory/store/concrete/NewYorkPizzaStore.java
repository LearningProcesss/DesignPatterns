package factory_pattern.abstract_factory.store.concrete;

import factory_pattern.abstract_factory.factory.IPizzaIngredientFactory;
import factory_pattern.abstract_factory.factory_concrete.NewYorkPizzaIngredientFactory;
import factory_pattern.abstract_factory.pizza.Pizza;
import factory_pattern.abstract_factory.pizza.concrete.CheesePizza;
import factory_pattern.abstract_factory.store.PizzaStore;

/**
 * NewYorkPizzaStore
 */
public class NewYorkPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;

        IPizzaIngredientFactory ingredientFactory = new NewYorkPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (type.equals("cheese")) {

        } else if (type.equals("cheese")) {

        }

        return pizza;

    }

}