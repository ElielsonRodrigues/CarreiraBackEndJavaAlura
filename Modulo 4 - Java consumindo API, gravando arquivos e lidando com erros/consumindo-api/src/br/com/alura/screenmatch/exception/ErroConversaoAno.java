package br.com.alura.screenmatch.exception;

public class ErroConversaoAno extends RuntimeException {


    private String mensagem;

    public ErroConversaoAno(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage(){
        return this.mensagem;
    }

}
