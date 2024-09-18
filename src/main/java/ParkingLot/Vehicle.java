package ParkingLot;

import lombok.Data;
@Data
// todo : find out the annotation which consist all three ?
// vehicle abstract class :: enum
public abstract class Vehicle {

    private VehicleType type;
    private String vehicleNo;
    private String color;

// todo : remove the constructor , not required in abtract class
    // use abtract class in a proper way to utilize inheritance
    // mandatory properties are defined through constructor
    // todo :: define some methods in this class and implement in subclass
    // todo ::introduce class in between vehicle - car/bike/truck
    /*public Vehicle(VehicleType type, String vehicleNo, String color) {
        this.type = type;
        this.vehicleNo = vehicleNo;
        this.color = color;
    }*/
    public abstract int maxNumberOfPeople();


}
