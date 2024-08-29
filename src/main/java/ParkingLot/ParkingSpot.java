package ParkingLot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkingSpot {

    private Vehicle vehicle;
    VehicleType type;
    private boolean isOccupied;
    private int Id;

    public ParkingSpot(int Id, VehicleType type) {
        this.type = type;
        this.vehicle = null;
        this.Id = Id;
        this.isOccupied = false;

    }

    public boolean parkVehicle(Vehicle vehicle) {
        if (!isOccupied && (vehicle.getType() == this.type || this.type == null)) {
            this.vehicle = vehicle;
            this.isOccupied = true;
            return true;

        }
        else {
            return false;
        }
    }


    public boolean unParkVehicle() {
        if (isOccupied) {
            this.vehicle = null;
            this.isOccupied = false;
            return true;
        }
        else {
            return false;
        }
    }


}
