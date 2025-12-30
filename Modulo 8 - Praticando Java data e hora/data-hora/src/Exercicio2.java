import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
         * Você trabalha no setor de tecnologia de uma empresa que gera relatórios
         * diários. Esses relatórios incluem informações como transações realizadas,
         * atualizações de pedidos e registros de atendimento ao cliente. A equipe
         * responsável pela análise dos relatórios solicitou que a data e a hora sejam
         * exibidas em um formato mais familiar para os usuários brasileiros.
         * 
         * Para resolver essa tarefa, você deve:
         * 
         * Capturar a data e a hora atuais.
         * Formatar a data no padrão dd-MM-yyyy (dia-mês-ano).
         * Formatar a hora no padrão HH:mm (hora e minutos).
         * Exibir o resultado da formatação.
         * 
         * Saída esperada:
         * 
         * Data formatada: 15-03-2025
         * Hora formatada: 14:30
         */

        LocalDateTime localDate = LocalDateTime.now();

        DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatterHors = DateTimeFormatter.ofPattern("HH:mm:ss");

        System.out.println("Data formatada: " + localDate.format(formatterDate));
        System.out.println("Hora formatada: " + localDate.format(formatterHors));

    }

}
