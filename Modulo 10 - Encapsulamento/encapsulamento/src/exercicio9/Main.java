package exercicio9;

import exercicio9.model.Aluno;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está desenvolvendo um sistema de pontuação para uma
         * plataforma de estudos. Cada aluno ganha pontos conforme participa de
         * atividades como assistir aulas, responder quizzes ou completar tarefas. Seu
         * objetivo é criar uma classe que gerencie essa pontuação e determine o nível
         * atual do aluno com base na quantidade total de pontos acumulados.
         * 
         * Crie uma classe que:
         * 
         * Armazene os atributos nome, pontos e nível.
         * Implemente um método ganharPontos() para adicionar pontos ao aluno.
         * O nível do aluno deve subir conforme a pontuação total:
         * Nivel 1: 0 a 99 pontos
         * Nível 2: 100 a 199 pontos
         * Nível 3: 200 a 299 pontos
         * E assim por diante (a cada 100 pontos, sobe de nível)
         * Implemente um método exibirStatus() que mostre o nome, pontos e nível atual.
         * 
         * Exemplo de entrada:
         * 
         * Aluno aluno = new Aluno("Fernanda");
         * 
         * aluno.ganharPontos(120);
         * aluno.exibirStatus();
         * 
         * Saída esperada:
         * 
         * Nome: Fernanda
         * Pontos: 120
         * Nível: 2
         */

        Aluno aluno = new Aluno("Fernanda");

        aluno.ganharPontos(120);
        aluno.ganharPontos(10);
        aluno.exibirStatus();
    }
}
