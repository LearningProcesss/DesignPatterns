package factory_pattern.abstract_factory.pizza.concrete;

import factory_pattern.abstract_factory.factory.IPizzaIngredientFactory;
import factory_pattern.abstract_factory.pizza.Pizza;

/**
 * CheesePizza
 */
public class CheesePizza extends Pizza {

    private IPizzaIngredientFactory ingredientFactory;

    public CheesePizza(IPizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println(String.format("Preparing: %s", this.name));
        this.dough = this.ingredientFactory.createDough();
        this.cheese = this.ingredientFactory.createCheese();
        this.clams = this.ingredientFactory.createClams();
        this.pepperoni = this.ingredientFactory.createPepperoni();
        this.sauce = this.ingredientFactory.createSauce();
        this.veggies = this.ingredientFactory.createVeggie();
    }

}