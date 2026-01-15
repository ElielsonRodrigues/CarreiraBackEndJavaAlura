package exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Pedro está desenvolvendo um sistema de processamento de arquivos e precisa
         * extrair o nome do arquivo sem a extensão. Crie um programa que receba o nome
         * de um arquivo e exiba o nome sem a extensão.
         * 
         * Exemplo de entrada:
         * 
         * Digite o nome do arquivo: relatorio_final.pdf
         * 
         * Saída esperada:
         * Nome do arquivo sem extensão: relatorio_final
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do arquivo:");
        String nomeArquivo = sc.nextLine();

        boolean isExtension = nomeArquivo.contains(".");

        if (isExtension) {
            nomeArquivo = nomeArquivo.replaceAll("\\..*", "");
            System.out.println("Nome do arquivo sem extensão: " + nomeArquivo);
        } else {
            System.out.println("Não possui extensão.");
        }
        sc.close();
    }
}