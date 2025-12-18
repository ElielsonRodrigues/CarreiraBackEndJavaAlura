public class Exercicio8 {

    public static void main(String[] args) {

        double valorReais = 451.50;

        double valorDolar = 5.52;

        double valorConvertidoDolar = valorReais / valorDolar;

        System.out.println("O valor em dólares é: US$ %.2f".formatted(valorConvertidoDolar));

    }
}
