package fr.isep.goat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Date;
public class Main {
    public static void main(String[] args) {

        AirlineManagementSystem system = new AirlineManagementSystem();

        System.out.println("== Initialisation du Système de Vol 2024-25 ==\n");
        Airport cdg = new Airport("Charles de Gaulle", "Paris", "Hub principal France");
        Airport jfk = new Airport("JFK", "New York", "Hub principal USA");
        Airport hnd = new Airport("Haneda", "Tokyo", "Aéroport international Japon");

        Flight flight1 = new Flight("AF101", cdg, jfk, new Date(), new Date(), "Planifié");
        Flight flight2 = new Flight("AF202", cdg, hnd, new Date(), new Date(), "Planifié");
        Flight flight3 = new Flight("AF303", jfk, hnd, new Date(), new Date(), "Planifié");

        system.addFlight(flight1);
        system.addFlight(flight2);
        system.addFlight(flight3);

        Passenger p1 = new Passenger("P01", "Alice Liddell", "10 Rue de la Paix", "alice@mail.com", "FR123456");
        Passenger p2 = new Passenger("P02", "Bob Smith", "22 Broadway", "bob@mail.com", "US987654");

        System.out.println(" Enregistrement des réservations ");
        system.bookFlight(p1, flight1);
        system.bookFlight(p2, flight1);
        system.bookFlight(p1, flight2);

        system.generateReport();

        System.out.println("\n=== Fin de la Simulation ===");
    }
}