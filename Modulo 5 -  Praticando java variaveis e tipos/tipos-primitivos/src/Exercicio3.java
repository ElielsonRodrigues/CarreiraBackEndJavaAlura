public class Exercicio3 {
    public static void main(String[] args) {
        /*
         * Você está desenvolvendo um aplicativo que calcula a média de notas dos
         * alunos. Para isso, você precisa armazenar as notas em variáveis do tipo
         * double. Você decide criar três variáveis chamadas nota1, nota2 e nota3, e
         * atribuir a elas os valores 7.5, 8.0 e 9.0, respectivamente e em seguida,
         * calcular a média e exibi-la na tela.
         * 
         * Para resolver essa tarefa, você deve criar um programa que:
         * 
         * Declare as variáveis nota1, nota2 e nota3
         * Atribua os valores mencionados.
         * Calcule a média das notas.
         * Imprima o resultado na tela. Saída esperada:
         * A média das notas é: 8.166666666666666
         */

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é: " + media);

    }

}
