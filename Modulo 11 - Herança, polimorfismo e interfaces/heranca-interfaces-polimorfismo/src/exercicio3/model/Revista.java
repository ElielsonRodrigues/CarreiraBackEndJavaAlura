package exercicio3.model;

public class Revista extends Midia {

    private String edicao;

    public Revista(String titulo, int anoPublicacao, String edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public void exibirInfo() {
        System.out.printf("Código: %s | Revista: %s - Autor: %s \n",
                this.getTresDigitos(this.getTitulo()) + this.getAnoPublicacao(),
                this.getTitulo(),
                edicao);
    }

}
