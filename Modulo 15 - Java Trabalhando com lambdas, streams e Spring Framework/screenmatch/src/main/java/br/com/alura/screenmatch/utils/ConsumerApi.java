package br.com.alura.screenmatch.utils;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumerApi {
	
	
	String chave = "5a10db1c";
	
    //String url = "http://www.omdbapi.com/?t="+ busca.replace(" ", "+") + "&apikey="+chave;

	
	public String obterDados(String endereco) {
	    HttpClient client = HttpClient.newHttpClient();
	    HttpRequest request = HttpRequest.newBuilder()
	            .uri(URI.create(endereco))
	            .build();
	    HttpResponse<String> response = null;
	    try {
	        response = client
	                .send(request, HttpResponse.BodyHandlers.ofString());
	    } catch (IOException e) {
	        throw new RuntimeException(e);
	    } catch (InterruptedException e) {
	        throw new RuntimeException(e);
	    }

	    String json = response.body();
	    return json;
	}

}
