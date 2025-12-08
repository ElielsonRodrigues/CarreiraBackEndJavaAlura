package br.com.alura.screenmatch.utils;

public class FiltroRecomendacao {

    public void filtrar(Classificar classificar) {
        if (classificar.getClassificacao() >= 4) {
            System.out.println("Muito recomendado");
        } else if (classificar.getClassificacao() >= 2) {
            System.out.println("recomendado");
        } else {
            System.out.println("não avaliado");
        }
    }
}
