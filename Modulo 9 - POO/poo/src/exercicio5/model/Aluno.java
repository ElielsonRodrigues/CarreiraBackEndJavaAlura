package exercicio5.model;

public class Aluno {

    private String nome;
    private double nota1;
    private double nota2;
    private double media;
    private String situacao;

    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getMedia() {
        return media;
    }

    public void calcularMedia() {
        media = (nota1 + nota2) / 2;
    }

    public void resultado() {
        this.calcularMedia();

        if (media >= 7) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("""
                Aluno: %s
                Nota 1: %.2f
                Nota 2: %.2f
                Média: %.2f
                Situação: %s
                """, nome, nota1, nota2, media, situacao);

    }
}
