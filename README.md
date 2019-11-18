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

# List

[Strategy Pattern](src/strategy_pattern/README.md)  
[Observer Pattern](src/observer_pattern/README.md)  
[Decorator Pattern](src/decorator_pattern/README.md)  
[Factory Pattern](src/factory_pattern/README.md)

# Git

## Start

- git init -> create local repo.  
- git add . -> add all files added or modified.  
- git commit -m "first commit" -> create a new commit with message.  
- git remote add origin https://github.com/LearningProcesss/cppOop.git -> add remote repo to the local.  
- git push -u origin master -> save commit to the branch.  

## Feature branching workflow

**Create new branch from master** 

- `git checkout master`
- `git pull`
- `git checkout -b <feature_branch>`

**Check actual branch** 

- `git branch`

**Check files added or modified** 

- `git status`

**Add files** 

- `git add .`

**Add any numbers of commit**

- `git commit -m "adding a change from the feature branch"`

**Push branch to origin**

- `git push origin <feature_branch>`

**Merge feature_branch in master**

- `git checkout master`
- `git pull`
- `git merge --no-ff <feature_branch>`
- `git push origin master`

**Remove branch?**

- `git branch -d <feature_branch>`
- `git push origin --delete <feature_branch>`