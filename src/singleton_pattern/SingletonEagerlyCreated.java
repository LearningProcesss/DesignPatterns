package singleton_pattern;

/**
 * SingletonEagerlyCreated
 */
public class SingletonEagerlyCreated {

    private static SingletonEagerlyCreated instance = new SingletonEagerlyCreated();

    private SingletonEagerlyCreated() {

    }

    public static SingletonEagerlyCreated getInstance() {
        return instance;
    }
}