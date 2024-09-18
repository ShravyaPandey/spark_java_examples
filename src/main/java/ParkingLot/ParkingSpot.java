package ParkingLot;

import lombok.Data;

@Data
public class ParkingSpot {

    private Vehicle vehicle;
    private VehicleType type; // make sure to not expose your properties ,
    // keep it private/protected depending upon the use case
    private boolean isOccupied;
    private int Id;

    public ParkingSpot(int Id, VehicleType type) {
        this.type = type;
        this.vehicle = null;
        this.Id = Id;
        this.isOccupied = false;

    }
//todo instead of null use some other type(UNIVERSAL), checking null is not a good practice.
    public void parkVehicle(Vehicle vehicle) {
        if (!isOccupied && (vehicle.getType() == this.type || this.type == VehicleType.UNIVERSAL)) {
            this.vehicle = vehicle;
            this.isOccupied = true;

        }

    }

// todo return false in case you are not implementing anything in else
    public void unParkVehicle() {
        if (isOccupied) {
            this.vehicle = null;
            this.isOccupied = false;
        }


    }


}
