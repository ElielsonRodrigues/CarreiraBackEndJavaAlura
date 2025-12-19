import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
         * Julia é professora e precisa de um programa que ajude a determinar se um
         * aluno foi aprovado na disciplina. A regra da escola é:
         * 
         * O estudante é aprovado se média final é maior ou igual a 7.0.
         * 
         * Se a média for entre 5.0 e 6.9, está de recuperação.
         * 
         * Se for abaixo de 5.0, está reprovado.
         * 
         * Crie um programa que, a partir de uma variável media, exiba a situação do
         * estudante conforme as regras da escola.
         * Saída esperada:
         * O estudante teve média 8.2 e foi aprovado.
         * Ou
         * O estudante teve média 5.8 e está de recuperação.
         * Ou
         * O estudante teve média 4.3 e foi reprovado.
         * 
         */

        double nota1;
        double nota2;
        double nota3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite nota1:");
        nota1 = sc.nextDouble();

        System.out.println("Digite nota2:");
        nota2 = sc.nextDouble();

        System.out.println("Digite nota3:");
        nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("O estudante teve média %.2f e foi aprovado. ".formatted(media));
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("O estudante teve média %.2f é esta de recuperação. ".formatted(media));
        } else {
            System.out.println("O estudante teve média %.2f é esta reprovado. ".formatted(media));
        }

        sc.close();
    }

}
