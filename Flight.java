package hal;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Flight {
    private String flightNumber;
    private Airport origin;
    private Airport destination;
    private Date departureTime;
    private Date arrivalDateTime;
    private String status;
    private List<Passenger> passengers;
    private Aircraft aircraft;

    public Flight(String flightNumber, Airport origin, Airport destination, Date departureTime, Date arrivalDateTime, String status) {
        this.flightNumber = flightNumber;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalDateTime = arrivalDateTime;
        this.status = status;
        this.passengers = new ArrayList<>();
    }

    public void planifierVol() { this.status = "Planifié"; }
    public void annulerVol() { this.status = "Annulé"; }
    public void modifierVol(Date newDeparture) { this.departureTime = newDeparture; }
    public List<Passenger> listingPassenger() { return passengers; }

    public String getFlightNumber() { return flightNumber; }
    public Airport getDestination() { return destination; }
}
