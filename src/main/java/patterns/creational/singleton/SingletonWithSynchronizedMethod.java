package main.java.patterns.creational.singleton;

import java.util.Objects;

public class SingletonWithSynchronizedMethod {
    private static SingletonWithSynchronizedMethod instance;

    private SingletonWithSynchronizedMethod() {
    }

    public static synchronized SingletonWithSynchronizedMethod getInstance() throws InterruptedException {
        if (Objects.isNull(instance)) {
            instance = new SingletonWithSynchronizedMethod();
        }
        return instance;
    }
}
