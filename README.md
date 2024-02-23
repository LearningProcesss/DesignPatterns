# Design Pattern

## Tools for your Design Toolbox

### OO Basics

_**Abstraction**_  
_**Encapsulation**_  
_**Polymorphism**_  
_**Inheritance**_  

### OO Principles

_**Encapsulate what varies.**_  
_**Favor composition over inheritance.**_  
_**Program to an interace not implementation.**_  
_**Strive for loosely coupled designs between objects that interact.**_  
_**Classes should be open for extension but closed for modification.**_  
_**Depend on abstractions. Do not depend on concrete classes.**_

### OO Patterns

**Strategy**:  
>Define a family of algorithms, encapsulates each one, and makes them interchargeable. Strategy lets algorithm vary independently from clients that use it.  

**Observer**:  
>The Observer Pattern defines a one-to-many dependency between objects so that  
when one object changes state, al of it's dependents are notified and updated automatically.  

**Decorator**:  
>The Decorator Pattern attaches additional responsabilities to an object dynamically.  
Decorators provide a flexible alternative to subclassing for extending functionality.  

**Factory Method**:
>The Factory Method Pattern defines an interface (abstract or simply a class) for creating objec, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

**Abstract Factory**:
>Provides an interface for creating families of related or dependent objects without specifying ther concrete classes.

**Singleton**:
>Ensures a class has only one instance and provides a global point of access to it.

# List

[Strategy Pattern](src/strategy_pattern/README.md)  
[Observer Pattern](src/observer_pattern/README.md)  
[Decorator Pattern](src/decorator_pattern/README.md)  
[Factory Pattern](src/factory_pattern/README.md)  
[Singleton Pattern](src/singleton_pattern/README.md)
