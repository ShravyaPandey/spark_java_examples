package ParkingLot;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;
@Data

public class TicketingSystem {
    private  static int i=0;
    private Map<String,Ticket> Tickets;

    public TicketingSystem() {
        this.Tickets = new HashMap<>();

    }
    public Ticket issueTicket(Vehicle vehicle, ParkingSpot spot){
        if(spot.isOccupied()){
            System.out.println("spot already occupied");
        }
        String ticketNumber = ""+i++;
        Ticket ticket = new Ticket(ticketNumber, vehicle, spot);
        Tickets.put(ticketNumber, ticket);
        spot.parkVehicle(vehicle);  // Mark the spot as occupied
        return ticket;
    }
}
