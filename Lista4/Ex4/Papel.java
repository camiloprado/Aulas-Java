package Ex4;

public class Papel extends Coisa{
    @Override
    boolean ganha(Coisa outra) {
        return outra instanceof Pedra;
    }

    @Override
    public String toString() {
        return "Papel";
    }
}
