package exercicio10;

import exercicio10.model.Disciplina;

public class Main {
    public static void main(String[] args) throws Exception {
        /*
         * Você está desenvolvendo um módulo acadêmico para registrar o desempenho dos
         * alunos em cada disciplina. O sistema precisa ser flexível para receber
         * diferentes quantidades de notas, mas deve garantir que todas estejam dentro
         * do intervalo válido.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe que armazene o nome da disciplina e a lista das notas dos
         * alunos
         * Valide se cada nota está entre 0 e 10
         * Calcule a média apenas das notas válidas
         * Informe quantas notas foram registradas com sucesso e quantas foram ignoradas
         * 
         * Exemplo de entrada:.
         * 
         * Disciplina matematica = new Disciplina("Matemática");
         * matematica.adicionarNota(7.5);
         * matematica.adicionarNota(11.0);
         * matematica.adicionarNota(8.0);
         * matematica.adicionarNota(-3.0);
         * matematica.adicionarNota(9.5);
         * 
         * Saída esperada:
         * 
         * Nota inválida ignorada: 11.0
         * Nota inválida ignorada: -3.0
         * Total de notas válidas: 3
         * Média em Matemática: 8,33
         * 
         */
        Disciplina matematica = new Disciplina("Matemática");
        matematica.adicionarNota(7.5);
        matematica.adicionarNota(11.0);
        matematica.adicionarNota(8.0);
        matematica.adicionarNota(-3.0);
        matematica.adicionarNota(9.5);

        matematica.calcularMedia();

    }
}
