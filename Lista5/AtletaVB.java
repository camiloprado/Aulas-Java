package Lista5;

public class AtletaVB implements JogadorVolei, JogadorBasquete{
    @Override
    public void lanceLivre() {
        System.out.println("Lance Livre");
    }

    @Override
    public void fazerBandeija() {
        System.out.println("Bandeija");
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
