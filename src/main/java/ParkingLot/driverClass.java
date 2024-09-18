package ParkingLot;

public class driverClass {

    public static void main(String[] args) {
        ParkingSystem parkingLot = new ParkingSystem("PR1234");
        TicketingSystem ticketingSystem = new TicketingSystem();
        ParkingFloor floor1 = new ParkingFloor("Floor1");
        ParkingFloor floor2 = new ParkingFloor("Floor2");
        ParkingLane lane1 = new ParkingLane(1,4);
        ParkingLane lane2 = new ParkingLane(2,4);
        int numberOfSpotsPerLane = 3;

        floor1.addLane(lane1);
        floor2.addLane(lane2);
        parkingLot.addFloor(floor1);
        parkingLot.addFloor(floor2);


        Vehicle vehicle1 = new Car(VehicleType.CAR, "1234", "red");

        Vehicle vehicle2 = new Truck(VehicleType.TRUCK, "1235", "red");
        Vehicle vehicle3 = new Bike(VehicleType.BIKE, "1235", "red");

        //parking and ticketing system
        ParkingSpot spotForCar = parkingLot.getFloor("Floor2").getLane(2).getSpot(1);
        ParkingSpot spotForTruck = parkingLot.getFloor("Floor1").getLane(1).getSpot(1);
        Ticket ticket1 = ticketingSystem.issueTicket(vehicle1, spotForCar);
        Ticket ticket2 = ticketingSystem.issueTicket(vehicle1, spotForTruck);
        System.out.println("Issued Ticket: " + ticket1.toString());
        System.out.println("Issued Ticket 2: " + ticket2.toString());
        // Display parking status
        System.out.println("Total Free Slots: " + parkingLot.getFreeCount());
        System.out.println("Total Occupied Slots: " + parkingLot.getOccupiedCount());
        System.out.println("Free Slots in Floor1: " + parkingLot.getFloor("Floor1").getFreeCount());
        System.out.println("Occupied Slots in Floor1: " + parkingLot.getFloor("Floor1").getOccupiedCount());
        System.out.println("Free Slots in Floor2: " + parkingLot.getFloor("Floor2").getFreeCount());
        System.out.println("Occupied Slots in Floor2: " + parkingLot.getFloor("Floor2").getOccupiedCount());

        // Show ticket information
        Ticket unparkTicket = ticketingSystem.getTickets().get(ticket1.getTicketNumber());
        System.out.println("Retrieved Ticket: " + unparkTicket.toString());


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
