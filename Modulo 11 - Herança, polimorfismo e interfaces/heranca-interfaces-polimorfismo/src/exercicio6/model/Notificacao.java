package exercicio6.model;

public class Notificacao {

    public void enviarMensagem(String mensagem) {
        System.out.println("Mensagem enviada para todos: " + mensagem);
    }

    public void enviarMensagem(String contato, String mensagem) {
        System.out.printf("Mensagem enviada para %s: %s \n", contato, mensagem);
    }

    public void enviarMensagem(String contato, String mensagem, int quantEnvio) {
        for (int i = 0; i < quantEnvio; i++) {
            System.out.printf("Mensagem enviada para %s: %s \n", contato, mensagem);
        }
    }
}
