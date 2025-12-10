package br.com.alura.screenmatch.desafio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Desafio {
    public static void main(String[] args) {

        /*
            1- Crie uma lista de números inteiros e utilize o método Collections.sort 
            para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.
            
            2- Crie uma classe Titulo com um atributo nome do tipo String. 
            Implemente a interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.
            
            3- No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. 
            Utilize o método Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.
            
            4- Crie uma lista utilizando a interface List e instancie-a tanto 
            como ArrayList quanto como LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente a implementação.
            
            5- Modifique o Exercício 4 para declarar a variável de lista como a interface List, 
            demonstrando o uso de polimorfismo.
         */

        /* DESAFIO 1 */
        List<Integer> inteiros = new ArrayList<>();
        inteiros.add(1);
        inteiros.add(4);
        inteiros.add(7);
        inteiros.add(2);
        inteiros.add(3);

        System.out.println("LISTA NORMAL: " + inteiros);
        Collections.sort(inteiros);
        System.out.println("LISTA ORDENADA: " + inteiros);


        /* DESAFIO 2 E 3*/
        List<Titulo> familia = new ArrayList<>();

        Titulo eu = new Titulo("Elielson Borges");
        Titulo pai = new Titulo("Elielson Cantao");
        Titulo mae = new Titulo("Ana");
        Titulo irma = new Titulo("Jessica");

        familia.add(eu);
        familia.add(pai);
        familia.add(mae);
        familia.add(irma);
        System.out.println("LISTA NORMAL: " + familia);
        Collections.sort(familia);
        System.out.println("LISTA ORDENADA: " + familia);

        /* DESAFIO 4 */
        List<String> lt = new LinkedList<>();
        List<String> lt2 = new ArrayList<>();

        lt.add("AAA");
        lt.add("BBB");
        lt.add("CCC");

        lt2.add("DDD");
        lt2.add("EEE");
        lt2.add("FFF");

        System.out.println("Array List: " + lt);
        System.out.println("Linked List: " + lt2);

        /* DESAFIO 5 */
        List<String> ltDinamico;

        // Trocando para ArrayList
        ltDinamico = new ArrayList<>();
        ltDinamico.add("Maçã");
        ltDinamico.add("Banana");
        ltDinamico.add("Laranja");
        System.out.println("Implementação atual ArrayList: " + ltDinamico);

        // Trocando para LinkedList
        ltDinamico = new LinkedList<>();
        ltDinamico.add("Carro");
        ltDinamico.add("Moto");
        ltDinamico.add("Bicicleta");
        System.out.println("Implementação atual LinkedList: " + ltDinamico);
        
    }
}
