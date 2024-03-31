package Ex2;

public class Natal extends CartaoWeb{
    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("\nFeliz natal!! "+this.getDestinatario());
    }
}