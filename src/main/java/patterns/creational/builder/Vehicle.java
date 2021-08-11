package main.java.patterns.creational.builder;

public class Vehicle {

    //Required parameters to create vehicle object
    private String engineType;
    private int wheelCount;

    //Optional parameters for the vehicle object
    private int airBags;
    private boolean isOpenRoof;

    public String getEngineType() {
        return engineType;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public int getAirBags() {
        return airBags;
    }

    public boolean isOpenRoof() {
        return isOpenRoof;
    }

    private Vehicle(VehicleBuilder vehicleBuilder) {
        this.engineType = vehicleBuilder.engineType;
        this.wheelCount = vehicleBuilder.wheelCount;
        this.airBags = vehicleBuilder.airBags;
        this.isOpenRoof = vehicleBuilder.isOpenRoof;
    }

    static class VehicleBuilder {
        private String engineType;
        private int wheelCount;

        private int airBags;
        private boolean isOpenRoof;

        public VehicleBuilder(String engineType, int wheelCount) {
            this.engineType = engineType;
            this.wheelCount = wheelCount;
        }

        public VehicleBuilder setAirBags(int airBags) {
            this.airBags = airBags;
            return this;
        }

        public VehicleBuilder setOpenRoof(boolean openRoof) {
            this.isOpenRoof = openRoof;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }
    }
}
