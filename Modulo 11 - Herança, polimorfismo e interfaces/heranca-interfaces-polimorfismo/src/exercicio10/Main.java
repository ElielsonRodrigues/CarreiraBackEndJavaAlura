package exercicio10;

import exercicio10.model.ArCondicionado;
import exercicio10.model.Luz;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de automação residencial para controlar
         * dispositivos eletrônicos, como luzes e ar-condicionado. O sistema precisa
         * garantir que, ao acionar os comandos de ligar ou desligar, o usuário receba
         * uma mensagem, informando se a ação foi realmente executada ou se o
         * dispositivo já estava no estado desejado.
         * 
         * Todos os dispositivos devem seguir a mesma estrutura de controle: devem poder
         * ser ligados e desligados, e devem manter internamente um estado (ligado ou
         * desligado) para evitar ações desnecessárias.
         * 
         * Crie um programa que:
         * 
         * Defina uma interface Controlavel com dois métodos:
         * ligar()
         * desligar()
         * Tenha duas classes: Luz e ArCondicionado, que implementam essa interface.
         * Cada classe deve conter um atributo booleano ligado, iniciado como false, que
         * representa o estado atual do dispositivo.
         * Ao chamar os métodos:
         * Se o dispositivo estiver desligado e o método ligar() for chamado, ele deve
         * mudar o estado para ligado e exibir a mensagem: "Luz ligada." ou
         * "Ar-condicionado ligado."
         * Se já estiver ligado, e ligar() for chamado novamente, exibir:
         * "Luz já está ligada." ou "Ar-condicionado já está ligado."
         * O mesmo vale para o método desligar(), com as mensagens correspondentes.
         * 
         * Exemplo de entrada:
         * 
         * Luz luz = new Luz();
         * ArCondicionado ar = new ArCondicionado();
         * 
         * luz.ligar();
         * luz.ligar();
         * luz.desligar();
         * 
         * ar.desligar();
         * 
         * Saída esperada:
         * 
         * Luz ligada.
         * Luz já está ligada.
         * Luz desligada.
         * Ar-condicionado já está desligado.
         * 
         */

        Luz luz = new Luz();
        ArCondicionado ar = new ArCondicionado();

        luz.ligar();
        luz.ligar();
        luz.desligar();

        ar.desligar();

    }
}
