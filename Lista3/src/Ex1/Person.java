package Ex1;

public class Person {
    private int ID;
    private String name, user;

    public Person(int ID, String name, String user) {
        this.setID(ID);
        this.setName(name);
        this.setUser(user);
    }

    public Person() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Ex1.Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}
