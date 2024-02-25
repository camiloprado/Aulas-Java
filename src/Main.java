public class Main {
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(1, "Camilo", 25, 10, 3 );
        obj1.notaFinal();
        obj1.dadosAluno();
        obj1.passou();

        Cliente obj2 = new Cliente(1, 1, "Camilo", 10);
        obj2.realizarDeposito(10);
        obj2.realizarSaque(15);
        obj2.info();
    }
}