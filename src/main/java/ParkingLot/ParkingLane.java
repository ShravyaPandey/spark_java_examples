package ParkingLot;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

// voilates liskov's
public class ParkingLane {

    int laneId;
    private Map<Integer, ParkingSpot> lane= new HashMap<>();;

    public ParkingLane(int NumberOfSpotPerLane) {


        for (int i = 1; i <= NumberOfSpotPerLane; i++) {
            if (i == 1) {
                lane.put(i, new ParkingSpot(i + "", "Bike"));
            } else if (i == 2 || i == 3) {
                lane.put(i, new ParkingSpot(i + "", "Truck"));
            } else {
                lane.put(i, new ParkingSpot(i + "", "Car"));
            }
        }
    }


}
