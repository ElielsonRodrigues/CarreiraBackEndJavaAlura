import java.util.Scanner;

public class Exercicio9 {

    /*
     * Maria trabalha em um banco de sangue e precisa verificar se um doador é
     * compatível para doar sangue. Para ser compatível, o doador deve atender aos
     * seguintes critérios:
     * 
     * Ter entre 18 e 65 anos.
     * 
     * Pesar mais de 50 kg.
     * 
     * Ela deseja um programa que receba a idade e o peso do doador e informe se ele
     * é compatível para doar sangue. Se não for, o programa deve indicar qual
     * critério não foi atendido.
     * 
     * Como você criaria um programa que receba a idade e o peso do doador e exiba
     * uma mensagem indicando se ele é compatível ou não, além de informar o
     * critério não atendido, se for o caso?
     * 
     * Exemplo de entrada:
     * 
     * Digite a idade do doador: 17
     * Digite o peso do doador (em kg): 55
     * 
     * Saída esperada:
     * 
     * O doador não é compatível.
     * Motivo: Deve ter entre 18 e 65 anos.
     * 
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a idade do doador: ");
        int idadeDoador = sc.nextInt();

        System.out.println("Digite o peso do doador(em kg): ");
        double pesoDoador = sc.nextDouble();

        if (!(idadeDoador >= 18) && !(idadeDoador <= 65) && !(pesoDoador >= 50)) {
            System.out.println("O doador não é compatível.");
            if (!(idadeDoador >= 18) && !(idadeDoador <= 65)) {
                System.out.println("Motivo: Deve ter entre 18 e 65 anos.");
            }
            if (pesoDoador >= 50) {
                System.out.println("Motivo: Deve pesar mas que 50 kg.");
            }

        } else {
            System.out.println("O doador é compatível.");
        }

        sc.close();

    }

}
