package br.com.alura.screenmatch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

            if (item instanceof Filme filme) { // POSSO DECLARAR DIRETAMENTE AKI
                System.out.println("Classificação: " + filme.getClassificacao());    //chamar o objeto dirtamente 
            }
            //Filme filme = (Filme) item; // NECESSARIO PARA NÃO GERAR UM ERRO DE COMPLICAÇÃO
            //System.out.println("Classificação: " + filme.getClassificacao());    
        }

        // USANDO LAMBDA 1
        /* 
        lista.forEach(item -> {
            System.out.println(item.getNome());
            //System.out.println(item.getAnoDeLancamento());
        });

        */
        // USANDO LAMBDA 2
        // lista.forEach(item -> System.out.println(item.getNome()));

        //USANDO Method Reference
        //lista.forEach(System.out::println);


        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println("Lista Atual : " + buscaPorArtista);

        Collections.sort(buscaPorArtista); // ORDENANDO A LISTA
        System.out.println("Lista Ordenada : " + buscaPorArtista);

        
        System.out.println("Lista Titulos : " + buscaPorArtista);
        Collections.sort(lista);
        System.out.println("Lista Titulos Ordenada: " + lista);


        //ORDENANDO POR ANO
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por Ano: " + lista);

       
    }
}
