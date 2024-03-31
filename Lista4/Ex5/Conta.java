package Ex5;

public class Conta {
    private String nome;
    private float salario;
    private String nr_conta;
    private float saldo;
    private float limite;

    public Conta(String nome, float salario, String nr_conta, float saldo, float limite) {
        this.setNome(nome);
        this.setSalario(salario);
        this.setNr_conta(nr_conta);
        this.setSaldo(saldo);
        this.setLimite(Math.min(limite, salario));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getNr_conta() {
        return nr_conta;
    }

    public void setNr_conta(String nr_conta) {
        this.nr_conta = nr_conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = Math.min(limite, salario);
    }
    public void deposito(float valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }
    public void retira(float valor) {
        if (saldo + limite >= valor) {
            saldo -= valor;
            System.out.println("Retirada de " + valor + " realizada com sucesso.");
        }

        else {
            System.out.println("Saldo insuficiente.");
        }
    }
    public void saldo(){
        System.out.println("Saldo: " + saldo);
    }
    @Override
    public String toString() {
        return "Conta{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                ", nr_conta='" + nr_conta + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}
