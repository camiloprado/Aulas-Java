package Ex4;
import java.util.Random;
public class Jogo {
    static Coisa c1 = new Pedra();
    static Coisa c2 = new Papel();
    static Coisa c3 = new Tesoura();

    static Coisa jogo(){
        Random aleatorio = new Random();
        int d1 = aleatorio.nextInt(3);

        switch (d1) {
            case 0:
                return c1;

            case 1:
                return c2;

            default:
                return c3;
        }
    }
}
