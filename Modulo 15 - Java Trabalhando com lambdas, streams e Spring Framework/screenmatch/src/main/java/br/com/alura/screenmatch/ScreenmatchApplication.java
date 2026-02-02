package br.com.alura.screenmatch;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.alura.screenmatch.model.Episodios;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Temporada;
import br.com.alura.screenmatch.utils.ConsumerApi;
import br.com.alura.screenmatch.utils.ConverterData;

@SpringBootApplication
public class ScreenmatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	
		// CONSUMINDO DADOS DA API
	    String url = "http://www.omdbapi.com/?t=Game+of+Thrones&apikey=5a10db1c";
		var json = new ConsumerApi().obterDados(url);
		// IMPRIMINDO DADOS DA API
		System.out.println(json);
				
		//INSTANCIANDO CONVERSOR DE DADOS
		ConverterData conversor = new ConverterData();
		
		// ATRIBUINDO A CONVERSÃO A CLASSE SERIE
		Serie serieConvertida =  conversor.obterDados(json, Serie.class);
				
		// IMPRIMINDO A SERIE CONVERTIDA
		System.out.println(serieConvertida);
		
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
		
		
		
	
	}
}
