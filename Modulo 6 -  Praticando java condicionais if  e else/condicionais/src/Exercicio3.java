import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
         * Jéssica trabalha no setor de TI de uma empresa e precisa garantir a segurança
         * dos acessos ao sistema interno. Os funcionários utilizam uma senha fixa para
         * acessar suas contas, e o sistema deve verificar se a senha inserida está
         * correta.
         * 
         * Ajude Jéssica a criar um programa que, com base em uma senha pré-definida,
         * por exemplo: 123456, verifique se o que o usuário digitou está correto ou
         * não. O programa deve comparar a tentativa com a senha correta e exibir se o
         * acesso foi permitido ou negado.
         * Saída esperada:
         * Digite a senha: 123456
         * Acesso permitido!
         * Ou
         * Digite a senha: 123
         * Acesso negado!
         */

        Scanner sc = new Scanner(System.in);
        String senhaDoUsuario = "123456";
        String senhaDigitada = "";

        System.out.println("Digite a senha:");
        senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaDoUsuario)) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado!");
        }
        sc.close();
    }
}
