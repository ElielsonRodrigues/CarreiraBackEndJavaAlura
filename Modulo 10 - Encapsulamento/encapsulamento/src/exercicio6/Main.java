package exercicio6;

import exercicio6.model.Conta;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema para um banco digital. Os clientes
         * precisam confiar que suas transações serão seguras e que o sistema nunca
         * permitirá que eles gastem mais do que possuem em conta. Seu desafio é
         * garantir essa segurança nas operações financeiras de depositar e sacar.
         * 
         * Crie uma classe que:
         * 
         * Permita criar contas com titular e saldo inicial.
         * Realize depósitos com valores positivos.
         * Autorize saques apenas quando houver saldo suficiente.
         * Exiba o saldo atualizado após cada operação.
         * 
         * Exemplo de entrada:
         * Conta conta = new Conta("Ana");
         * conta.depositar(1000.00);
         * conta.sacar(1200.00);
         * conta.exibirSaldo();
         * 
         * Saída esperada:
         * Saldo insuficiente para saque.
         * Saldo atual de Ana: 1000,00
         * 
         * Ou, caso Ana deposite 1000,00 e saque 200,00 a mensagem será:
         * Saldo atual de Ana: 800,00
         */

        Conta conta = new Conta("Ana");

        conta.depositar(1000.00);
        conta.sacar(1200.00);
        // conta.exibirSaldo();
    }
}
