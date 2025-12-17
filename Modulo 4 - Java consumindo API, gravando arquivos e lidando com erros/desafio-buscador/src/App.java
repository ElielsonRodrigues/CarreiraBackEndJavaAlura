import java.util.Scanner;

import model.Endereco;
import service.EnderecoService;

public class App {
    public static void main(String[] args) throws Exception {

        EnderecoService enderecoService = new EnderecoService();
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o cep?");
        var cep = sc.nextLine();

        try {
            Endereco endereco = enderecoService.findEndereco(cep);
            System.out.println("Endereço encontado: " + endereco);
            System.out.println("Gerando arquivo...");
            enderecoService.generateFile(endereco);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando aplicação!");
        }

    }
}
