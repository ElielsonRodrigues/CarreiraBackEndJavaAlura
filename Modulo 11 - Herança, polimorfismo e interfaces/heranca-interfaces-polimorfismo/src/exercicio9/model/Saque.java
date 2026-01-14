package exercicio9.model;

public class Saque extends OperacaoBancaria {

    public Saque(Double valor) {
        super(valor);
    }

    @Override
    public void executar() {
        System.out.printf("Saque de R$ %.2f realizado. \n", this.getValor());
    }

}
