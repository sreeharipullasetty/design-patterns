package main.java.patterns.creational.singleton;

import java.util.Objects;

public class SingletonWithSynchronizedBlock {

    private static SingletonWithSynchronizedBlock instance;

    private SingletonWithSynchronizedBlock() {
    }

    public static SingletonWithSynchronizedBlock getInstance() {
        if (Objects.isNull(instance)) {
            synchronized (SingletonWithSynchronizedBlock.class) {
                instance = new SingletonWithSynchronizedBlock();
            }
        }
        return instance;
    }
}
