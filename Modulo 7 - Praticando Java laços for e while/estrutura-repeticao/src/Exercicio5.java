import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        /*
         * Carlos tem uma lista de números e quer descobrir qual é o maior valor. Para
         * isso, ele decidiu percorrer a lista comparando cada número com o maior
         * encontrado até o momento. Crie um programa que receba uma lista de números e
         * encontre o maior número.
         * 
         * Exemplo de entrada:
         * 
         * Digite os números separados por espaço: 3 7 2 9 5
         * 
         * Saída esperada:
         * O maior número é: 9
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números separados por espaço: ");
        String[] numeros = sc.nextLine().split(" ");
        int maior = 0;

        for (int i = 0; i < numeros.length; i++) {
            int numeroAtual = Integer.parseInt(numeros[i]);
            if (numeroAtual > maior) {
                maior = numeroAtual;
            }
        }
        System.out.println("O maior número é: " + maior);
        sc.close();

    }

}
