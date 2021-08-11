package main.java.patterns.creational.factory;

public class VehicleFactory {

    public static Vehicle getInstance(String vehicleType, int wheelCount) {
        switch (vehicleType) {
            case "Car":
                return new Car(wheelCount);
            case "Bus":
                return new Bus(wheelCount);
            case "Bike":
                return new Bike(wheelCount);
            default:
                return null;
        }
    }
}
