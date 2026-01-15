package exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Carlos está desenvolvendo um sistema de relatórios e precisa padronizar o
         * texto para que todos os títulos estejam em maiúsculas e as descrições em
         * minúsculas. Faça um programa que receba um texto e exiba o texto em
         * maiúsculas e o texto em minúsculas.
         * 
         * Exemplo de entrada:
         * Digite o texto: Olá, Mundo!
         * 
         * Saída esperada:
         * Texto em maiúsculas: OLÁ, MUNDO!
         * Texto em minúsculas: olá, mundo!
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto:");
        String texto = sc.nextLine();

        System.out.println("Texto em maiúscula: " + texto.toUpperCase());
        System.out.println("Texto em minúscula: " + texto.toLowerCase());

        sc.close();

    }
}
