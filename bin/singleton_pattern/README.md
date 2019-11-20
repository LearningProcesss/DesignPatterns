# Singleton Pattern

Is a convention for ensuring one and only one object is instantiated for a given class.  
Many bugs comes from the situation in your code where you have **multiple copies** of objects floating around without **aware** of them.  
This pattern comes in handy to handle thread pool, global resources, connections, all objects that you want to be sure that all class use the same resource.

## Basic Singleton Pattern

```java

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {}

    public static Singleton getInstance() {
        if(uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

```

## Multithreading

### Synchronized

Most expensive.

```java
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
```

### Eagerly

JVM guarantee that instance variable is created before any thread accesses the static getInstance() method.

```java
public class SingletonEagerlyCreated {

    private static SingletonEagerlyCreated instance = new SingletonEagerlyCreated();

    private SingletonEagerlyCreated() {

    }

    public static SingletonEagerlyCreated getInstance() {
        return instance;
    }
}
```

### Double-checked-locking

Safe and lighter than Synchronized.

```java
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
```

## Pattern limit

- Not ideal for subclassing.

## Singleton Pattern definition

Ensures a class has only one instance and provides a global point of access to it.
