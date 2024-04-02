package Lista5;

public class AtletaFV implements JogadorVolei, JogadorFutebol{

    @Override
    public void baterPenalti() {
        System.out.println("Penalti");
    }

    @Override
    public void baterEscanteio() {
        System.out.println("Escanteio");
    }

    @Override
    public void sacar() {
        System.out.println("Sacar");
    }

    @Override
    public void cortar() {
        System.out.println("Cortar");
    }
}
