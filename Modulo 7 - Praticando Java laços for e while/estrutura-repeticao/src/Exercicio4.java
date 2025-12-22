import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
         * Pedro quer calcular o fatorial de um número. O fatorial de um número é o
         * produto de todos os números inteiros positivos de 1 até o próprio número. Por
         * exemplo, o fatorial de 5 é 5 × 4 × 3 × 2 × 1 = 120. Crie um programa que
         * receba um número e calcule seu fatorial.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero;");
        int numero = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.printf("O fatorial de %d é: %d ", numero, fatorial);
        sc.close();
    }
}
