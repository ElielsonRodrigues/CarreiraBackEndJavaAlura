package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.utils.Classificar;

/*
ATENÇÃO:
    public class Filme extends Titulo,Classificar
JAVA NÃO PERMITE HERANÇA MULTIPLA NÃO PODE extender 
da classe Titulo e Classificar por isso se usa interfaces
ou seja ele pode implementar varias inferfaces
*/

public class Filme extends Titulo implements Classificar {

    private String sinopse;

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    @Override
    public int getClassificacao() {
        return (int) (pegaMedia() / 2);
    }

}
