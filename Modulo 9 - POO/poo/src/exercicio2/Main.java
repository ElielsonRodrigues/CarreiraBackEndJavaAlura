package exercicio2;

import exercicio2.model.Livro;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está criando um sistema de catalogação para uma biblioteca.
         * Seu objetivo é desenvolver uma estrutura que armazene dados de obras
         * literárias e as exiba em um formato padronizado, facilitando a consulta por
         * outros leitores.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com os atributos título, autor e páginas.
         * Implemente um método que use printf para mostrar os dados no formato:
         * "[TÍTULO]" de [AUTOR] com [PÁGINAS] páginas.
         * 
         * Exemplo de entrada:
         * 
         * l.titulo = "O Guia do Mochileiro das Galáxias";
         * l.autor = "Douglas Adams";
         * l.paginas = 208;
         * 
         * Saída esperada:
         * "O Guia do Mochileiro das Galáxias" de Douglas Adams com 208 páginas
         */

        Livro l1 = new Livro("O Guia do Mochileiro das Galáxias", "Douglas Adams", 208);

        l1.exibeLivro();

    }
}
