package hal;

public class Airport {
    private String name;
    private String city;
    private String description;

    public Airport(String name, String city, String description) {
        this.name = name;
        this.city = city;
        this.description = description;
    }

    public void affecterVol() { System.out.println("Vol affecté à l'aéroport " + name); }
    public String getCity() { return city; }
}
