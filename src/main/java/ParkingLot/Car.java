package ParkingLot;

public class Car extends Vehicle {
    private VehicleType type;
    private String vehicleNo;
    private String color;
    public Car(VehicleType type, String vehicleNo, String color) {
        this.type = type;
        this.vehicleNo = vehicleNo;
        this.color = color;
    }

    @Override
    public int maxNumberOfPeople() {
        return 4;
    }
}
