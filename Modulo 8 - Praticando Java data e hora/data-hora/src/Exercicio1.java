import java.time.LocalDate;
import java.time.LocalTime;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de log para um aplicativo de gerenciamento
         * de tarefas. Sempre que uma nova tarefa é criada, o sistema deve registrar a
         * data e a hora exatas do momento da criação.
         * 
         * Para isso, implemente um programa que:
         * 
         * Simule a criação de uma tarefa através de uma variável simples, por exemplo
         * String tarefa = "Enviar relatório semanal";.
         * Registre a data e a hora exatas da criação.
         * Exiba essas informações no formato adequado.
         * 
         * Saída esperada:
         * 
         * Data atual: 2025-03-15
         * Hora atual: 14:30:45.089914300
         */

        System.out.println("Enviar relatório semanal");

        LocalDate localDate = LocalDate.now();

        LocalTime dateTime = LocalTime.now();

        System.out.println("Data criação: " + localDate);
        System.out.println("Hora criação: " + dateTime);

    }
}
