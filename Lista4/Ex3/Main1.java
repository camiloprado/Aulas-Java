package Ex3;

public class Main1 {
    public static void main(String[] args) {
        Radio r1 = new Radio(23, 45, "97.2", "Teddy");
        Tv t1 = new Tv(25, 98, 3);

        r1.maisVolume();
        System.out.println(r1.escutar());

        t1.menosVolume();
        t1.trocaCanal(6);
        System.out.println(t1.toString());
    }
}
