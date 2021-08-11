package main.java.patterns.creational.factory;

/**
 * Factory design pattern is used to get the instance of the different sub-classes of parent class by using factory class.
 * Parent can be an interface or class.
 * In normal object creation if we change any name of a class we have to change all the instantiation of that particular class,
 * but if we use factory pattern if we just change in factory class all the instances will be changed.
 *
 * @author sreehari.pullasetty@gmail.com
 * @since 11/08/2021
 */
public class FactoryDemo {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.getInstance("Car", 4);
        Vehicle bike = VehicleFactory.getInstance("Bike", 2);
        Vehicle bus = VehicleFactory.getInstance("Bus", 6);

        System.out.println("Car: " + car.getNumberOfWheels());
        System.out.println("Bike: " + bike.getNumberOfWheels());
        System.out.println("Bus: " + bus.getNumberOfWheels());
    }

}
