package exercicio7.model;

import java.util.ArrayList;
import java.util.List;

public class Filme {

    private String nome;
    private List<Double> avaliacao = new ArrayList<>();

    public Filme(String nome) {
        this.nome = nome;
    }

    public void adicionarAvaliacao(double nota) {
        if (nota >= 0 && nota <= 5) {
            this.avaliacao.add(nota);
        } else {
            System.out.println("Não permitido avaliar");
        }
    }

    public void calcularMediaAvaliacoes() {

        double mediaGeral = 0;
        for (Double avl : avaliacao) {
            mediaGeral += avl;
        }
        mediaGeral = mediaGeral / avaliacao.size();
        System.out.printf("Média de avaliações para %s: %.2f\n",
                nome, mediaGeral);

    }

}
