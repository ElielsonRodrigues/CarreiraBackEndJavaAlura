import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        /*
         * Marcos trabalha em uma loja e precisa verificar se um cliente tem direito a
         * um desconto de 10% em sua compra. O desconto é aplicado apenas se o valor da
         * compra for maior ou igual a R$ 100,00. Para isso, ele quer um programa que
         * permita inserir o valor da compra e exiba se o desconto foi aplicado ou não,
         * juntamente com o novo valor após o desconto, caso aplicável.
         * 
         * Com base nesse cenário, crie um programa que receba o valor da compra e exiba
         * uma mensagem informando se o desconto foi aplicado ou não.
         * 
         * Exemplo de entrada:
         * Digite o valor da compra: 120.0
         * 
         * Saída esperada:
         * Desconto de 10% aplicado.
         * Novo valor: R$ 108.0
         * 
         * Caso o valor da compra seja menor que R$ 100,00, o programa exibirá por
         * exemplo:
         * Nenhum desconto aplicado.
         * Valor total: R$ 80.0
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da compra: ");
        double valorCompra = sc.nextDouble();
        double desconto = 0;
        double valorFinal = 0;

        if (valorCompra >= 100) {
            desconto = valorCompra / 10;
            valorFinal = valorCompra - desconto;

            System.out.println("Desconto 10% aplicado. Valor Final R$ " + valorFinal);

        } else {
            valorFinal = valorCompra;
            System.out.println("Nenhum desconto aplicado. Valor Final R$ " + valorFinal);
        }
        sc.close();
    }
}
