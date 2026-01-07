package exercicio3;

import exercicio3.model.Conta;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está desenvolvendo um sistema de conta digital onde os
         * usuários podem realizar transações financeiras. Em determinadas situações,
         * como encerramento de conta, é necessário zerar o saldo disponível.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com o atributo saldo.
         * Implemente um método que redefine o valor do saldo para 0.0.
         * Implemente um método que mostra o saldo atual formatado.
         * 
         * Exemplo de entrada:
         * 
         * conta.saldo = 1579.42;
         * 
         * conta.exibirSaldo();
         * conta.zerarSaldo();
         * conta.exibirSaldo();
         * 
         * Saída esperada:
         * Saldo atual: R$ 1579.42
         * Saldo atual: R$ 0.00
         */

        Conta conta = new Conta();
        conta.setSaldo(1579.42);

        conta.exibirSaldo();
        conta.zerarSaldo();
        System.out.println("\n");
        conta.exibirSaldo();
    }
}
