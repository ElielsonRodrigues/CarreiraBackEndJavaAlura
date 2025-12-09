package br.com.alura.screenmatch;

import java.util.ArrayList;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class Lista {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(10);
        
        Filme outroFilme = new Filme("Avatar",2023);
        meuFilme.avalia(4);
        
        //OUTRA FORMA DE INSTANCIAR OBJETO
        var filmeDoPaulo = new Filme("Dogville",2023);
        meuFilme.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        // DESSA FORMA NÃO E POSSIVEL ADICIONAR SERIES NA LISTA
        // ArrayList<Filme> lista = new ArrayList<>();

        // DESSA FORMA CONSEGUIMOS INSERIR TANTOS FILMES COMO SERIES
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoPaulo);
        lista.add(lost);

        for (Titulo item : lista) {
            
            System.out.println(item.getNome());

            Filme filme = (Filme) item; // NECESSARIO PARA NÃO GERAR UM ERRO DE COMPLICAÇÃO
            System.out.println("Classificação: " + filme.getClassificacao());

        }


    }
}
