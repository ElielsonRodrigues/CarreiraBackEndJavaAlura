package br.com.alura.screenmatch.principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.record.Episodios;
import br.com.alura.screenmatch.record.Serie;
import br.com.alura.screenmatch.record.Temporada;
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
		
		List<Episodios> juntaEpisodiosTodasTemporadas = temporadas
				.stream()
				.flatMap(t -> t.episodios().stream()) // jutando episodio de todas as temporadas
				//.toList() // Não permite a inserção de novos elementos na lista ela e imutavel!
				.collect(Collectors.toList()); // imprimindo os episodios
		
		
		// usando o toList não é permitido lança uma execeção
		//juntaEpisodiosTodasTemporadas.add(new Episodios("", 3, "", "")); 
		
		System.out.println("\n Top 5 Episodios: ");
		
		juntaEpisodiosTodasTemporadas
			.stream()
			.filter(e -> !e.avaliacao().equalsIgnoreCase("N/A")) // FILTRANDO OS EPISODIOS QUE NÃO TEM AVALIAÇÃO
			.sorted(Comparator.comparing(Episodios::avaliacao).reversed()) // COMPARANDO O EPISODIO POR AVALIAÇÃO MAIOR NOTA PARA MENOR
			.limit(5) // FILTRANDO OS 5 PRIMEIROS
			.forEach(System.out::println);
		
		//juntaEpisodiosTodasTemporadas.forEach(System.out::println);
		
		
		List<Episodio> episodios = temporadas
					.stream()
					.flatMap(t-> t.episodios() // JUNTANTOS TODOS OS EPISODIOS POR TEMPORADA
							.stream()
							.map(d -> new Episodio(t.numero(), d))) // chamando construtor para salvar na entity de episodio
							.collect(Collectors.toList()); // atribuido a lista de episodios
		
		episodios.forEach(System.out::println);
		
		
		System.out.println("A partir de que ano vocÊ deseja ver os episodios?");
		
		var ano = sc.nextInt();
		sc.nextLine();
		
		LocalDate dataBusca = LocalDate.of(ano, 1, 1); // pega a patir do primeiro dia do primeiro mes do ano informado;
		DateTimeFormatter formtt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		episodios
			.stream().
			filter(e -> e.getLancamento() != null && e.getLancamento().isAfter(dataBusca)) // Filtra somente os episodios depoi da data de busca;
			.forEach(e -> System.out.println(
					"Temporada: " + e.getTemporada() +
					", Episodio: " + e.getTitulo() +
					", Dt Lançamento: " + e.getLancamento().format(formtt)
			));
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		 new Main().exibeMenu();
	}
	
}
