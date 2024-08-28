package ParkingLot;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ParkingSpot {

    private Vehicle vehicle;
    private boolean isOccupied;
    //private String type;
    private String Id; // make it id

    public ParkingSpot(String Id, String type) {
        //this.type = type;
        this.vehicle = null;
        this.Id = Id;
        this.isOccupied = false;

    }


    public void parkVehicle(Vehicle vehicle){ // how can i modify this function
        if(!isOccupied) {
            this.vehicle = vehicle;
            //this.type=vehicle.getType();
            this.isOccupied=true;
            System.out.println("Parked Vehicle"); // display
        }
        else {
            System.out.println("Parking spot is Occupied"); // how
        }

    }
    public void unParkVehicle(){
        this.vehicle = null;
        this.isOccupied=false;
        System.out.println("Un parked Vehicle");
    }


}
