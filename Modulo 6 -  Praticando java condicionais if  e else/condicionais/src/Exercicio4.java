import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        /*
         * Pedro está aprendendo Java e se deparou com um problema: ele precisa criar um
         * programa que compare dois números inteiros fornecidos pelo usuário e informe
         * qual é o maior ou se são iguais. Mas, ele está com dificuldades para
         * implementar a lógica de comparação e exibir o resultado corretamente.
         * 
         * Ajude Pedro a resolver esse problema! Crie um programa que solicite ao
         * usuário dois números inteiros, compare-os e exiba uma mensagem indicando qual
         * é o maior ou se ambos são iguais.
         * 
         * Exemplo de entrada:
         * Digite o primeiro número: 10
         * Digite o segundo número: 25
         * Saída esperada:
         * O maior número é 25.
         */

        Scanner sc = new Scanner(System.in);

        int n1;
        int n2;

        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("O maior numero é " + n1);
        } else if (n1 < n2) {
            System.out.println("O maior numero é " + n2);
        } else {
            System.out.println("nuemro iguais");
        }
        sc.close();

    }
}
