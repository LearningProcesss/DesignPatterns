package strategy_pattern.design_problem;

public abstract class Duck {

    public Duck() {

    }

    public abstract void quack();

    public abstract void fly();

    public abstract void display();

    public void swim()
    {
        System.out.println("Duck superclass swim method!");
    }
}