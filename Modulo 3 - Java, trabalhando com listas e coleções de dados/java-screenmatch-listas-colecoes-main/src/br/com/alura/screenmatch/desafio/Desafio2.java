package br.com.alura.screenmatch.desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double limite = 0.0;
        int operacao = 1;
        
        String descricao = "";
        double valorItem = 0.0;
        double totalCompras = 0.0;
        

        System.out.println("Digite o limite do cartão:");
        limite = sc.nextDouble();
        sc.nextLine();// limpa o buffer novamente

        List<String> compras  = new ArrayList<>();

        while (operacao != 0) {

            System.out.println("\nDigite a descrição da compra:");
            descricao = sc.nextLine();

            System.out.println("\nDigite o valor da compra:");
            valorItem = sc.nextDouble();

            System.out.println("\nCompra realizada");
            sc.nextLine(); // limpa o buffer novamente
            compras.add(descricao + " - " + valorItem);

            totalCompras += valorItem;

            if (valorItem > limite) {
                System.out.println("Operação não permitida...");
                System.out.println("Valor do item maior que o limite");
            }else if (totalCompras > limite) {
                System.out.println("Operação não permitida...");
                System.out.println("Valor total da compra : " + totalCompras );
                System.out.println("Seu limite : " + limite );
                System.out.println("Saindo do sistema...");
            }else {
                if (operacao == 0) {
                    System.out.println("\nCOMPRAS REALIZADAS:");
                    for (String item : compras) {
                        System.out.println(item);
                    }
                    System.out.println("\nSaldo do cartão: " + totalCompras);
                }
            }

            System.out.println("\nDigite 0 para sair ou 1 para continuar");
            operacao = sc.nextInt();
            sc.nextLine(); // limpa o buffer novamente
        }
    }
}
