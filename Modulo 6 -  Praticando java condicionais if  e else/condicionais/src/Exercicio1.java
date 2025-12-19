import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {

        /*
         * Ana precisa identificar se um número é par ou ímpar para um jogo que está
         * desenvolvendo. Para isso, deseja criar um programa que analisa se o número
         * que ela definiu previamente é par ou ímpar.
         * 
         * Como você ajudaria Ana a escrever um programa que determine se um número é
         * par ou ímpar e exiba o resultado corretamente?
         * 
         * Saída esperada:
         * O número 8 é par.
         * Ou
         * O número 7 é ímpar.
         * 
         */

        int numero;
        int resultado;

        System.out.println("Digite um numero para saber se é par ou impar");

        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();

        resultado = numero % 2;

        if (resultado == 1) {
            System.out.println("Numero %d é impar.".formatted(numero));
        } else {
            System.out.println("Numero %d é par.".formatted(numero));
        }
        sc.close();

    }
}
