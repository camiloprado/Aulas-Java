package Exe3;

import java.util.Random;

public class Produto {

    private int id;
    private String descricao;
    private int qtde;
    private float preco;


    public Produto() {
        Random rand = new Random();
        this.id = rand.nextInt(999);
        this.descricao = "";
        this.qtde = 0;
        this.preco = 0;
    }

    public Produto(int id, String descricao, int qtde, float preco) {
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public void comprar(int x){
        this.qtde += x;
    }

    public void vender(int x){
        if(this.qtde < x) {
            System.out.println("Produto sem estoque");
        }
        else {
            this.qtde -= x;
        }
    }

    public void subir(int x){
        this.preco += x;
    }

    public void descer(int x){
        if(this.qtde <= x) {
            System.out.println("Produto com preço negativo");
        }
        else {
            this.preco += x;
        }
    }

    public void mostrar(){
        System.out.println("ID: " + this.id + "\nDescrição: " + this.descricao + "\nQuantidade: " + this.qtde + "\nPreço; " + this.preco);
    }
}
