package exercicio1;

import exercicio1.model.Aluno;
import exercicio1.model.Bolsista;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está construindo um sistema acadêmico para uma escola. Cada aluno possui
         * um nome e pode ser identificado no sistema com uma mensagem padrão. A escola
         * também possui alunos bolsistas. Para deixar o sistema mais informativo,
         * queremos exibir o tipo do aluno no momento da identificação, como "bolsista"
         * ou "regular".
         * 
         * Crie um programa que:
         * 
         * Defina uma classe Aluno com nome e tipo.
         * Crie um método identificar() que que imprime: "Aluno: [nome] - Tipo: [tipo]".
         * Crie uma classe Bolsista que herda de Aluno e define o tipo automaticamente
         * como "bolsista". Crie um objeto Aluno regular e um Bolsista, e chame o método
         * identificar() de cada um.
         * 
         * Exemplo de entrada:
         * Aluno aluno1 = new Aluno("Fernanda", "regular");
         * Bolsista aluno2 = new Bolsista("Lucas");
         * 
         * aluno1.identificar();
         * aluno2.identificar();
         * 
         * Saída esperada:
         * 
         * Aluno: Fernanda - Tipo: regular
         * Aluno: Lucas - Tipo: bolsista
         */

        Aluno aluno1 = new Aluno("Fernanda", "regular");

        Bolsista aluno2 = new Bolsista("Lucas");

        aluno1.identificar();
        aluno2.identificar();

    }
}
