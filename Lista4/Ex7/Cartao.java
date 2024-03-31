package Ex7;

public class Cartao {
    private Conta conta;
    private String senha;
    public Cartao(Conta conta, String senha) {
        this.setConta(conta);
        this.setSenha(senha);
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean retirada(float valor, String senha) {
        if (this.senha.equals(senha)) {
            return conta.retira(valor);
        }
        else {
            System.out.println("Senha incorreta na conta " + this.getConta());
            return false;
        }
    }

    public float saldo(String senha) {
        if (this.senha.equals(senha)) {
            return conta.getSaldo();
        }
        else {
            System.out.println("Senha incorreta.");
            return -1;
        }
    }


    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso.");
        }
        else {
            System.out.println("Senha antiga incorreta. Não foi possível alterar a senha.");
        }
    }
}
