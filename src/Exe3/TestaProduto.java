package Exe3;

public class TestaProduto {
    public static void main(String[] args){
        Produto obj1 = new Produto();
        obj1.mostrar();
        obj1.comprar(5);
        obj1.subir(4);
        obj1.mostrar();

        Produto obj2 = new Produto(2, "Parafuso", 10, 1.50F);
        obj2.mostrar();
        obj2.vender(11);
        obj2.descer(1);
        obj2.mostrar();
    }
}
