package exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Joana está desenvolvendo um sistema de cadastro de usuários e percebeu que
         * muitos nomes estão sendo cadastrados com espaços em branco no início ou no
         * final. Ela quer um programa que remova esses espaços automaticamente.
         * 
         * Crie um programa que receba um nome e exiba o nome sem espaços em branco no
         * início ou no final.
         * 
         * Exemplo de entrada:
         * 
         * Digite o nome: João Silva
         * 
         * Saída esperada:
         * 
         * Nome sem espaços: João Silva
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome:");
        String nome = sc.nextLine();

        System.out.println("Nome sem Espaços: " + nome.trim());

        sc.close();
    }
}
