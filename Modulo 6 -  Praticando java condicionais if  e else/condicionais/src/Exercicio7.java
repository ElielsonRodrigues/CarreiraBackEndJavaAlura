import java.util.Scanner;

public class Exercicio7 {

    /*
     * 
     * Emerson trabalha em um banco e precisa verificar se um número digitado pelo
     * cliente está dentro da faixa permitida de valores para um empréstimo, que vai
     * de 1000 a 5000 reais.
     * 
     * Crie um programa que receba um valor e exiba se ele está dentro do intervalo
     * permitido ou não.
     * 
     * Exemplo de entrada:
     * Digite o valor do empréstimo: 750
     * 
     * Saída esperada:
     * O valor 750, não está dentro do intervalo permitido para empréstimo.
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do empréstimo: ");
        double valorEmprestimo = sc.nextDouble();

        if (valorEmprestimo >= 1000 && valorEmprestimo <= 5000) {
            System.out.println("Emprestimo concebido");
        } else {
            System.out.println("O valor %.2f, não esta dentro do intervado de emprestimo".formatted(valorEmprestimo));
        }
        sc.close();

    }

}
