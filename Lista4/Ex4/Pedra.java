package Ex4;

public class Pedra extends Coisa{
    @Override
    boolean ganha(Coisa outra) {
        return outra instanceof Tesoura;
    }

    @Override
    public String toString() {
        return "Pedra";
    }
}
