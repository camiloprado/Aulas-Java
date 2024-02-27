package Exe4;

import Exe3.Produto;

public class TestaRio {

    public static void main(String[] args){
        Rio obj1 = new Rio();
        obj1.chover(1);
        obj1.ensolarar(0);
        obj1.poluir();
        obj1.mostrar();

        Rio obj2 = new Rio("Pardo", 5F, true);
        obj2.chover(5.5F);
        obj2.ensolarar(10);
        obj2.limpar();
        obj2.mostrar();
    }
}
