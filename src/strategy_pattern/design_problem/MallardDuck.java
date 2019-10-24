package strategy_pattern.design_problem;

/**
 * MallardDuck
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        super();
    }

    @Override
    public void quack() {
        System.out.println(String.format("%s class implements quack()", this.getClass().getSimpleName()));
    }

    @Override
    public void fly() {
        System.out.println(String.format("%s class implements fly()", this.getClass().getSimpleName()));

    }

    @Override
    public void display() {
        System.out.println(String.format("%s class implements display()", this.getClass().getSimpleName()));
    }
}