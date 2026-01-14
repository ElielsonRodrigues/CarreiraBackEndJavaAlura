package exercicio5.model;

public class Pix extends Pagamento {

    public Pix(Double valor) {
        super(valor);
    }

    @Override
    public void confirmarPagamento() {
        System.out.printf("Pagamento via Pix de R$ %.2f confirmado", this.getValor());
    }

}
