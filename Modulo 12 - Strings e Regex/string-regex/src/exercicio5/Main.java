package exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         * Laura está desenvolvendo um sistema de busca e precisa verificar se uma
         * palavra específica está presente em um texto. Crie um programa que receba um
         * texto e uma palavra, e exiba uma mensagem indicando se a palavra está
         * presente no texto.
         * 
         * Exemplo de entrada:
         * Digite o texto: O gato caça o rato.
         * Digite a palavra: gato
         * 
         * Saída esperada:
         * A palavra "gato" está presente no texto.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Digite a palavra: ");
        String palavra = sc.nextLine();

        if (texto.contains(palavra.trim())) {
            System.out.printf("A palavra '%s' está presente no texto", palavra.trim());
        } else {
            System.out.printf("Palavra '%s' não encontrada", palavra);
        }
        sc.close();
    }
}
