package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import br.com.alura.screenmatch.model.Episodios;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Temporada;
import br.com.alura.screenmatch.utils.ConsumerApi;
import br.com.alura.screenmatch.utils.ConverterData;

public class Main {

	
	private final String ENDERECO = "http://www.omdbapi.com/?t=";
	private final String API_KEY = "&apikey=5a10db1c";
	
	Scanner sc = new Scanner(System.in);
	
	private ConsumerApi consumerApi = new ConsumerApi();
	private ConverterData conversor = new ConverterData();
	
	public void exibeMenu() {
		
		System.out.println("Digite o nome da serie: ");
		var nomeSerie = sc.nextLine();
		
		// CONSUMINDO API
		var json = consumerApi.obterDados(ENDERECO + 
				nomeSerie.replace(" ", "+") + API_KEY);
		
		// CONVERTENDO DADOS DO JSON DA API
		Serie serie = conversor.obterDados(json,Serie.class);

		// IMPRIMINDO DADOS DA API
		System.out.println(serie);
		
		//CRIA LISTA DE TEMPORADAS
		List<Temporada> temporadas = new ArrayList<>();
		
		for (int i = 1; i <= serie.temporadas() ; i++) {
			//CONSUME A API RETORNANDO AS TEMPORADAS DE ACORDO COM JSON DE SERIE
			json = consumerApi.obterDados(ENDERECO +
										  nomeSerie.replace(" ", "+") +
										  "&season=" + i +
										  API_KEY);
			
			// ATRIBUI TEMPORADA AO UM OBJETO
			Temporada temporada = conversor.obterDados(json, Temporada.class);
			
			// INCLUIR NA LISTA
			temporadas.add(temporada);
			
		}
		temporadas.forEach(System.out::println);
		
		// USANDO FOR NORMAL
		/*
		for(int i = 0; i < serie.temporadas(); i++){
            List<Episodios> episodiosTemporada = temporadas.get(i).episodios();
            for(int j = 0; j< episodiosTemporada.size(); j++){
                    System.out.println(episodiosTemporada.get(j).titulo());
            }
		}*/
		
		// USANDO LAMBDA
		temporadas.forEach(
					t-> t.episodios().forEach(
							e-> System.out.println(e.titulo())));
		
	}
	
	
	public static void main(String[] args) {
		
		 new Main().exibeMenu();
	}
	
}
