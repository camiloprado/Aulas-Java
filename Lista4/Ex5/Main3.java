package Ex5;

public class Main3 {
    public static void main(String[] args) {
        Conta c1 = new Conta("Amanda", 3000, "1234", 6000, 200);
        Conta c2 = new Conta("Carlos", 2000, "1274", 5000, 4000);

        c1.deposito(500);
        c2.retira(100);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        c1.saldo();
        c2.saldo();
    }
}
