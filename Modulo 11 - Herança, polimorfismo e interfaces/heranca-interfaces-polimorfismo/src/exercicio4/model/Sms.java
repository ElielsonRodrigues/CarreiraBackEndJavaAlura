package exercicio4.model;

public class Sms extends Notificacao {

    public Sms(String destinatario, String mensagem) {
        super(destinatario, mensagem);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para: " + this.getDestinatario());
        System.out.println("Mensagem: " + this.getMensagem());
    }

}
