import br.com.alura.sesafiomusicas.model.Musica;
import br.com.alura.sesafiomusicas.model.Podcast;
import br.com.alura.sesafiomusicas.model.utils.ClassificarPreferidas;

public class App {
    public static void main(String[] args) throws Exception {

        Musica musica1 = new Musica();
        musica1.setTitulo("Foreve Youg");
        musica1.setArtista("Alphavilee");

        for (int i = 0; i < 1000; i++) {
            musica1.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            musica1.curte();
        }
        /* */
        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("Java 25 - Novidades");
        podcast1.setApresentador("Michelli Brito");

        for (int i = 0; i < 5000; i++) {
            podcast1.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            podcast1.curte();
        }

        ClassificarPreferidas preferidas = new ClassificarPreferidas();
        preferidas.inclui(musica1);
        preferidas.inclui(podcast1);
    }
}
