package Ex6;

public class Main4 {
    public static void main(String[] args) {
        Conta c1 = new Conta("João", 1000, "1234", 3000, 500);
        Conta c2 = new Conta("Andre", 2000, "1274", 5000, 4000);
        ContaEspecial c3 = new ContaEspecial("Amanda", 1000, "1254", 2000,2000);

        c1.deposito(500);
        c2.retira(100);
        c3.retira(200);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c3.toString());
    }
}
