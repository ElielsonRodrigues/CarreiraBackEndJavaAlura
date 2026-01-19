package exercicio7;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo uma aplicação matemática que precisa calcular o
         * quadrado de uma lista de números. Essa funcionalidade será usada para gerar
         * gráficos e análises estatísticas. Para resolver essa tarefa você deve:
         * 
         * Criar uma lista contendo os números fornecidos.
         * Calcular o quadrado de cada número utilizando o método map.
         * Criar uma nova lista contendo os resultados.
         * Exibir a lista de quadrados no console.
         * 
         * Exemplo de entrada:
         * 
         * List<Integer> numeros = List.of(2, 3, 5, 7, 11);
         * 
         * Saída esperada:
         * Quadrados dos números: [4, 9, 25, 49, 121]
         */

        List<Integer> numeros = List.of(2, 3, 5, 7, 11);

        List<Integer> calculados = numeros
                .stream()
                .map(c -> c * c)
                .collect(Collectors.toList());
        System.out.println("Quadrados dos números: " + calculados);

    }
}
