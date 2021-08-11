package main.java.patterns.creational.factory;

public class Bike implements Vehicle {
    private int wheels;

    Bike(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return this.wheels;
    }
}
