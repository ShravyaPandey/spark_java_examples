package ParkingLot;
import lombok.Data;
import java.util.HashMap;
import java.util.Map;
@Data
// voilates liskov's
public class ParkingLane {

    private Integer laneId;
    private Map<Integer, ParkingSpot> lane;
    public ParkingLane(Integer laneId, int numberOfSpots) {
        this.laneId = laneId;
        this.lane = new HashMap<>();
        for(int i=1; i<=numberOfSpots;i++){
            ParkingSpot spot =new ParkingSpot(i,VehicleType.UNIVERSAL);
            lane.put(i,spot);

        }
        //System.out.println(laneId+ ":" +lane.size());

    }
    public void changeType(VehicleType newVehicleType, int spotId) {
        ParkingSpot spot = lane.get(spotId);
        if(spot!=null){
            spot.setType(newVehicleType);
        }
    }
// todo :: lane will be fixed, its type can vary, make a utility for that.Create a algo
 /*   public void addSpot(int Id, VehicleType type) {
        lane.put(Id, new ParkingSpot(Id, type));
        //System.out.println(this.laneId+ ":"+lane.size());
    }
*/
    public ParkingSpot getSpot(int Id) {
        return lane.get(Id);
    }

    public int getFreeCount() {
        int freeCount = 0;
        for (ParkingSpot spot : lane.values()) {
            if (!spot.isOccupied())
                freeCount++;
        }
        return freeCount;
    }

    public int getOccupiedCount() {
        return lane.size() - getFreeCount();
    }

}
