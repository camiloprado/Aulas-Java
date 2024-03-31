package Ex4;

public class Tesoura extends Coisa{
    @Override
    boolean ganha(Coisa outra) {
        return outra instanceof Papel;
    }

    @Override
    public String toString() {
        return "Tesoura";
    }
}
