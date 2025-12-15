import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.exception.ErroConversaoAno;
import br.com.alura.screenmatch.model.Titulo;
import br.com.alura.screenmatch.record.TituloOmdbRecord;

public class App {
    public static void main(String[] args) throws Exception {
        

        try {
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

            String json = response.body();
            //System.out.println(json);

            Gson gson = new Gson();

            // Aplicando a converson utilizando a instancia do gson
            Titulo titulo = gson.fromJson(json,Titulo.class);
            //System.out.println(titulo.getNome());
            
            /*
                Atenção! Por conta a serialização do json vim 'name' e minha classe
                titulo o atributo ser 'nome' e retornado nome porque o gson não consegue
                fazer a descerialização;
                Para que se obtenha sucesso e necessario anotar os atributos com a classe
                @SerializedName("Title"), porem em caso de consumo de apis de diferentes serviços
                e levando em consideração boas preaticas necessario criar uma record(oficialmente no Java 16, mas disponível desde o Java 14)
                como podemos ver abaixo
            */
            Gson gsonBuild = new GsonBuilder()
                            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                            .create();
            
            TituloOmdbRecord tituloOmdbRecord = gsonBuild.fromJson(json, TituloOmdbRecord.class);
            System.out.println(tituloOmdbRecord);

            
            
            Titulo t = new Titulo(tituloOmdbRecord);
            System.out.println("Titulo Convertido: " + t);


            //Classe do java para escrever dados em um arquivo!
            FileWriter escrevendo = new FileWriter("filmes.txt");
            
            //escrevendo 'Titulo no arquivo'
            escrevendo.write(titulo.toString());

            //encerrando buffer
            escrevendo.close();


        //utilizando tratamento de execções
        } catch (NumberFormatException e) {
            System.out.println("Acontece um erro: " + e.getMessage());
        } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
        } catch (ErroConversaoAno erroConversaoAno){
            System.out.println(erroConversaoAno.getMessage());
        }
        System.out.println("O programa finalizou corretamente!");

        /*
            A partir do Java 7, a linguagem introduziu uma nova 
            funcionalidade chamada "multi-catch", que permite capturar
            várias exceções em um único bloco catch.
            Essa funcionalidade pode tornar o código mais conciso e
            legível, reduzindo a repetição de código.
        */

        /* Exemplo usando mult-catch */
        /* 
        try {
            metodoQuePodeLancarExcecao();
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("tratando erro...");
        }
        */
        
    }
}
