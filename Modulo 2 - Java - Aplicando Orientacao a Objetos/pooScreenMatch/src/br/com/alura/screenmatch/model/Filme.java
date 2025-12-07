package br.com.alura.screenmatch.model;

public class Filme {

    private String nome;
    private int anoLancamento;
    private boolean incluindoPremium;
    private double somaAvaliacao;
    private int totalAvaliacao;
    private int duracaoEmMin;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isIncluindoPremium() {
        return incluindoPremium;
    }

    public void setIncluindoPremium(boolean incluindoPremium) {
        this.incluindoPremium = incluindoPremium;
    }

    public double getSomaAvaliacao() {
        return somaAvaliacao;
    }

    public void setSomaAvaliacao(double somaAvaliacao) {
        this.somaAvaliacao = somaAvaliacao;
    }

    public int getTotalAvaliacao() {
        return totalAvaliacao;
    }

    public void setTotalAvaliacao(int totalAvaliacao) {
        this.totalAvaliacao = totalAvaliacao;
    }

    public int getDuracaoEmMin() {
        return duracaoEmMin;
    }

    public void setDuracaoEmMin(int duracaoEmMin) {
        this.duracaoEmMin = duracaoEmMin;
    }

    public void exibeFichaTecnicia() {
        System.out.println("""
                nome: %s
                ano: %d
                """.formatted(getNome(), getAnoLancamento()));
    }

    public void avalia(double nota) {
        setSomaAvaliacao(getSomaAvaliacao() + nota);
        setTotalAvaliacao(getTotalAvaliacao() + 1);
    }

    public double pegaMedia() {
        return getSomaAvaliacao() / getTotalAvaliacao();
    }

}
