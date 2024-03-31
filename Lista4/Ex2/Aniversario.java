package Ex2;

public class Aniversario extends CartaoWeb{

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("\nFeliz aniversário!! "+this.getDestinatario());
    }
}