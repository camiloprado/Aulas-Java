package Exe2;

public class Cliente {
    public int numeroConta;
    public int numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void realizarDeposito(float valor) {
        System.out.println("Foi adicionado " + valor + " ao saldo\nSaldo Final: " + (this.saldo += valor));
    }

    public void realizarSaque(float valor){
        System.out.println("Foi sacado " + valor + " do saldo\nSaldo Final: " + (this.saldo -= valor));
    }

    public void info(){
        System.out.println("Numero da Conta: " + this.numeroConta + "\nNome do Exe2.Cliente: " + this.nome + "\nSaldo: " + this.saldo);
    }
}
