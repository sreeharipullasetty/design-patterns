package main.java.patterns.creational.factory;

public class Bus implements Vehicle {
    private int wheels;

    Bus(int wheels) {
        this.wheels = wheels;
    }

    @Override
    public int getNumberOfWheels() {
        return this.wheels;
    }
}
