package ParkingLot;
import lombok.Data;
@Data
public class Ticket {
    private String ticketNumber;
    private Vehicle vehicle;
    private ParkingSpot spot;

    public Ticket(String ticketNumber, Vehicle vehicle, ParkingSpot spot) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.spot = spot;
    }
}
