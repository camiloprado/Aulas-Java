package Ex3;

public class Radio extends Produto{
    private String estacao;
    private String banda;

    public Radio(int nr_serie, int volume, String estacao, String banda) {
        super(nr_serie, volume);
        this.setEstacao(estacao);
        this.setBanda(banda);
    }

    public String getEstacao() {
        return estacao;
    }

    public void setEstacao(String estacao) {
        this.estacao = estacao;
    }

    public String getBanda() {
        return banda;
    }

    public void setBanda(String banda) {
        this.banda = banda;
    }

    public String escutar() {
        return "estacao " +estacao + ", banda " + banda + ", volume: "+getVolume();
    }

    public void trocaEstacao(String estacao) {
        this.estacao = estacao;
    }

    public void trocaBanda(String banda) {
        this.banda = banda;
    }

    @Override
    public String toString() {
        return super.toString() + ", Estação: " + estacao + ", Banda: " + banda;
    }
}
