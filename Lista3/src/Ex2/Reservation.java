package Ex2;

import java.util.Date;

public class Reservation {
    private int ID;
    private Date date;
    Passenger passenger;

    public Reservation() {
    }

    public Reservation(int ID, Date date, Passenger passenger) {
        this.setID(ID);
        this.setDate(date);
        this.setPassenger(passenger);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "ID=" + ID +
                ", date=" + date +
                ", passenger=" + passenger +
                '}';
    }
}