package exercicio4;

import exercicio4.model.Usuario;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de autenticação para um aplicativo
         * bancário. Os usuários precisam ter total segurança de que suas senhas não
         * podem ser alteradas sem autorização, mesmo que alguém tenha acesso temporário
         * ao dispositivo.
         * 
         * Crie uma classe que:
         * 
         * Armazene com segurança a senha do usuário
         * Permita alterar a senha apenas com a confirmação da senha atual
         * Forneça feedback sobre o resultado da operação
         * 
         * Exemplo de entrada:
         * 
         * Usuario user = new Usuario("123456");
         * user.setSenha("123456", "abc123");
         * 
         * Saída esperada:
         * 
         * Em caso de sucesso:
         * Senha alterada com sucesso!
         * 
         * Em caso de falha:
         * Senha atual incorreta. A senha não foi alterada.
         */

        Usuario user = new Usuario("123456");
        user.setSenha("1234516", "abc123");

    }
}
