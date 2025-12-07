public class App {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme();

        filme.nome = "O hobbit";
        filme.anoLancamento = 2021;
        filme.duracaoEmMin = 180;

        filme.exibeFichaTecnicia();

        filme.avalia(10);
        filme.avalia(5);
        filme.avalia(7);

        System.out.println(filme.somaAvaliacao);
        System.out.println(filme.totalAvaliacao);
        System.out.println(filme.pegaMedia());

    }
}
