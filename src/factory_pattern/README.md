# Factory Pattern

**Problem**  
Public instantiation with _**new**_ can often lead to _**coupling**_ problem.  
The example below show that you don't know until runtime which concrete class you need to instantiate.  

``` java
Duck duck;

if(picnic) {
    duck = new MallardDuck();
} else if (hunting) {
    duck = new DecoyDuck();
} else if (inBathTub) {
    duck = new RubberDuck();
}
```  

Clearly an example of bad smell code, when it comes for extension or changes you are forced to reopen this code and examine what to add or remove, 
often this kind of code ends up in several parts of the application making maintanance and updates more difficult.  
**CHANGE** and how change impacts our use of _**new**_ is the real culprit.  

- Code written to an interface is _**open to extension**_ (add a new class that implements that interface, thanks to polymorphism) but _**close to modification**_ (no need to modify current code).
- Code written to a lot of concrete class is _**not close to modification**_ beacuase on any change you have to reopen and modify just to add new concrete class.  

## Initial Design Problem  

``` java
Pizza orderPizza() {
    Pizza pizza = new Pizza();

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return  pizza;
}
```

_**Change**_ required, new types of pizza  

``` java
Pizza orderPizza(String type) {
    Pizza pizza;

    if(type.equals("cheese")) {
        pizza = new CheesePizza();
    } else if(type.equals("greek")) {
        pizza = new GreekPizza();
    } else if(type.equals("pepperoni")) {
        pizza = new PepperoniPizza();
    }

    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();

    return  pizza;
}
```

_**Change**_ required, new types of pizza and remove pizzas that are not selling well.  

``` java
Pizza orderPizza(String type) {
    Pizza pizza;

    // Code that varies at any change
    if(type.equals("cheese")) {
        pizza = new CheesePizza();
    }
```

~~else if(type.equals("greek")) {  
        pizza = new GreekPizza();  
}~~

```java
    else if(type.equals("pepperoni")) {
        pizza = new PepperoniPizza();
    }

    //***********************

    // Code that stay the same
    pizza.prepare();
    pizza.bake();
    pizza.cut();
    pizza.box();
    //***********************
    return  pizza;
}
```

This code is _**NOT Closed for modification**_.

## Encapsulating object creation  

**Factories** handle the details of object ceation. Privatizes the concrete instantiations.

``` java
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if(type.equals("veggie")) {
            pizza = new VeggiePizza();
        } else if(type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
```

Since we can have many clients that use createPizza, encapsulating this method in one class,  
we have only one place to do modifications when the implementation changes.

## Pizza Store rework

``` java
public class PizzaStore {

    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza ;
        pizza = this.factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return  pizza;
    }

}
```

## Simple Factory defined

![""](/out/ulm/factory_pattern_simple_factory_defined/Simple_Factory_defined.png)

## Add more factory

``` java
public abstract class PizzaStore {

    // Defined in the abstract class, this method has no
    // idea which subclass is running the code.
    // Since Pizza is abstract too, has no idea of the concrete classes involved.
    // Decoupled!
    public Pizza orderPizza(String type) {

        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return  pizza;

    }

    // Has the responsability for instantiating Pizza.
    // This method act as factory.
    abstract Pizza createPizza(String type);
}
```

Concrete class that implements PizzaStore

``` java
public class NewYorkPizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("cheese")) {
            pizza = new NewYorkStyleCheesePizza();
        } else if(type.equals("veggie")) {
            pizza = new NewYorkStyleVeggiePizza();
        } else if(type.equals("pepperoni")) {
            pizza = new NewYorkStylePepperoniPizza();
        }

        return pizza;
    }

}

public class ChicagoStylePizzaStore extends PizzaStore {

    public Pizza createPizza(String type) {

        Pizza pizza = null;

        if(type.equals("broccoli")) {
            pizza = new ChicagoStyleBroccoliPizza();
        } else if(type.equals("banana")) {
            pizza = new ChicagoStyleBananaPizza();
        } else if(type.equals("strange")) {
            pizza = new ChicagoStyleStrangePizza();
        }

        return pizza;
    }

}

```

## Factory method

A factory method handles object creation and _**encapsulates**_ it in a subclass.  
This _**decouples**_ the **client** code in the superclass from the object creation code in the subclass, because isolates the client (the code in the superclass) from knowing what kind of concrete **Product** is actually created.  
Also, let decide the subclasses what object to create.  

``` java
abstract ProductType factoryMethod(String param);
```

## Factory Method Class diagram

![""](/out/ulm/factory_pattern_factory_method/Factory_Method_Pattern.png)  

## Definition

The Factory Method Pattern defines an interface (abstract or simply a class) for creating objec, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

## Object dependencies

When you directly instantiate object, you are depending on it's concrete class.  
**PizzaStore before Factory Design implementation**:  

```java
public class PizzaStore {
        public Pizza createPizza(String style, String type) {

        Pizza pizza = null;

        if(style.equals("NY")) {
            if(type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if(type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if(type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if(type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if(style.equals("Chicago")) {
            if(type.equals("cheese")) {
                // chicago pizza
            } else if(type.equals("veggie")) {
                // chicago pizza
            } else if(type.equals("clam")) {
                // chicago pizza
            } else if(type.equals("pepperoni")) {
                // chicago pizza
            }
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
```

- PizzaStore **depends** on all pizza objects, because it's creating them directly.
- Because any changes to the concrete implementations of pizzas affects the PizzaStore, PizzaStore **depends on** the pizza implementation. 
- If the implementation of these Pizza classes changes, then we may have to modify in PizzaStore.
- Any new Pizza class create sanother dependency for PizzaStore.  

![""](/out/ulm/factory_inversion1/PizzaStore_very_dependent.png)

## Dependency Inversion Principle

An **high-level component** should not depend on **low-level components**, rather they should both depends on **abstraction**.  
_**high-level component**_:  
>is a class with behavior defined in terms of other, low-level components. Like PizzaStore, it's behavior is defined in terms of pizza.

### Design Principle

>Depend upon astraction. Do note depend upon concrete classes.  

![""](/out/ulm/factory_inversion2/factory_inversion2.png)

Inversion Principle applied using Factory Pattern, invert the dependencies, low-level components now depends on higher level abstraction and high-level component is also tied to the same abstraction.

## Factory for family ingredients

```java
public interface IPizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggie();
    public Pepperoni createPepperoni();
    public Clams createClams();
}

public NewYorkPizzaIngredientFactory implements IPizzaIngredientFactory {
   
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggie[] createVeggie() {
        return new Veggie[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClams() {
        return new FreshClams();
    }
}
```

## Reworking Pizza

```java
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
```

