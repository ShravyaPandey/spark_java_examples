package ParkingLot;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter
public class ParkingSystem {

    private String ParkingLotId;
    Map<String, ParkingFloor> parkingLot;

    public ParkingSystem(String ParkingLotId) {
        this.ParkingLotId = ParkingLotId;
        parkingLot = new HashMap<>();
    }

    public void addFloor(ParkingFloor floor) {
        parkingLot.put(floor.getFloorId(), floor);
    }

    public ParkingFloor getFloor(String floorId) {
        return parkingLot.get(floorId);
    }

    public int getFreeCount() {
        int totalFree = 0;
        for (ParkingFloor floor : parkingLot.values()) {
            totalFree += floor.getFreeCount();
        }
        return totalFree;
    }

    public int getOccupiedCount() {
        int occupiedCount = 0;
        for (ParkingFloor floor : parkingLot.values()) {
            occupiedCount += floor.getOccupiedCount();
        }
        return occupiedCount;
    }

}
