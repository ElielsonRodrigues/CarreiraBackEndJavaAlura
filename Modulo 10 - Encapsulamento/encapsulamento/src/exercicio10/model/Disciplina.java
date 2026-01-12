package exercicio10.model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

    private String nome;
    private List<Double> notas = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.notas.add(nota);
        } else {
            System.out.println("Nota inválida ignorada: " + nota);
        }
    }

    public void calcularMedia() {

        Double media = 0.0;

        for (Double somasNota : notas) {
            media += somasNota;
        }
        media = media / this.notas.size();
        System.out.println("Total de notas válidas: " + this.notas.size());
        System.out.printf("Média em %s: %.2f", this.nome, media);

    };

}
