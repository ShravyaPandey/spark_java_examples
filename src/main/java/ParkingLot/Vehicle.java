package ParkingLot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
// vehicle abstract class :: enum
public abstract class Vehicle {

    private VehicleType type;
    private String vehicleNo;
    private String color;


    public Vehicle(VehicleType type, String vehicleNo, String color) {
        this.type = type;
        this.vehicleNo = vehicleNo;
        this.color = color;
    }


}
