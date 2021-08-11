package main.java.patterns.creational.builder;

/**
 * 1.   It is a creational design pattern
 * 2.   When we have too many argumants to send to constructor it is hard to maintain the order of arguments.
 * 3.   When we do not want to send all arguments while creating the object (Generally we pass null values to send optional params)
 *
 * @author sreehari.pullasetty@gmail.com
 * @since 11/08/2021
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Vehicle bike = new Vehicle.VehicleBuilder("type1", 2).build();
        Vehicle hundai = new Vehicle.VehicleBuilder("type2", 4)
                .setAirBags(2)
                .setOpenRoof(true)
                .build();
        Vehicle honda = new Vehicle.VehicleBuilder("type3", 4).setAirBags(6).setOpenRoof(true).build();

        System.out.println(bike.isOpenRoof() + " " + bike.getAirBags());
        System.out.println(hundai.isOpenRoof() + " " + hundai.getAirBags());
        System.out.println(honda.isOpenRoof() + " " + honda.getAirBags());

    }
}
