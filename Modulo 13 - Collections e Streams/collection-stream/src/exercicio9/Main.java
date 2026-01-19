package exercicio9;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você trabalha no setor financeiro de uma empresa e precisa
         * calcular o valor total gasto na compra de produtos. No entanto, a empresa
         * precisa considerar um imposto de 8% sobre o valor total para definir
         * corretamente o preço final dos produtos.
         * 
         * Crie um programa que:
         * 
         * Crie uma lista contendo os preços dos produtos.
         * Utilize reduce() para calcular o total gasto.
         * Calcule o valor do imposto (8%) sobre o total.
         * Exiba o valor total antes e depois da aplicação do imposto, com duas casas
         * decimais.
         * 
         * Exemplo de entrada:
         * 
         * List<Double> precosProdutos = List.of(29.99, 49.50, 15.75, 99.99);
         * 
         * Saída esperada:
         * 
         * Valor total antes do imposto: 195.23
         * Valor total com imposto de 8%: 210.85
         */

        List<Double> precoProdutos = List.of(29.99, 49.50, 15.75, 99.99);
        Double somaTotal = precoProdutos.stream().reduce(0.0, Double::sum);

        System.out.println("Valor total antes do imposto: " + somaTotal);

        Double imposto = somaTotal * 0.08;
        Double total = somaTotal + imposto;

        System.out.println("Valor total com imposto de 8%: " + String.format("%.2f", total));

    }
}
