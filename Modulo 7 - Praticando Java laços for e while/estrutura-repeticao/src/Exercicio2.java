public class Exercicio2 {
    public static void main(String[] args) {
        /*
         * João recebeu uma lista de valores representando as receitas de sua loja de
         * roupas. Ele quer calcular a soma total dessas receitas para entender o
         * desempenho financeiro semanal.
         * 
         * int[] valores = {10, 20, 30, 40, 50};
         * 
         * Crie um programa que ajude João a calcular o valor total.
         * 
         * Saída esperada:
         * A soma total das receitas é: 150
         */

        int[] valores = { 10, 20, 30, 40, 50 };

        int total = 0;
        for (int item : valores) {
            total += item;
        }

        System.out.println("A soma total das receitas é: " + total);

    }

}
