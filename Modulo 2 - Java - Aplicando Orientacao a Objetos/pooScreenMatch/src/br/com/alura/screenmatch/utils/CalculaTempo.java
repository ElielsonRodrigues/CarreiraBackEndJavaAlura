package br.com.alura.screenmatch.utils;

import br.com.alura.screenmatch.model.Filme;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Titulo;

public class CalculaTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    /*
     * EXPLICAÇÃO DOS METODOS INCLUI
     * PQ OS METODOS POSSUEM O MSM NOME?
     * ISSO SE CHAMA O CONCEITO DE SOBRECARGA DE METODOS
     * PARA QUE SEJA UTILIZADO TANTO PARA FILME E SERIE O JAVA
     * ABSORVE ESSE CONCEITO;
     */

    /*
     * public void inclui(Filme filme) {
     * tempoTotal += filme.getDuracaoEmMin();
     * }
     * 
     * public void inclui(Serie serie) {
     * tempoTotal += serie.getDuracaoEmMin();
     * }
     */

    /*
     * POR CONTA DO DESIGN DO CODIGO ESCALABILIDADE
     * CASO SURJAM NOVAS CLASSES E BOAS PRATICAS AGORA
     * IREMOS PASSAR A CLASSE PAI (TITULO) COMO PARAMETRO NO METODO;
     * ALÉM DO Q ABAIXO CLARAMENTE PODEMOS VER OCONCEITO DE POLIMORFISMO(MUITAS
     * FORMAS) OU SEJA A CAPACIDADE QUE O OBJETO(NO CALCULATEMPO) QUE POSSUI
     * O METODO "INCLUIR" RESPONDEREM A MSM CHAMADA IDEPENDENTE DO OBJETO PASSADO
     */

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMin();
    }
}
