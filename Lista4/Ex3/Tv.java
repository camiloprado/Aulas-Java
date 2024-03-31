package Ex3;

public class Tv extends Produto{
    private int canal;
    public Tv(int nr_serie, int volume, int canal) {
        super(nr_serie, volume);
        this.setCanal(canal);
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public String assistir() {
        return "Canal " + canal;
    }

    public void trocaCanal(int canal) {
        this.canal = canal;
    }

    @Override
    public String toString() {
        return super.toString() + ", Canal: " + canal;
    }
}
