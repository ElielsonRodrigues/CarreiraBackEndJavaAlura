package exercicio10.model;

public class Luz implements Controlavel {

    private boolean ligada = false;

    @Override
    public void ligar() {
        if (ligada) {
            System.out.println("Luz já está ligada.");
        } else {
            this.ligada = true;
            System.out.println("Luz ligada.");
        }

    }

    @Override
    public void desligar() {
        if (!ligada) {
            System.out.println("Luz já está desligada.");
        } else {
            this.ligada = false;
            System.out.println("Luz desligada.");
        }
    }

}
