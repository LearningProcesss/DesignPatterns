# Design Pattern

## Tools for your Design Toolbox
### OO Basics
**Abstraction**  
**Encapsulation**  
**Polymorphism**  
**Inheritance**  
### OO Principles
**Encapsulate what varies**  
**Favor composition over inheritance**  
**Program to an interace not implementation**  
**Strive for loosely coupled designs between objects that interact**  
### OO Patterns
**Strategy**:
> Define a family of algorithms, encapsulates each one, and makes them interchargeable. Strategy lets algorithm vary independently from clients that use it.
**Observer**
>

# List
[Strategy Pattern](src/strategy_pattern/README.md)  
[Observer Pattern](src/observer_pattern/README.md)  

# Git
git init -> create local repo.
git add . -> add all files added or modified.
git commit -m "first commit" -> create a new commit with message.
git remote add origin https://github.com/LearningProcesss/cppOop.git -> add remote repo to the local.
git push -u origin master -> save commit to the branch.

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