package exercicio4.model;

public class Usuario {

    private String senha;

    public Usuario(String senha) {
        this.senha = senha;
    }

    public void setSenha(String senhaAtual, String novaSenha) {
        if (!senhaAtual.equals(this.senha)) {
            System.out.println("Senha atual incorreta. A senha não foi alterada.");
        } else {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        }
    }

}
