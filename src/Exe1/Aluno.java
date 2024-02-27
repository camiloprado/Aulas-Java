package Exe1;

public class Aluno {
    public int numeroAluno;
    public String nome;
    public int idade;
    public float p1;
    public float p2;

    public Aluno(int numeroAluno,String nome, int idade, float p1, float p2){
        this.numeroAluno = numeroAluno;
        this.nome = nome;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
    }

    public void notaFinal(){
        System.out.println("A nota final do Exe1.Aluno é: " + (this.p1 + this.p2)/2);
    }

    public void dadosAluno(){
        System.out.println("ID: "+ this.numeroAluno +"\nNome: " + this.nome + "\nIdade: " + this.idade);
    }

    public void passou(){
        if ((this.p1 + this.p2)/2 >= 6) {
            System.out.println("O " + this.nome + " passou de ano.");
        }
        else {
            System.out.println("O " + this.nome + " não passou de ano.");
        }
    }
}
