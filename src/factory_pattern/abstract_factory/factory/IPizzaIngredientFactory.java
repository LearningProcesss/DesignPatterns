package factory_pattern.abstract_factory.factory;

import factory_pattern.abstract_factory.ingredients.interfaces.ICheese;
import factory_pattern.abstract_factory.ingredients.interfaces.IClams;
import factory_pattern.abstract_factory.ingredients.interfaces.IDough;
import factory_pattern.abstract_factory.ingredients.interfaces.IPepperoni;
import factory_pattern.abstract_factory.ingredients.interfaces.ISauce;
import factory_pattern.abstract_factory.ingredients.interfaces.IVeggie;

public interface IPizzaIngredientFactory {

    public IDough createDough();

    public ISauce createSauce();

    public ICheese createCheese();

    public IVeggie[] createVeggie();

    public IPepperoni createPepperoni();

    public IClams createClams();

}