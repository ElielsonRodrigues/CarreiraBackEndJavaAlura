package exercicio9.model;

public class Aluno {

    private String nome;
    private int pontos;
    private int nivel;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void ganharPontos(int pts) {

        if (pts >= 0) {
            this.pontos += pts;
            atualizarNivel();
        } else {
            System.out.println("Não é possivel adicionar pontos");
        }
    }

    private void atualizarNivel() {
        this.nivel = (pontos / 100) + 1;
        System.out.println(nivel);
    }

    public void exibirStatus() {
        System.out.printf("Nome: %s\nPontos: %d\nNível: %d\n",
                this.nome, this.pontos, this.nivel);
    }

}
