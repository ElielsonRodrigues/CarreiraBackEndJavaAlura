import java.util.Scanner;

public class Exercicio7 {

    /*
     * Um sistema de cadastro exige que os usuários informem um nome válido. No
     * entanto, alguns usuários tentam deixar o campo em branco ou inserir nomes
     * muito curtos. O sistema precisa garantir que o nome tenha pelo menos 3
     * caracteres antes de prosseguir com o cadastro.
     * 
     * Com base nesse cenário, crie um programa que continue pedindo um nome até que
     * o usuário insira um valor válido com pelo menos 3 caracteres.
     * 
     * Exemplo de entrada:
     * 
     * Digite seu nome:
     * Nome inválido. Digite novamente.
     * Digite seu nome: A
     * Nome inválido. Digite novamente.
     * Digite seu nome: Ana
     * 
     * Saída esperada:
     * 
     * Nome "Ana" cadastrado com sucesso!
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nome = "";
        while (nome.length() < 3) {
            System.out.println("Digite o seu nome");
            nome = sc.nextLine();

            if (nome.length() >= 3) {
                System.out.printf("Nome %s cadastrado com sucesso!", nome);
            }
        }
        sc.close();
    }

}
