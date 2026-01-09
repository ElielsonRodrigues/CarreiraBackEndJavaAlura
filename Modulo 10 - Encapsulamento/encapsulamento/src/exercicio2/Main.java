package exercicio2;

import java.util.ArrayList;
import java.util.List;

import exercicio2.model.Contato;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um aplicativo de agenda para uma empresa. Os
         * funcionários precisam acessar rapidamente os contatos de clientes e
         * fornecedores, mantendo as informações organizadas e fáceis de localizar.
         * 
         * Crie uma classe que:
         * 
         * Armazene contatos com nome e telefone em uma lista
         * Permita visualizar todos os contatos cadastrados
         * Formate a exibição para melhor legibilidade
         * 
         * Exemplo de entrada:
         * 
         * contatos.add(new Contato("João Silva", "(11) 99999-0000"));
         * contatos.add(new Contato("Luana Santos", "(21) 98888-0000"));
         * contatos.add(new Contato("Pedro Oliveira", "(31) 97777-0000"));
         * 
         * Saída esperada:
         * 
         * 1. João Silva - (11) 99999-0000
         * 2. Luana Santos - (21) 98888-0000
         * 3. Pedro Oliveira - (31) 97777-0000
         */

        List<Contato> agenda = new ArrayList<>();

        Contato contato1 = new Contato("João Silva", "(11) 99999-0000");
        Contato contato2 = new Contato("Luana Santos", "(21) 98888-0000");
        Contato contato3 = new Contato("Pedro Oliveira", "(31) 97777-0000");

        agenda.add(contato1);
        agenda.add(contato2);
        agenda.add(contato3);

        for (int i = 0; i < agenda.size(); i++) {
            System.out.println((i + 1) + ". " + agenda.get(i).getNome() + " - " + agenda.get(i).getTelefone());
        }

    }
}
