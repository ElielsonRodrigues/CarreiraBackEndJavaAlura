package exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Ana está desenvolvendo um sistema de edição de textos e precisa substituir
         * uma palavra específica por outra em um texto. Crie um programa que:
         * 
         * Receba um texto, uma palavra a ser substituída e uma nova palavra, exiba o
         * texto com as substituições realizadas.
         * Se a palavra a ser substituída não for encontrada no texto, o programa deve
         * informar ao usuário que a palavra não foi encontrada e encerrar a execução.
         * 
         * Exemplo de entrada:
         * 
         * Digite o texto: O gato caça o rato.
         * Digite a palavra a ser substituída: gato
         * Digite a nova palavra: cachorro
         * 
         * Saída esperada:
         * Texto modificado: O cachorro caça o rato.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o texto: ");
        String texto = sc.nextLine();

        System.out.println("Digite a palavra a ser substituída: ");
        String acharPalavra = sc.nextLine();

        boolean isContain = texto.contains(acharPalavra.trim());

        if (isContain) {
            System.out.println("Digite a nova palavra: ");
            String substituta = sc.nextLine();
            String palavraModificada = texto.replace(acharPalavra, substituta);
            System.out.println(palavraModificada);
        } else {
            System.out.println("Palavra não encontada");
        }
        sc.close();

    }
}
