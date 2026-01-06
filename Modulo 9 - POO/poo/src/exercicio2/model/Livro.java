package exercicio2.model;

public class Livro {

    private String titulo;
    private String autor;
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void exibeLivro() {
        System.out.printf("'%s' de %s com %d paginas\n",
                titulo,
                autor,
                paginas);
    }

}
