package exercicio5;

import exercicio5.model.Aluno;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Imagine que você está desenvolvendo um sistema acadêmico simplificado para
         * auxiliar professores no acompanhamento de alunos. Seu desafio é criar uma
         * solução que automatize o cálculo de médias e forneça rapidamente o resultado,
         * eliminando a necessidade de cálculos manuais e reduzindo erros.
         * 
         * Crie uma classe que:
         * 
         * Represente os alunos com os atributos nome, nota 1´ e nota 2`.
         * Implemente um método que:
         * Calcule a média das notas.
         * Exiba o nome do aluno, suas notas e a média (com uma casa decimal).
         * Indique se o aluno foi aprovado (média >= 7) ou reprovado.
         * 
         * Exemplo de entrada:
         * 
         * nome = "João Silva"
         * nota1 = 6.5
         * nota2 = 7.5
         * 
         * Saída esperada:
         * 
         * Aluno: João Silva
         * Nota 1: 6.5
         * Nota 2: 7.5
         * Média: 7,0
         * Situação: Aprovado
         */

        Aluno joao = new Aluno("João", 6.5, 7.5);
        joao.resultado();

    }
}
