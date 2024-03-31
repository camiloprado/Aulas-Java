package Ex2;

public class Passenger {
    private int ID;
    private String name, cpf;

    public Passenger(int ID, String name, String cpf) {
        this.setID(ID);
        this.setName(name);
        this.setCpf(cpf);
    }

    public Passenger() {
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Ex1.Person{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
