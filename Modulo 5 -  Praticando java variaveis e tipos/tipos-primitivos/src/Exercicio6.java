public class Exercicio6 {

    public static void main(String[] args) {

        /*
         * Você trabalha em um e-commerce e precisa classificar os produtos em
         * diferentes categorias com base no preço.
         * 
         * Escreva um programa que classifique um produto em uma categoria com base em
         * um preço e exiba a categoria correspondente, conforme as seguintes regras:
         * 
         * Econômico: preço até R$ 50,00.
         * Intermediário: preço entre R$ 50,01 e R$ 200,00.
         * Premium: preço acima de R$ 200,00. Exemplo de entrada:
         * double preco = 150.00;
         * 
         * Saída esperada:
         * Categoria do produto: Intermediário
         */

        double preco = 150.0;
        String descricao;

        if (preco <= 50.00) {
            descricao = "Econômico";
        } else if (preco <= 200.00) {
            descricao = "Intermediário";
        } else {
            descricao = "Premium";
        }
        System.out.println("Categoria do produto: %s".formatted(descricao));

    }
}
