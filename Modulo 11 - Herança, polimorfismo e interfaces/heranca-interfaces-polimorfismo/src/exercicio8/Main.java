package exercicio8;

import exercicio8.model.Relatorio;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um módulo de geração de documentos para um sistema
         * corporativo. Esse módulo precisa oferecer uma forma de exibir diferentes
         * tipos de relatórios, garantindo que todos sigam o mesmo padrão,
         * independentemente de seu conteúdo específico.
         * 
         * Crie um programa que:
         * 
         * Defina uma interface Imprimivel com o método imprimir()
         * Implemente uma classe Relatorio que siga este contrato
         * Permita que o relatório seja criado com título e conteúdo
         * Exiba as informações no console
         * 
         * Exemplo de entrada:
         * 
         * Relatorio rel = new Relatorio(
         * "Relatório 2025",
         * "Tudo funcionando conforme esperado."
         * );
         * rel.imprimir();
         * 
         * Saída esperada:
         * 
         * Título: Relatório 2025
         * Conteúdo: Tudo funcionando conforme esperado.
         */

        Relatorio rel = new Relatorio(
                "Relatório 2025",
                "Tudo funcionando conforme esperado.");
        rel.imprimir();

    }
}
