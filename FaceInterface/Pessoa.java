package FaceInterface;

public class Pessoa extends Animal implements Cidadao, Professor, Contribuinte{

    @Override
    public void vota() {
        System.out.println(0);
    }

    @Override
    public void getRg() {
        System.out.println(1);
    }

    @Override
    public void pagaIR() {
        System.out.println(2);
    }

    @Override
    public void getCPF() {
        System.out.println(3);
    }

    @Override
    public void trabalha() {
        System.out.println(4);
    }

    @Override
    public void ensina() {
        System.out.println(5);
    }
}
