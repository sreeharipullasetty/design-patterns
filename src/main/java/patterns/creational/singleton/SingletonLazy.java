package main.java.patterns.creational.singleton;

import java.util.Objects;

public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy(){}

    public static SingletonLazy getInstance() {
        if (Objects.isNull(instance)) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
