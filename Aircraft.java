package hal;

public class Aircraft {
    private String registration;
    private String model;
    private int capacity;
    private boolean isAvailable;

    public Aircraft(String registration, String model, int capacity) {
        this.registration = registration;
        this.model = model;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    public void affecterVol() { this.isAvailable = false; }
    public boolean checkAvailability() { return isAvailable; }
    public String getRegistration() { return registration; }
}