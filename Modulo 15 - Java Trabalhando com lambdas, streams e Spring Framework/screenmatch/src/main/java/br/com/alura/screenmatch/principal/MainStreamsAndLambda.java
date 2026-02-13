package br.com.alura.screenmatch.principal;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainStreamsAndLambda {

	
	public static void main(String[] args) {
		
		List<String> nomes = Arrays.asList("Jacque", "Iasmin", "Paulo", "Rodrigo", "Nico");

		nomes.stream().sorted() // ordena a lista
				.limit(3) // limita no maximo 3 primeiros elementos
				.filter(n -> n.startsWith("N")) // encontra o elemento com a condição
				.map(n -> n.toUpperCase()) // Retorna o elemento e em caixa alta
				.forEach(System.out::println);
		
	
		// Filter: permite filtrar os elementos da stream com base em uma condição. 
		// Por exemplo, podemos filtrar uma lista de números para retornar apenas os números pares.
		List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> numerosPares = numeros.stream()
		                                   .filter(n -> n % 2 == 0)
		                                   .collect(Collectors.toList());

		System.out.println(numerosPares); // Output: [2, 4, 6, 8, 10]

		
		
		// Map: permite transformar cada elemento da stream em outro tipo de dado.
		// Por exemplo, podemos transformar uma lista de strings em uma lista de seus respectivos tamanhos.
		List<String> palavras = Arrays.asList("Java", "Stream", "Operações", "Intermediárias");

		List<Integer> tamanhos = palavras.stream()
		                                .map(s -> s.length())
		                                .collect(Collectors.toList());

		System.out.println(tamanhos); // Output: [4, 6, 11, 14]

		
		// ForEach: permite executar uma ação em cada elemento da stream.
		// Por exemplo, podemos imprimir cada elemento da lista.
		
		List<String> nomesConc = Arrays.asList("João", "Maria", "Pedro", "Ana");

		nomesConc.stream()
		     .forEach(nome -> System.out.println("Olá, " + nome + "!"));

		// Output:
		// Olá, João!
		// Olá, Maria!
		// Olá, Pedro!
		// Olá, Ana!

		// Collect: permite coletar os elementos da stream em uma coleção ou em outro tipo de dado. 
		// Por exemplo, podemos coletar os números pares em um conjunto.
		
		List<Integer> numeros1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Set<Integer> numerosPares2 = numeros1.stream()
		                                   .filter(n -> n % 2 == 0)
		                                   .collect(Collectors.toSet());

		System.out.println(numerosPares2); // Output: [2, 4, 6, 8, 10]

		
	}
	
}
