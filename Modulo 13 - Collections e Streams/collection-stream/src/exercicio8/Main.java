package exercicio8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está trabalhando no sistema de gestão de uma escola, garantindo que a
         * lista de estudantes esteja sempre correta. Durante uma revisão nos cadastros,
         * percebeu que um nome foi adicionado incorretamente: “Pedro”. Para evitar
         * confusões na emissão de certificados e registros, você precisa corrigir essa
         * informação imediatamente.
         * 
         * Sua tarefa é remover o nome “Pedro” da lista. Considere que a lista inicial
         * possui os seguintes nomes: Joana, Lucas, Pedro e Antônio.
         * 
         * Saída esperada: s
         * Lista inicial: [Joana, Lucas, Pedro, Antônio]
         * Lista após a exclusão: [Joana, Lucas, Antônio]
         * 
         */

        List<String> pessoas = new ArrayList<>();

        pessoas.add("Joana");
        pessoas.add("Lucas");
        pessoas.add("Pedro");
        pessoas.add("Antônio");

        System.out.println("Lista inicial: " + pessoas);

        pessoas.remove("Pedro");

        System.out.println("Lista após a exclusão: " + pessoas);

    }
}
