package Ex2;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
            Passenger p1 = new Passenger(0, "Camilo", "12345678901");
            Passenger p2 = new Passenger(1, "Marina", "98765432101");

            Flight f1 = new Flight(0, "BR", "NY");

            f1.addReservation(0, new Date(), p1);
            System.out.println(f1.toString());
    }
}