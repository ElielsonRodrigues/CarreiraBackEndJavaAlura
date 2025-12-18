public class Exercicio4 {
    public static void main(String[] args) {

        /*
         * Você está desenvolvendo um sistema de monitoramento de temperatura para uma
         * estufa de plantas. Você recebe os dados de temperatura em graus Celsius, mas
         * precisa exibi-los em Fahrenheit para um relatório que será enviado para um
         * cliente nos Estados Unidos.
         * 
         * Crie um programa que receba uma temperatura em graus Celsius (int) e exiba a
         * temperatura convertida em graus Fahrenheit (double). A fórmula para conversão
         * é:
         * 
         * Fahrenheit = (Celsius * 9 / 5) + 32
         * Exemplo de entrada: int celsius = 20;
         * Saída esperada: A temperatura em graus Fahrenheit é: 68.0
         */

        // como existe a conversão Implícita não é ncessaro fazer o cast
        // int → double ✔ implícita
        // double → int ❌ explícita (cast obrigatório)

        int celsius = 20;
        double tempFahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + tempFahrenheit);

    }
}
