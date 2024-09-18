package ParkingLot;

public class Truck extends TransportVehicle {
    private VehicleType type;
    private String vehicleNo;
    private String color;
    private int numberOfWheels;
    public Truck(VehicleType type, String vehicleNo, String color) {

        this.type = type;
        this.vehicleNo = vehicleNo;
        this.color = color;
    }

    @Override
    public int loadCapacity() {
        return numberOfWheels*10;
    }

    @Override
    public int maxNumberOfPeople() {
        return numberOfWheels*2;
    }
}

