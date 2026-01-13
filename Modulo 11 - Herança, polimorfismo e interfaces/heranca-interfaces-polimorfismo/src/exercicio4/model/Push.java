package exercicio4.model;

public class Push extends Notificacao {

    private String titulo;

    public Push(String destinatario, String mensagem, String titulo) {
        super(destinatario, mensagem);
        this.titulo = titulo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Push para: " + this.getDestinatario());
        System.out.println("Título: " + titulo);
        System.out.println("Conteúdo: " + this.getMensagem());

    }

}
