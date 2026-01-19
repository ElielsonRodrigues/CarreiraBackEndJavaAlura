package exercicio10;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você deseja analisar as notas dos alunos e alunas em uma disciplina para
         * entender melhor o desempenho da turma. Além da média, você também quer saber
         * a menor e a maior nota para ter um panorama completo. Para isso, você deve
         * criar um programa que seja capaz de:
         * 
         * Criar uma lista contendo as notas dos alunos.
         * Utilizar reduce() para calcular a soma total das notas.
         * Calcular a média das notas.
         * Determinar a menor e a maior nota da lista. Dica: use a função max e min da
         * classe Stream.
         * Exibir os resultados no console.
         * 
         * Exemplo de entrada:
         * 
         * List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);
         * 
         * Saída esperada:
         * 
         * A média das notas é: 8.2
         * A menor nota foi: 6.5
         * A maior nota foi: 10.0
         */

        List<Double> notas = List.of(7.5, 8.0, 6.5, 9.0, 10.0);

        Double soma = notas.stream().reduce(0.0, Double::sum);
        Double media = soma / notas.size();

        Double menor = notas.stream().min(Double::compare).orElseThrow();
        Double maior = notas.stream().max(Double::compare).orElseThrow();

        System.out.println("A menor nota foi: " + menor);
        System.out.println("A maior nota foi: " + maior);

        System.out.println("A média das notas é: " + String.format("%.2f", media));

    }
}
