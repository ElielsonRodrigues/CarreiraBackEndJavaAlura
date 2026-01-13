package exercicio6.model;

public class Conta {

    private String titular;
    private double saldo;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito > 0) {
            saldo += valorDeposito;
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valorSaque) {
        if (valorSaque > saldo) {
            System.out.println("Saldo insuficiente para saque.");
            exibirSaldo();
        } else {
            saldo -= valorSaque;
        }
    }

    public void exibirSaldo() {
        System.out.printf("Saldo atual de %s: %.2f ", titular, saldo);
    }

}
