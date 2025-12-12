package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;

import br.com.alura.screenmatch.exception.ErroConversaoAno;
import br.com.alura.screenmatch.record.TituloOmdbRecord;

public class Titulo implements Comparable<Titulo> {

    // ex. usando @SerializedName
    @SerializedName("Title") // Pode ser usado em casos extremos;
    private String nome;
    
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }
    
    public Titulo(TituloOmdbRecord tituloOmdbRecord) {
        this.nome = tituloOmdbRecord.title();

        if (tituloOmdbRecord.year().length() > 4) {
            throw new ErroConversaoAno("Não possivel converter ano tem mas que 04 caracteres");
        }

        this.anoDeLancamento = Integer.valueOf(tituloOmdbRecord.year());
        this.duracaoEmMinutos = Integer.valueOf(tituloOmdbRecord.runtime().substring(0, 2));
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    // Para realizar a ordenação atraves do metodo
    // sort e necessario sobrescrever compareTo
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Titulo [nome=" + nome + ", anoDeLancamento=" + anoDeLancamento + ", duracaoEmMinutos="
                + duracaoEmMinutos + "]";
    }
}
