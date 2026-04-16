package hal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Book {
    private String reservationNumber;
    private Date dateReservation;
    private String status;
    private List<Flight> reservedFlights;

    public Book(String reservationNumber, Date dateReservation, String status) {
        this.reservationNumber = reservationNumber;
        this.dateReservation = dateReservation;
        this.status = status;
        this.reservedFlights = new ArrayList<>();
    }

    public void confirmerReservation() { this.status = "Confirmée"; }
    public void cancelReservation() { this.status = "Annulée"; }
    public void modifierReservation(String newStatus) { this.status = newStatus; }

    public List<Flight> getReservedFlights() { return reservedFlights; }
    public String getReservationNumber() { return reservationNumber; }
}
