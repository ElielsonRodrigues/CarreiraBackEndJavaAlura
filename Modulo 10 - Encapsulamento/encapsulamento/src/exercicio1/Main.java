package exercicio1;

import exercicio1.model.Carro;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema para uma oficina mecânica registrar os
         * veículos que chegam para manutenção. Cada carro precisa ser identificado com
         * algumas informações para o controle interno.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe com os atributos modelo, placa e ano.
         * Defina uma instancia dessa classe através do método construtor.
         * Exiba as informações do veículo no console.
         * 
         * Exemplo de entrada:
         * 
         * Carro gol = new Carro("Gol", "ABC-1234", 2020);
         * 
         * Saída esperada:
         * Veículo cadastrado:
         * Modelo: Gol
         * Placa: ABC-1234
         * Ano: 2020
         */

        Carro gol = new Carro("Gol Bola", "ABC-1234", 2010);

        gol.exibeVeiculo();
    }
}
