package Ex2;

public class Namorados extends CartaoWeb{
    public Namorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("\nFeliz dia dos namorados!! "+this.getDestinatario());
    }
}

