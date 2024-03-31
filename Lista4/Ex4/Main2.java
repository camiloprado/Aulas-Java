package Ex4;
import static Ex4.Jogo.jogo;

public class Main2 {
    public static void main(String[] args) {
        Coisa j1 = jogo();
        Coisa j2 = jogo();
        // JOptionPane.showInputDialog('')
        System.out.println(j1);
        System.out.println(j2);

        if (j1.ganha(j2)) {
            System.out.println(j1 + " ganhou de " + j2);
        }

        else if (j2.ganha(j1)) {
            System.out.println(j2+ " ganhou de " + j1);
        }

        else {
            System.out.println("Empatou");
        }
    }
}
