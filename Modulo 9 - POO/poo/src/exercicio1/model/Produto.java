package exercicio1.model;

public class Produto {

    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void exibeProtudo() {
        System.out.printf("Produto:  %s \nPreço: R$ %.2f \nQuantidade: %d \n",
                nome,
                preco,
                quantidade);
    }

}
