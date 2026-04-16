package hal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class AirlineManagementSystem {
    private List<Flight> flights = new ArrayList<>();
    private List<Passenger> passengers = new ArrayList<>();
    private List<Book> reservations = new ArrayList<>();

    public void addFlight(Flight flight) { flights.add(flight); }
    public void removeFlight(Flight flight) { flights.remove(flight); }

    public void bookFlight(Passenger passenger, Flight flight) {
        String resId = "RES-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase();
        Book book = new Book(resId, new Date(), "Confirmée");

        book.getReservedFlights().add(flight);
        passenger.reserverVol(book);
        flight.listingPassenger().add(passenger);
        reservations.add(book);

        System.out.println("Réservation " + resId + " validée pour " + passenger.getName());
    }

    public void generateReport() {
        System.out.println("\n--- RAPPORT DE GESTION ---");
        System.out.println("Nombre de vols : " + flights.size());
        int totalP = flights.stream().mapToInt(f -> f.listingPassenger().size()).sum();
        System.out.println("Passagers transportés : " + totalP);
        System.out.println("Revenus estimés : " + (totalP * 250) + " €");

        System.out.println("\nDestinations :");
        flights.stream()
                .collect(Collectors.groupingBy(f -> f.getDestination().getCity(), Collectors.counting()))
                .forEach((city, count) -> System.out.println("- " + city + " : " + count + " vol(s)"));
    }
}