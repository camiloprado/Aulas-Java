package Exe4;

public class Rio {

    String nome;
    float nivel;
    boolean poluido;

    public Rio() {
        this.nome = "";
        this.nivel = 0;
        this.poluido = true;
    }

    public Rio(String nome, float nivel, boolean poluido) {
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;
    }

    public void chover(float x){
        this.nivel += x;
    }

    public void ensolarar(float x){
        this.nivel -= x;
    }

    public void limpar(){
        this.poluido = false;
    }

    public void poluir(){
        this.poluido = true;
    }

    public void mostrar(){
        System.out.println("Nome: " + this.nome + "\nNível: " + this.nivel + "\nPoluido: " + this.poluido);
    }
}
