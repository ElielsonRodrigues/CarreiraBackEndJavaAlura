package exercicio3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você é uma pessoa desenvolvedora de software responsável por otimizar o
         * sistema de gestão de eventos de uma empresa. Recentemente, a organização
         * relatou um problema: eventos duplicados estão aparecendo na lista de
         * cadastros, o que pode gerar inconsistências nos relatórios e dificultar
         * processos administrativos.
         * 
         * Sua tarefa é exibir a lista de eventos sem valores duplicados.
         * 
         * Exemplo de entrada:
         * 
         * eventos.add("IA Conference Brasil");
         * eventos.add("AI Summit");
         * eventos.add("DevFest");
         * eventos.add("Cloud Expo");
         * eventos.add("IA Conference Brasil");
         * eventos.add("DevFest");
         * 
         * Saída esperada:
         * 
         * Lista de eventos: [DevFest, AI Summit, Cloud Expo, IA Conference Brasil]
         */

        List<String> eventos = new ArrayList<>();

        eventos.add("IA Conference Brasil");
        eventos.add("AI Summit");
        eventos.add("DevFest");
        eventos.add("Cloud Expo");
        eventos.add("IA Conference Brasil");
        eventos.add("DevFest");

        Set<String> semDuplicados = new HashSet<>(eventos);

        System.out.println("Lista de Eventos:" + semDuplicados);

    }
}
