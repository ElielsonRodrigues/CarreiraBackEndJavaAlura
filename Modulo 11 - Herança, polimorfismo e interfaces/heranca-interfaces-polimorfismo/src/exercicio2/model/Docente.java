package exercicio2.model;

public class Docente extends Pessoa {

    private String disciplina;

    public Docente(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public void exibirDados() {
        System.out.printf("Docente: %s - Idade: %d - Disciplina: %s\n",
                this.getNome(),
                this.getIdade(),
                disciplina);
    }

}
