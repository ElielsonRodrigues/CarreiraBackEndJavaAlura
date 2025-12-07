public class Filme {

    String nome;
    int anoLancamento;
    boolean incluindoPremium;
    double somaAvaliacao;
    int totalAvaliacao;
    int duracaoEmMin;

    void exibeFichaTecnicia() {
        System.out.println("""
                nome: %s
                ano: %d
                """.formatted(nome, anoLancamento));
    }

    void avalia(double nota) {
        somaAvaliacao += nota;
        totalAvaliacao++;
    }

    double pegaMedia() {
        return somaAvaliacao / totalAvaliacao;
    }

}
