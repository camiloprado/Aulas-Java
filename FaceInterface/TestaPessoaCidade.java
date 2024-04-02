package FaceInterface;

public class TestaPessoaCidade {
    public static void main(String args[]){
        Pessoa fulano = new Pessoa();
        Cidade rp = new Cidade();
        rp.contrata(fulano);
        rp.contrata((Empregado) fulano);
        rp.cobraDe(fulano);
        rp.registra(fulano);
        rp.alimenta(fulano);
    }
}
