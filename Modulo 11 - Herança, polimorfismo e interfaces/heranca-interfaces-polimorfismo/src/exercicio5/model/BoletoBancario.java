package exercicio5.model;

public class BoletoBancario extends Pagamento {

    private Double taxa;

    public BoletoBancario(Double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {

        taxa = this.getValor() * 0.01;

        System.out.printf("Boleto de R$ %.2f gerado com sucesso! (Taxa R$ %.2f)", this.getValor(), taxa);

    }

}
