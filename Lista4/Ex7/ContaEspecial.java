package Ex7;
import Ex6.Conta;
public class ContaEspecial extends Conta {
    public ContaEspecial(String nome, float salario, String nr_conta, float saldo, float limite) {
        super(nome, salario, nr_conta, saldo, limite);
    }

    @Override
    public void setLimite(float limite) {
        this.limite = Math.min(limite, getSalario()*3);
    }
}
