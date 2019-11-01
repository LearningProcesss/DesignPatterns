# Decorator Pattern

### Problem
**cost** method in the super class **Beverage** is abstract, any subclass must define it's own implementation.  
Price changes for condiments will force us to alter existing code. 
"**Class explosion**", because a new subclass must be created for any combination of condiment and beverage.
![](/out/ulm/decorator_pattern_init_problem/init.jpg)
### Design Principle
> Class should be open for extension, but closed for modification. (Open-Closed Principle)  
### Design Schema
![](/out/ulm/decorator_pattern_defined/Decorator_Pattern_defined.png)
### Class Diagram
![](/out/ulm/decorator_pattern_class_diagram/Decorator_Pattern_class_diagram.png)
### Definition
>The Decorator Pattern attaches additional responsabilities to an object dynamically.  
Decorators provide a flexible alternative to subclassing for extending functionality.
### Pattern Problem?
