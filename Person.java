package hal;

public abstract class Person {
    protected String id;
    protected String name;
    protected String adress;
    protected String contact;

    public Person(String id, String name, String adress, String contact) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.contact = contact;
    }

    public abstract void getInfos();
    public String getName() { return name; }
    public String getId() { return id; }
}