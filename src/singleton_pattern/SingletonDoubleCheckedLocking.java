package singleton_pattern;

/**
 * Singleton
 */
public class SingletonDoubleCheckedLocking {

    public volatile static SingletonDoubleCheckedLocking instance;

    private SingletonDoubleCheckedLocking() {

    }

    public static SingletonDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheckedLocking.instance) {
                if (instance == null) {
                    instance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}