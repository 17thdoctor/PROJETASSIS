package hal;

import java.util.Date;

public class AirplanePilot extends Employee {
    private String licence;
    private int flightHours;

    public AirplanePilot(String id, String name, String adress, String contact, String numberEmp, Date hiringDate, String licence, int flightHours) {
        super(id, name, adress, contact, numberEmp, hiringDate);
        this.licence = licence;
        this.flightHours = flightHours;
    }

    @Override
    public String getRole() { return "Pilot"; }

    public void assignFlight() { System.out.println("Pilote assigné au vol."); }
    public void obtainVol() { System.out.println("Informations du vol pour le pilote récupérées."); }
}
