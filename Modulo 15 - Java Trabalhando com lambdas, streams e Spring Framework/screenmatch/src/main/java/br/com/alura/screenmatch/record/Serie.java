package br.com.alura.screenmatch.record;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // ignora o que não encontrar
public record Serie(@JsonAlias("Title") String titulo, 
					@JsonAlias("totalSeasons") Integer temporadas,
					@JsonAlias("imdbRating") String avaliacao 
					/*@JsonProperty("imbVotes") String votos*/) {

	/*
	@JsonProperty

	É usada para definir explicitamente o nome do campo no JSON, tanto na
	serialização (Java → JSON) quanto na desserialização (JSON → Java).

	Principais usos:

		Mapear nomes diferentes entre atributo Java e campo JSON
		Forçar um nome específico no JSON
		Tornar campos obrigatórios
		Controlar acesso (read-only / write-only)
	*/
	
	/*
    @JsonAlias
    É usada somente na desserialização (JSON → Java) 
    para aceitar nomes alternativos de um mesmo campo.

    Não altera o nome do campo na saída do JSON.

	Quando usar:

		Compatibilidade com APIs antigas
		Aceitar múltiplos formatos de JSON
		Migração de contratos de API
	*/

}
