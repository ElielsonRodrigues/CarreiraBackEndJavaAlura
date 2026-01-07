package exercicio10;

import java.util.ArrayList;
import java.util.List;

import exercicio10.model.Produto;
import exercicio10.model.Carrinho;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Você está desenvolvendo o sistema de checkout de um e-commerce de produtos
         * eletrônicos. Seu desafio é calcular o valor total do carrinho de compras,
         * considerando que cada produto pode ter quantidades diferentes e preços
         * variados.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com os atributos nome, preço e quantidade.
         * Implemente um método que retorne o valor total do item (preço x quantidade).
         * Crie uma lista de item e calcule o valor total da compra.
         * 
         * Exemplo de entrada:
         * 
         * i1.nome = "Teclado";
         * i1.preco = 120.0;
         * i1.quantidade = 1;
         * 
         * i2.nome = "Mouse";
         * i2.preco = 60.0;
         * i2.quantidade = 2;
         * 
         * Saída esperada:
         * Total da compra: R$ 240.00
         */

        Produto p1 = new Produto("Teclado", 120.0, 1);
        Produto p2 = new Produto("Mouse", 60.0, 2);
        Produto p3 = new Produto("Monitor", 10.0, 10);

        List<Produto> itens = new ArrayList<>();
        itens.add(p1);
        itens.add(p2);
        itens.add(p3);

        Carrinho compra = new Carrinho(itens);
        compra.totalCompra();

    }
}
