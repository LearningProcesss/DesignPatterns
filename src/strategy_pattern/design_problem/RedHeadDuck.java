package strategy_pattern.design_problem;

/**
 * RedHeadDuck
 */
public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
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