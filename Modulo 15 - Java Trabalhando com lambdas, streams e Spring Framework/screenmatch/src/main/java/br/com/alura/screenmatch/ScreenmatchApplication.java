package br.com.alura.screenmatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
		/*
		String urlEp = "http://www.omdbapi.com/?t=Game+of+Thrones&season=2&episode=2&apikey=5a10db1c";

		// CONSUMINDO DADOS DO EPISODIO
		json = new ConsumerApi().obterDados(urlEp);
		Episodios episodiosConvertido = conversor.obterDados(json, Episodios.class);

		// IMPRIMINDO DADOS DO EPSODIO
		System.out.println(episodiosConvertido);
		
		List<Temporada> temporadas = new ArrayList<>();
		
		for (int i = 1; i <= serieConvertida.temporadas(); i++) {
			json = new ConsumerApi().obterDados("http://www.omdbapi.com/?t=Game+of+Thrones&season="+i+"&apikey=5a10db1c");
			Temporada temporadaConvertida = conversor.obterDados(json, Temporada.class);
			temporadas.add(temporadaConvertida);
		}
		
		//USANDO METHOD REFERENCE, PARA PRINTAR INFORMAÇÕES DA LISTA
		temporadas.forEach(System.out::println);
		*/
	
	}
}
