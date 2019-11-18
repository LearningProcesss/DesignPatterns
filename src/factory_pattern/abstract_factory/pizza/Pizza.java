package factory_pattern.abstract_factory.pizza;

import factory_pattern.abstract_factory.ingredients.interfaces.ICheese;
import factory_pattern.abstract_factory.ingredients.interfaces.IClams;
import factory_pattern.abstract_factory.ingredients.interfaces.IDough;
import factory_pattern.abstract_factory.ingredients.interfaces.IPepperoni;
import factory_pattern.abstract_factory.ingredients.interfaces.ISauce;
import factory_pattern.abstract_factory.ingredients.interfaces.IVeggie;

public abstract class Pizza {
    
    protected String name;

    protected IDough dough;

    protected ICheese cheese;

    protected IVeggie veggies[];

    protected ISauce sauce;

    protected IPepperoni pepperoni;

    protected IClams clams;

    public void bake() {
        System.out.println("Bake");
    }

    public void cut() {

    }

    public void box() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void prepare();
}