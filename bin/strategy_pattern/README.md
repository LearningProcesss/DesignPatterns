# Strategy Pattern

### Actual Design
Duck is a superclass, it takes care of the implementation of quack() and swim() methods, because all duck types can swim and can quack and any subtype will inherit.
The display() method is abstract since all duck types look different,
each duck subtype is responsible for implementing it's own display behavior.
### First problem
After a while a new **feature** (change) is required: fly.
Duck superclass, now has a new fly() method, since all duck can fly will take care of the implementation also.
Not all duck subtype should fly, adding this method to the superclass we have a behavior that is not appropriate for some Duck subtype. Also a RubberDuck dont quack but squeak.
A great use of **inheritance** for the purpose of **reuse** hasn't turned out so well when it comes to **maintanance**.
### Possible solution 1 (Inheritance)
Always override a superclass method in a subtype class, any subtype class must obverride any single method to do nothing.
-> For any new subtype, fly() and quack() methods must be will be addedoverride forever.
### Possible solution 2 (Interface)
Extract fly() and quack() methods to interface.
-> Duplicate code, a little change in fly behavior in all X subtype.
### Design Principle 1
> Identify the aspect of your application that vary and separate them from what stays the same.
Take what varies and ecapsulate it so it won't affect the rest of your code.
## Re-Design
**Separating what changes from what stays the same.**  
fly() and quack() are the parts that vary in any subtype, so they must be extract and take apart in a set of classes, that represent each behavior.
### Design Principle 2
> Program to am interface, not an implementation.
Program to a **supertype** so that the actual runtime object insn't locked into the code.  
**supertype**: the declared type of the variables should be a supertype, an abstract class or interface, so that the objects assigned to those variables can be any concrete implementation of the supertype, witch means the class declaring them doesn't know about the actual object types.  
Es:  
**Animal a = new Dog(); a.bark();**  
or  
**a = getAnimal(); a.makeSound();**  

### HAS-A is better than IS-A
Each duck as Fly and Quack behavior to which it delegates flying and quacking.
This is **Composition**. Instead of inheriting their behavior, ducks get their behavior being composed. Composition gives:
- more flexibility.
- let you encapsulate a family of algorithms in their own set of classes.
- let you change behavior at runtime. 
this is:
### Design Principle 3
>Favor composition over inheritance.
### Definition
Strategy Pattern define a family of algorithms, encapsulates each one, and makes them interchargeable. Strategy lets algorithm vary independently from clients that use it.
### Design Schema
![](/out/ulm/test/test.png)

