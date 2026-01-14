package exercicio5.model;

public class CartaoCredito extends Pagamento {

    private Double taxa;

    public CartaoCredito(Double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {

        taxa = this.getValor() * 0.03;

        System.out.printf("Boleto de R$ %.2f gerado com sucesso! (Taxa R$ %.2f)", this.getValor(), taxa);
    }

}
