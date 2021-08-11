package main.java.patterns.creational.factory;

public class Car implements Vehicle {
    private int wheels;

    Car(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return this.wheels;
    }
}
