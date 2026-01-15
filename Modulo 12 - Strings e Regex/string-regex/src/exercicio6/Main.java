package exercicio6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Roberto está desenvolvendo um sistema de relatórios financeiros e precisa
         * formatar valores monetários com duas casas decimais. Construa um programa que
         * receba um valor monetário e exiba o valor formatado com duas casas decimais.
         * 
         * Exemplo de Entrada:
         * Digite o valor: 19,9876
         * 
         * Saída esperada:
         * Valor formatado: R$ 19,99
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor:");
        double valor = sc.nextDouble();

        System.out.printf("Valor formatado: R$ %.2f", valor);

        sc.close();

    }
}
