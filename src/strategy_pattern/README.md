# Strategy Pattern

### Actual Design
Duck is a superclass, it takes care of the implementation of quack() and swim() methods, because all duck types can swim and can quack and any subtype will inherit.  
The display() method is abstract since all duck types look different,
each duck subtype is responsible for implementing it's own display behavior.  
![](/out/ulm/strategy_initial/initial_design.png)  
### Problem
After a while a new **feature** (change) is required: fly.  
Duck superclass, now has a new fly() method, since all duck can fly, will take care of the implementation also.  
But, not all duck subtype should fly, adding this method to the superclass we have a behavior that is not appropriate for some Duck subtype.  Also a RubberDuck dont quack but squeak.  
A great use of **inheritance** for the purpose of **reuse** hasn't turned out so well when it comes to **maintanance**.
![](/out/ulm/startegy_design_problem1/strategy_p1.png)  
### Possible solution 1 (Inheritance)
Always override a superclass method in a subtype class.  
**Problems?**  
Any subtype class must obverride any single method to do nothing.  
For any new subtype, fly() and quack() methods must be will be addedoverride forever.
![](/out/ulm/startegy_p2/Inheritance.png)
### Possible solution 2 (Interface)
Extract fly() and quack() methods to interface.  
**Problems?**  
Duplicate code.  
Destroyed code reuse for behaviors fly and quack.  
A little change in fly behavior in all X subtype.
![](/out/ulm/strategy_p3/Interface.png)
### Design Principle 1
> Identify the aspect of your application that vary and separate them from what stays the same.
Take what varies and ecapsulate it so it won't affect the rest of your code.
## Re-Design
**Separating what changes from what stays the same.**  
fly() and quack() are the parts that vary in any subtype, so they must be extract and take apart in a set of classes, that represent each behavior.  

```java
interface IFlyBehavior {
    public void fly();
}

class FlyWithWings implements IFlyBehavior {
    public void fly() {
        // implement
    }
}

class FlyNoWay implements IFlyBehavior {
    public void fly() {
        // do nothing, cant fly!
    }
}

interface IQuackBehavior {
    public void quack();
}

class Quack implements IQuackBehavior {
    public void quack() {
        // implement
    }
}

class Squeak implements IQuackBehavior {
    public void quack() {
        // implement
    }
}

class MuteQuack implements IQuackBehavior {
    public void quack() {
        // do nothing,  cant quack!
    }
}
```
- With this design is possible to add new **behaviors** without modifyng any of existing behavior class or touch an of Duck's classes that use this **behaviors**.  
- Other types of objects can **resuse** fly and quack **behaviors** because these are no longer hidden away in our Duck classes.  

```java
abstract class Duck {
    protected IFlyBehavior flyBehavior;
    protected IQUackBehavior quackBehavior;

    public void performQuack() {
        this.quackBehavior.quack();
    }
    
    public void performFly() {
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(IFlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(IQuackBehavior qb) {
        this.quackBehavior = qb;
    }

    abstract void display();
}

class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        //...
    }
}

Duck mallardDuck = new MallardDuck();
mallardDuck.performFly();
// output
mallardDuck.performQuack();
// output
mallardDuck.setFlyBehavior(new RocketFlyBehavior());
mallardDuck.performFly();
// NEW output
```
- With this design is possible to change a **behavior** at _**runtime**_.  

### Design Principle 2
> Program to am interface, not an implementation.  
Program to a **supertype** so that the actual runtime object insn't locked into the code.  
**supertype**: the declared type of the variables should be a supertype, an abstract class or interface, so that the objects assigned to those variables can be any concrete implementation of the supertype, witch means the class declaring them doesn't know about the actual object types.  
```java
Animal a = new Dog(); 
a.bark();
a = getAnimal(); 
a.makeSound();
```
### HAS-A is better than IS-A
Each duck as Fly and Quack behavior to which it delegates flying and quacking.  
This is object **Composition**.  
Instead of inheriting their behavior, ducks get their behavior being composed.  
**Object Composition** gives:
- more flexibility.
- let you encapsulate a family of algorithms in their own set of classes.
- let you change behavior at runtime, we can swap in and out implementations.  

### Design Principle 3
>Favor composition over inheritance.
### Definition
>Strategy Pattern define a family of algorithms, encapsulates each one, and makes them interchargeable.  
Strategy lets algorithm vary independently from clients that use it.
### Design Schema
![](/out/ulm/test/test.png)
### Pattern Problem?
**ANY** object could implement the xxxBehavior **Interface**. Say aPaperclip, a tube of toothpaste, or a mutated sea bass.  

