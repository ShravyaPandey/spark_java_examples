package ParkingLot;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ParkingFloor {
    private String floorId;
    private Map<String, ParkingLane> floor;

    public ParkingFloor(String floorId) {
        this.floorId = floorId;
        this.floor = new HashMap<>();
    }

    public void addLane(ParkingLane lane) {
        floor.put(lane.getLaneId() + "", lane);
    }

    public ParkingLane getLane(Integer laneId) {
        return floor.get(laneId + "");

    }

    public int getFreeCount() {
        int totalFree = 0;
        for (ParkingLane lane : floor.values()) {
            totalFree += lane.getFreeCount();
        }
        return totalFree;

    }

    public int getOccupiedCount() {
        int occupiedCount = 0;
        for (ParkingLane lane : floor.values()) {
            occupiedCount += lane.getOccupiedCount();
        }
        return occupiedCount;


    }


}

