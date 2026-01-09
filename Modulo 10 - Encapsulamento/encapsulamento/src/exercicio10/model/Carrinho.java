package exercicio10.model;

import java.util.List;

public class Carrinho {

    private double totalCompra;
    private List<Produto> itens;

    public Carrinho(List<Produto> itens) {
        this.itens = itens;
    }

    public Double calcularValorTotalPorItem(double preco, int quantidade) {
        return preco * quantidade;
    }

    public void totalCompra() {
        for (Produto produto : itens) {
            totalCompra += calcularValorTotalPorItem(produto.getPreco(), produto.getQuantidade());
        }
        System.out.println("Total da Compra R$: " + totalCompra);

    }

}
