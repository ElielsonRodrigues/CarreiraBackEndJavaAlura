import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        System.err.println("Informe o nome do filme:");
        var nomefilme = sc.nextLine();

        String chave = "5a10db1c";
        String url = "http://www.omdbapi.com/?t="+ nomefilme + "&apikey="+chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
             .uri(URI.create(url))
             .build();

        HttpResponse<String> response = client
            .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        Gson gson = new Gson();


        

        

    }
}
