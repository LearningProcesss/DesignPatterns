package singleton_pattern;

/**
 * SingletonSynchronized
 */
public class SingletonSynchronized {

    private static SingletonSynchronized instance;

    private SingletonSynchronized() {
    }

    public synchronized static SingletonSynchronized getInstance() {

        if(instance == null) {
            instance = new SingletonSynchronized();
        }

        return instance;
    }
}