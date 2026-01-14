package exercicio9.model;

public abstract class OperacaoBancaria implements AcaoBancaria {

    private Double valor;

    public OperacaoBancaria(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}
