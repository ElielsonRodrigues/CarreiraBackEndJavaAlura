package br.com.alura.screenmatch.desafio;

public class Titulo implements Comparable<Titulo> {
    
    private String nome;

    public Titulo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int compareTo(Titulo titulo) {
         return this.getNome().compareTo(titulo.getNome());
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
}
