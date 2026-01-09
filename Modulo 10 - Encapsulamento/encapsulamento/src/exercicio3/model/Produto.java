package exercicio3.model;

public class Produto {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void checkPreco() {
        if (preco < 0) {
            System.out.println("Preço inválido");
            preco = 0.0;
            System.out.println("Preço: " + preco);
        } else {
            System.out.println("Preço: " + preco);
        }
        System.out.println("Produto: " + nome);
    }
}
