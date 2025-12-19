import java.util.Scanner;

public class Exercicio8 {
    /*
     * Marcos está estudando geometria e precisa verificar se três lados podem
     * formar um triângulo. Para que três lados formem um triângulo, a soma de dois
     * lados deve ser maior que o terceiro lado. Ele quer um programa que receba
     * três lados e exiba uma mensagem informando se os lados podem formar um
     * triângulo ou não.
     * 
     * Com base nesse cenário, crie um programa que receba três lados e exiba uma
     * mensagem informando se os lados podem formar um triângulo ou não.
     * 
     * Exemplo de entrada:
     * 
     * Digite o primeiro lado: 3
     * Digite o segundo lado: 4
     * Digite o terceiro lado: 5
     * 
     * Saída esperada:
     * Os lados podem formar um triângulo.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe lado 1");
        int l1 = sc.nextInt();

        System.out.println("Informe lado 2");
        int l2 = sc.nextInt();

        System.out.println("Informe lado 3");
        int l3 = sc.nextInt();

        if ((l1 + l2) > l3 &&
                (l2 + l3) > l1 &&
                (l3 + l1) > l2) {

            System.out.println("Os lados podem formar um triângulo. ");

        } else {
            System.out.println("Não pode ser trinangulos");
        }

        sc.close();

    }
}
