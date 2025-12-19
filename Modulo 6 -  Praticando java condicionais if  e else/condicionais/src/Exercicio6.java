import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {

        /*
         * Carlos trabalha em uma empresa de logística que opera apenas de segunda a
         * sexta, sem atividades nos finais de semana. Para evitar confusões, ele
         * precisa de um programa que, ao receber um dia da semana, informe se é um dia
         * útil ou não.
         * 
         * Crie um programa que receba um dia da semana (em letras minúsculas) e exiba
         * uma mensagem indicando se é um dia útil ou não.
         * 
         * Exemplo de Entrada:
         * Digite o dia da semana (em letras minúsculas): quarta
         * Saída esperada:
         * Quarta é um dia útil.
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em letras minúsculas): ");
        String diaSemana = sc.nextLine();

        if (diaSemana.equalsIgnoreCase("domingo") ||
                diaSemana.equalsIgnoreCase("sabado")) {
            System.out.println(diaSemana + " não é dia util");
        } else if (diaSemana.equalsIgnoreCase("segunda") ||
                diaSemana.equalsIgnoreCase("terca") ||
                diaSemana.equalsIgnoreCase("quarta") ||
                diaSemana.equalsIgnoreCase("quinta") ||
                diaSemana.equalsIgnoreCase("sexta")

        ) {
            System.out.println(diaSemana + " é dia util");
        } else {
            System.out.println(diaSemana + " não é reconhecido");
        }
        sc.close();
    }
}
