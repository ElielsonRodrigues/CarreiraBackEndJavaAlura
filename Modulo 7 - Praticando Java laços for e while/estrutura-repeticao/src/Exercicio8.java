import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio8 {
    /*
     * Ana é professora de matemática e está sempre curiosa sobre as respostas de
     * seus alunos. Hoje, ela propôs um exercício no qual os alunos devem contar
     * quantos números positivos e negativos existem em uma sequência de números
     * fornecida por ela.
     * 
     * Ela quer que os alunos criem um programa que permita **inserir vários
     * números, um por vez, e que pare quando o número "fim" for digitado. **
     * 
     * Exemplo de entrada:
     * 
     * Digite um número (ou 'fim' para encerrar): 3
     * Digite um número (ou 'fim' para encerrar): -1
     * Digite um número (ou 'fim' para encerrar): 7
     * Digite um número (ou 'fim' para encerrar): fim
     * 
     * Saída esperada:
     * 
     * Números positivos: 2
     * Números negativos: 1
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> negativos = new ArrayList<>();
        List<Integer> positivos = new ArrayList<>();
        String entrada = "";

        while (!entrada.equals("fim")) {
            System.out.println("Digite um número (ou 'fim' para encerrar):");
            entrada = sc.nextLine();
            if (entrada.equals("fim")) {
                break;
            } else {
                int numero = Integer.parseInt(entrada);

                if (numero < 0) {
                    negativos.add(numero);
                    System.out.println(negativos);
                } else {
                    positivos.add(numero);
                    System.out.println(positivos);
                }
            }

        }
        System.out.println("Números positivos:" + positivos.size());
        System.out.println("Números negativos:" + negativos.size());
        sc.close();

    }
}
