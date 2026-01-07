package exercicio3.model;

public class Conta {

    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual: R$ %.2f", saldo);
    }

    public void zerarSaldo() {
        saldo = 0.0;
    }

}
