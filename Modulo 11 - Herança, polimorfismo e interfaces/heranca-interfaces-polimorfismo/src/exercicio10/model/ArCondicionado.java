package exercicio10.model;

public class ArCondicionado implements Controlavel {

    private boolean ligada = false;

    @Override
    public void ligar() {
        if (ligada) {
            System.out.println("Ar-condicionado já está ligada.");
        } else {
            this.ligada = true;
            System.out.println("Ar-condicionado ligada.");
        }

    }

    @Override
    public void desligar() {
        if (!ligada) {
            System.out.println("Ar-condicionado já está desligada.");
        } else {
            this.ligada = false;
            System.out.println("Ar-condicionado desligada.");
        }

    }

}
