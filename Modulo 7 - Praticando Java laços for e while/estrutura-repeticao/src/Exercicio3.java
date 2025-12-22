public class Exercicio3 {
    public static void main(String[] args) {
        /*
         * Maria quer calcular a soma de todos os números pares de 1 a 100. Ela decidiu
         * usar um loop para iterar pelos números e somar apenas aqueles divisíveis por
         * 2. Crie um programa que realize essa tarefa.
         * 
         * Saída esperada:
         * 
         * A soma dos números pares de 1 a 100 é: 2550
         */

        int soma = 0;

        for (int i = 0; i <= 100; i++) {
            if ((i % 2) == 0) {
                soma += i;
            }
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);

    }
}
