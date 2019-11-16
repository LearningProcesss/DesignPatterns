package factory_pattern.abstract_factory.factory_concrete;

import factory_pattern.abstract_factory.factory.IPizzaIngredientFactory;
import factory_pattern.abstract_factory.ingredients.concrete.FreshClams;
import factory_pattern.abstract_factory.ingredients.concrete.Garlic;
import factory_pattern.abstract_factory.ingredients.concrete.MarinaraSauce;
import factory_pattern.abstract_factory.ingredients.concrete.Mushrooms;
import factory_pattern.abstract_factory.ingredients.concrete.Onion;
import factory_pattern.abstract_factory.ingredients.concrete.RedPepper;
import factory_pattern.abstract_factory.ingredients.concrete.ReggianoCheese;
import factory_pattern.abstract_factory.ingredients.concrete.SlicedPepperoni;
import factory_pattern.abstract_factory.ingredients.concrete.ThicCrustDough;
import factory_pattern.abstract_factory.ingredients.interfaces.ICheese;
import factory_pattern.abstract_factory.ingredients.interfaces.IClams;
import factory_pattern.abstract_factory.ingredients.interfaces.IDough;
import factory_pattern.abstract_factory.ingredients.interfaces.IPepperoni;
import factory_pattern.abstract_factory.ingredients.interfaces.ISauce;
import factory_pattern.abstract_factory.ingredients.interfaces.IVeggie;

/**
 * NewYorkPizzaIngredientFactory
 */
public class NewYorkPizzaIngredientFactory implements IPizzaIngredientFactory {

    public IDough createDough() {
        return new ThicCrustDough();
    }

    public ISauce createSauce() {
        return new MarinaraSauce();
    }

    public ICheese createCheese() {
        return new ReggianoCheese();
    }

    public IVeggie[] createVeggie() {
        return new IVeggie[] { new Garlic(), new Onion(), new Mushrooms(), new RedPepper() };
    }

    public IPepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public IClams createClams() {
        return new FreshClams();
    }

    
}