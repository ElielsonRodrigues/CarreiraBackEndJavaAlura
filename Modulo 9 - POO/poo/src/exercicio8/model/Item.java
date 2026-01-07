package exercicio8.model;

public class Item {

    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void vender(int quantVendidos) {
        if (quantidade >= quantVendidos) {
            quantidade -= quantVendidos;
            System.out.printf("\nVenda realizada. Estoque restante de %s: %d", nome, quantidade);
        } else {
            System.out.println("\nEstoque insuficiente");
        }

    }

}
