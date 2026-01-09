package exercicio5.model;

public class Dispositivo {

    private double autonomia;

    public Dispositivo() {
    }

    public void setAutonomia(double autonomia) {
        if (this.autonomia >= 0 && this.autonomia <= 100) {
            this.autonomia = autonomia;
            if (this.autonomia <= 20) {
                System.out.println("Bateria Fraca!");
            } else if (this.autonomia >= 21 && this.autonomia <= 79) {
                System.out.println("Bateria ok!");
            } else {
                System.out.println("Bateria cheia");
            }
        } else {
            System.out.println("Não e possivel atribuir esse valor a autonomia");
        }
    }
}
