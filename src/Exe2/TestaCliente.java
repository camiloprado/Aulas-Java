package Exe2;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente(1, 1, "Fulano", 10);
        obj1.realizarDeposito(5);
        obj1.realizarSaque(30);
        obj1.info();

        Cliente obj2 = new Cliente(2, 2, "Beltrano", 50);
        obj2.realizarDeposito(10);
        obj2.realizarSaque(15);
        obj2.info();
    }
}
