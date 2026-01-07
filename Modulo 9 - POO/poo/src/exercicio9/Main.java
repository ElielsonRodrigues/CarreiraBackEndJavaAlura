package exercicio9;

import exercicio9.model.Titulo;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está desenvolvendo um sistema de controle de devoluções para
         * uma livraria. Quando um livro é devolvido com atraso, é necessário calcular o
         * valor da multa conforme os dias de atraso.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com os atributos título e dias de atraso.
         * Implemente um método que:
         * Cobre R$ 2,50 por dia de atraso.
         * Retorne o valor total da multa.
         * Implemente um método que mostre o título e o valor da multa formatado.
         * 
         * Exemplo de entrada:
         * 
         * pedido.titulo = "Dom Casmurro";
         * pedido.diasAtraso = 3;
         * 
         * pedido.exibirDetalhes();
         * 
         * Saída esperada:
         * Livro: Dom Casmurro | Multa por 3 dias de atraso: R$ 7,50
         */

        Titulo titulo = new Titulo("Dom Casmurro", 3);
        titulo.calcularMulta();

    }
}
