package hal;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Passenger extends Person {
    private String passeport;
    private List<Book> reservations;

    public Passenger(String id, String name, String adress, String contact, String passeport) {
        super(id, name, adress, contact);
        this.passeport = passeport;
        this.reservations = new ArrayList<>();
    }

    public void reserverVol(Book book) { this.reservations.add(book); }

    public void annulerReservation(Book book) {
        book.cancelReservation();
        this.reservations.remove(book);
    }

    public List<Book> getBooks() { return reservations; }

    @Override
    public void getInfos() {
        System.out.println("Passager: " + name + " (Passeport: " + passeport + ")");
    }
}