package FaceInterface;

public class Cidade {
    public void contrata(Professor p){
        p.ensina();
        p.trabalha();
    }

    public void contrata(Empregado e){
        e.trabalha();
    }

    public void cobraDe(Contribuinte c) {
        c.pagaIR();
    }

    public void registra(Cidadao c) {
        c.getRg();
    }

    public void alimenta(Animal a){
        a.come();
    }

}
