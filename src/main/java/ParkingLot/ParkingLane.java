package ParkingLot;
import lombok.Getter;
import java.util.HashMap;
import java.util.Map;
@Getter
// voilates liskov's
public class ParkingLane {

    private Integer laneId;
    private Map<Integer, ParkingSpot> lane;
    public ParkingLane(Integer laneId) {
        this.laneId = laneId;
        this.lane = new HashMap<>();
        //System.out.println(laneId+ ":" +lane.size());

    }

    public void addSpot(int Id, VehicleType type) {
        lane.put(Id, new ParkingSpot(Id, type));
        //System.out.println(this.laneId+ ":"+lane.size());
    }

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
