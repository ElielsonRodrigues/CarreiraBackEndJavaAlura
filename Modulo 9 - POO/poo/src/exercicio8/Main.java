package exercicio8;

import exercicio8.model.Item;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de gerenciamento para uma loja de roupas e
         * precisa garantir que o estoque seja atualizado corretamente a cada venda
         * realizada. Seu programa deve processar as vendas e alertar quando não houver
         * produtos suficientes no estoque.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com os atributos nome e quantidade.
         * Implemente um método que:
         * Subtraia a quantidade vendida do estoque se houver disponibilidade.
         * Exiba uma mensagem formatada com o saldo atual usando printf
         * Exiba um alerta “Estoque insuficiente” quando não for possível atender a
         * venda.
         * 
         * Exemplo de entrada:
         * 
         * item.nome = "Camiseta";
         * item.quantidade = 10;
         * 
         * item.vender(3);
         * item.vender(8);
         * 
         * Saída esperada:
         * 
         * Venda realizada. Estoque restante de Camiseta: 7
         * Estoque insuficiente
         * 
         */

        Item item = new Item("Camiseta", 10);
        item.vender(3);
        item.vender(2);
        item.vender(8);
    }
}
