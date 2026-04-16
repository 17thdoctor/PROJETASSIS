package hal;

import java.util.Date;

public class Employee extends Person {
    protected String numberEmp;
    protected Date hiringDate;

    public Employee(String id, String name, String adress, String contact, String numberEmp, Date hiringDate) {
        super(id, name, adress, contact);
        this.numberEmp = numberEmp;
        this.hiringDate = hiringDate;
    }

    @Override
    public void getInfos() {
        System.out.println("Employé: " + name + " (Matricule: " + numberEmp + ")");
    }

    public String getRole() { return "Employee"; }
}