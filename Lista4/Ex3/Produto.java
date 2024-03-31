package Ex3;

import java.util.Random;

public class Produto {
    private int nr_serie;
    private int volume;
    private String teste = "não testado";
    private static final Random random = new Random();

    public Produto(int nr_serie, int volume) {
        this.nr_serie = nr_serie;
        this.volume = volume;
    }

    public void testaUnidade() {
        if (teste.equals("nao testado")) {
            double randomNumber = random.nextDouble();
            if (randomNumber < 0.9) {
                this.setTeste("aprovado");
            } else {
                this.setTeste("reprovado");
            }
        }
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setNr_serie(int nr_serie) {
        this.nr_serie = nr_serie;
    }

    public int getNr_serie() {
        return nr_serie;
    }

    public int getVolume() {
        return volume;
    }

    public void maisVolume() {
        if(this.volume >=0 && this.volume <=99){
            setVolume(getVolume() + 1);
        }

        else{
            System.out.println("Impossível aumentar volume");
        }
    }


    public void menosVolume() {
        if(this.volume >=1 && this.volume <=100){
            setVolume(getVolume() - 1);
        }

        else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nr_serie=" + nr_serie +
                ", volume=" + volume +
                ", teste='" + teste + '\'' +
                '}';
    }
}