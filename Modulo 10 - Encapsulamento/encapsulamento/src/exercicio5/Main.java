package exercicio5;

import exercicio5.model.Dispositivo;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está desenvolvendo um sistema para dispositivos portáteis,
         * onde precisa monitorar o nível de energia da bateria. O dispositivo deve
         * informar ao usuário o status atual da bateria, garantindo que os valores
         * sempre estejam dentro de um intervalo válido.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe que armazene o nível da bateria.
         * Permita definir o nível apenas se estiver entre 0 e 100.
         * Forneça uma forma de exibir o status da bateria com base no nível atual:
         * Até 20%: “Bateria fraca”
         * Entre 21% e 79% : “Bateria ok”
         * Igual ou acima de 80%: “Bateria cheia”
         * Instancie essa classe, defina um nível e exiba o status.
         * 
         * Exemplo de entrada:
         * 
         * Bateria b = new Bateria();
         * b.setNivel(85);
         * 
         * Saída esperada:
         * Status: Bateria cheia
         */

        Dispositivo dispositivo = new Dispositivo();
        dispositivo.setAutonomia(-50);

    }
}
