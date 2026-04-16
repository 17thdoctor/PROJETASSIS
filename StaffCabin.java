package hal;

import java.util.Date;

public class StaffCabin extends Employee {
    private String qualification;

    public StaffCabin(String id, String name, String adress, String contact, String numberEmp, Date hiringDate, String qualification) {
        super(id, name, adress, contact, numberEmp, hiringDate);
        this.qualification = qualification;
    }

    @Override
    public String getRole() { return "Cabin Crew"; }

    public void assignFlight() { System.out.println("Équipe cabine assignée au vol."); }
    public void obtainVol() { System.out.println("Informations du vol pour l'équipe cabine récupérées."); }
}