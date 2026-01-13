package exercicio3.model;

public class Midia {

    private String titulo;
    private int anoPublicacao;

    public Midia(String titulo, int anoPublicacao) {
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getTresDigitos(String att) {
        return "LIB-" + att.substring(0, 3).toUpperCase();
    }

}
