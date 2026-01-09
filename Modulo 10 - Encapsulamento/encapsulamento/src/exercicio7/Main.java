package exercicio7;

import exercicio7.model.Filme;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema para uma plataforma de streaming que
         * deseja oferecer recomendações mais precisas aos usuários. Para isso, é
         * importante coletar avaliações confiáveis e calcular médias que reflitam a
         * qualidade real dos filmes.
         * 
         * Crie uma classe que:
         * 
         * Armazene o título do filme e suas avaliações. As avaliações são armazenadas
         * em uma lista
         * Permita adicionar novas avaliações (apenas entre 1 e 5)
         * Calcule e exiba a média das avaliações com precisão decimal
         * 
         * Exemplo de entrada:
         * Filme matrix = new Filme("Matrix");
         * matrix.adicionarAvaliacao(5);
         * matrix.adicionarAvaliacao(4);
         * matrix.adicionarAvaliacao(5);
         * matrix.adicionarAvaliacao(3);
         * matrix.adicionarAvaliacao(4);
         * 
         * Saída esperada:
         * Média de avaliações para Matrix: 4,20
         */

        Filme matrix = new Filme("Matrix");

        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(4);
        matrix.adicionarAvaliacao(5);
        matrix.adicionarAvaliacao(3);
        matrix.adicionarAvaliacao(4);

        matrix.calcularMediaAvaliacoes();

    }
}
