package exercicio9.model;

public class Deposito extends OperacaoBancaria {

    public Deposito(Double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Deposito de R$ %.2f realizado!\n", this.getValor());
    }

}
