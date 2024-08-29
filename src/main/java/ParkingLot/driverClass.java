package ParkingLot;

public class driverClass {

    public static void main(String[] args) {
        ParkingSystem parkingLot = new ParkingSystem("PR1234");
        ParkingFloor floor1 = new ParkingFloor("Floor1");
        ParkingFloor floor2 = new ParkingFloor("Floor2");
        ParkingLane lane1 = new ParkingLane(1);
        ParkingLane lane2 = new ParkingLane(2);
        int numberOfSpotsPerLane = 3;
        for (int i = 1; i <= numberOfSpotsPerLane; i++) {
            lane1.addSpot(i, VehicleType.TRUCK);
        }

        numberOfSpotsPerLane = 4;
        for (int i = 1; i <= numberOfSpotsPerLane; i++) {
            lane2.addSpot(i, null);
        }
        floor1.addLane(lane1);
        floor2.addLane(lane2);
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);


        Vehicle vehicle1 = new Car(VehicleType.CAR, "1234", "red");

        Vehicle vehicle2 = new Truck(VehicleType.TRUCK, "1235", "red");
        Vehicle vehicle3 = new Bike(VehicleType.BIKE, "1235", "red");

        //parking and ticketing system


        System.out.println("Total Free Slots: " + parkingLot.getFreeCount());
        System.out.println("Total Occupied Slots: " + parkingLot.getOccupiedCount());
        System.out.println("Free Slots in Floor1: " + parkingLot.getFloor("Floor1").getFreeCount());
        System.out.println("Occupied Slots in Floor1: " + parkingLot.getFloor("Floor1").getOccupiedCount());
        System.out.println("Free Slots in Floor2: " + parkingLot.getFloor("Floor2").getFreeCount());
        System.out.println("Occupied Slots in Floor2: " + parkingLot.getFloor("Floor2").getOccupiedCount());
        System.out.println("Free Slots in Floor2, Lane2: " + parkingLot.getFloor("Floor2").getLane(2).getFreeCount());
        System.out.println("Occupied Slots in Floor1, Lane1: " + parkingLot.getFloor("Floor1").getLane(1).getOccupiedCount());

        parkingLot.getFloor("Floor2").getLane(2).getSpot(1).parkVehicle(vehicle1);
        System.out.println("Total Free Slots: " + parkingLot.getFreeCount());
        System.out.println("Total Occupied Slots: " + parkingLot.getOccupiedCount());
        System.out.println("Free Slots in Floor1: " + parkingLot.getFloor("Floor1").getFreeCount());
        System.out.println("Occupied Slots in Floor1: " + parkingLot.getFloor("Floor1").getOccupiedCount());
        System.out.println("Free Slots in Floor2: " + parkingLot.getFloor("Floor2").getFreeCount());
        System.out.println("Occupied Slots in Floor2: " + parkingLot.getFloor("Floor2").getOccupiedCount());
        System.out.println("Free Slots in Floor2, Lane2: " + parkingLot.getFloor("Floor2").getLane(2).getFreeCount());
        System.out.println("Occupied Slots in Floor1, Lane1: " + parkingLot.getFloor("Floor1").getLane(1).getOccupiedCount());


    }
}
