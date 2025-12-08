import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.utils.CalculaTempo;
import br.com.alura.screenmatch.utils.Classificar;
import br.com.alura.screenmatch.utils.FiltroRecomendacao;

public class App {
    public static void main(String[] args) throws Exception {

        Filme filme = new Filme();

        filme.setNome("O hobbit");
        filme.setAnoLancamento(2021);
        filme.setDuracaoEmMin(180);

        filme.exibeFichaTecnicia();

        filme.avalia(10);
        filme.avalia(5);
        filme.avalia(7);

        System.out.println(filme.getTotalAvaliacao());

        // System.out.println(filme.somaAvaliacao);
        // System.out.println(filme.totalAvaliacao);
        System.out.println(filme.pegaMedia());

        Serie serie = new Serie();

        serie.setNome("Chefe de Guerra");
        serie.setAnoLancamento(2024);
        serie.setTemporadas(1);
        serie.setEpPorTermporada(10);
        serie.setMinPorTemporada(90);

        Filme filme1 = new Filme();

        filme1.setNome("Senhor dos Aneis");
        filme1.setAnoLancamento(2005);
        filme1.setDuracaoEmMin(120);

        CalculaTempo calculaTempo = new CalculaTempo();
        calculaTempo.inclui(filme);
        calculaTempo.inclui(filme1);
        // abaixo conceito de sobrecarga de metodos
        calculaTempo.inclui(serie);
        System.out.println(calculaTempo.getTempoTotal());

        // FILTRANDO FILME
        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(filme1);

        // FILTRANDO UM EP
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(100);
        filtroRecomendacao.filtrar(episodio);

    }
}
