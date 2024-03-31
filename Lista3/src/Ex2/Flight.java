package Ex2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Flight {
    private int ID;
    private String origin, destination;
    private List<Reservation> reservation;

    public Flight(int ID, String origin, String destination) {
        this.setID(ID);
        this.setOrigin(origin);
        this.setDestination(destination);
        this.reservation = new ArrayList<Reservation>();
    }

    public Flight() {
        this.reservation = new ArrayList<Reservation>();
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public List<Reservation> getReservation() {
        return reservation;
    }

    public void setReservation(List<Reservation> reservation) {
        this.reservation = reservation;
    }

    public void addReservation(int ID, Date date, Passenger passenger) {
        this.reservation.add(new Reservation(ID, date, passenger));
    }

    @Override
    public String toString() {
        return "Flight{" +
                "ID=" + ID +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", reservation=" + reservation +
                '}';
    }
}
