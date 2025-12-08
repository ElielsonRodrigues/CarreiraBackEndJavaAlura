package br.com.alura.screenmatch.model;

public class Serie extends Titulo {

    private int temporadas;
    private boolean ativa;
    private int epPorTermporada;
    private int minPorTemporada;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpPorTermporada() {
        return epPorTermporada;
    }

    public void setEpPorTermporada(int epPorTermporada) {
        this.epPorTermporada = epPorTermporada;
    }

    public int getMinPorTemporada() {
        return minPorTemporada;
    }

    public void setMinPorTemporada(int minPorTemporada) {
        this.minPorTemporada = minPorTemporada;
    }

    @Override // sobrescrevendo metodo da classe pai "Titulo"
    public int getDuracaoEmMin() {
        // TODO Auto-generated method stub
        return temporadas * epPorTermporada * minPorTemporada;
        // return super.getDuracaoEmMin();
    }

}
