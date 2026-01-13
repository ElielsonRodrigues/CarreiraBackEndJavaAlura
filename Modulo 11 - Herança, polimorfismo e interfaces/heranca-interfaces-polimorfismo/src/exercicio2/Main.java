package exercicio2;

import exercicio2.model.Aluno;
import exercicio2.model.Docente;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de gestão para uma escola, onde é
         * necessário organizar informações de alunos e docentes. Cada pessoa na escola
         * possui dados básicos, como nome e idade. No entanto, cada grupo também possui
         * características próprias: os alunos possuem uma nota final e os docentes são
         * responsáveis por uma disciplina.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe Pessoa com os atributos nome e idade.
         * Crie as classes Aluno e Docente, ambas herdando de Pessoa, adicionando:
         * Para Aluno: um atributo nota.
         * Para Docente: um atributo disciplina.
         * Instancie dois objetos Aluno e dois objetos Docente
         * Exiba as informações no terminal.
         * 
         * Exemplo de entrada:
         * 
         * aluno1.exibirDados();
         * aluno2.exibirDados();
         * 
         * docente1.exibirDados();
         * docente2.exibirDados();
         * 
         * Saída esperada:
         * 
         * Aluno: Julia - Idade: 16 - Nota: 8.5
         * Aluno: Caio - Idade: 17 - Nota: 7.2
         * Docente: Marta - Idade: 40 - Disciplina: Matemática
         * Docente: Roberto - Idade: 38 - Disciplina: História
         * 
         */

        Aluno aluno1 = new Aluno("Julia", 16, 8.5);
        Aluno aluno2 = new Aluno("Caio", 17, 7.2);

        aluno1.exibirDados();
        aluno2.exibirDados();

        Docente docente1 = new Docente("Marta", 40, "Matemática");
        Docente docente2 = new Docente("Roberto", 38, "História");

        docente1.exibirDados();
        docente2.exibirDados();
    }
}
