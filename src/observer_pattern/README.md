# Observer Pattern

### Requirements
![](/out/ulm/observer_pattern_0/spec.png)

### Problem
Coding to concrete implementations, xxxDisplay methods, we have no way  
to add or remove other display elements without making changes to the code.
A common interface for update method.

### The Power of Loose Coupling
Loosely coupled objects can interact, but they have little knowledge about each other.  
Observer Pattern provides an object design where subjects and observer are loosely coupled.  
- **subject** knows, about **observer**, only which interface he implements not the concrete class of the observer.  
- add new **observer** at any time, because **subject** only depends on a list of objects that implements the observer interface.
- no need to modify the **subjec**t to add new type of **observer**.
- reuse of subject and observer indipendently from each other, they aren't tighly coupled.
- changes to either subject or observer will not affect the other. But they still meet the obbligation to implement their subject or observer interface.

### Design Principle 1
> Strive for loosely coupled designs between objects that interact.

### Design Schema
![](/out/ulm/observer_pattern_weather_diagram/observer_pattern_weather_diagram.png)

### Definition
The Observer Pattern defines a one-to-many dependency between objects so that  
when one object changes state, al of it's dependents are notified and updated automatically.