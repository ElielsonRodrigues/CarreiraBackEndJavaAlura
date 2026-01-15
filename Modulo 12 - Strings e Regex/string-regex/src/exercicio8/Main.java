package exercicio8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Roberto está desenvolvendo um sistema de cadastro de clientes e precisa
         * validar os números de CPF fornecidos. Ele quer um programa que verifique se o
         * CPF está no formato correto (XXX.XXX.XXX-XX).
         * 
         * Crie um programa que receba um CPF e exiba uma mensagem indicando se o CPF
         * está no formato válido.
         * 
         * Exemplo de entrada:
         * Digite o CPF: 123.456.789-09
         * 
         * Saída esperada:
         * O CPF 123.456.789-09 está no formato válido.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o cpf: ");
        String cpf = sc.nextLine();

        String regex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";
        if (cpf.matches(regex)) {
            System.out.println("O CPF " + cpf + " está no formato válido.");
        } else {
            System.out.println("O CPF " + cpf + " não está no formato válido.");
        }
        sc.close();

    }
}
