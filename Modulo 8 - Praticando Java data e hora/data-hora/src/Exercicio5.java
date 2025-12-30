import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Exercicio5 {

    public static void main(String[] args) {

        /*
         * Você trabalha no setor financeiro de uma empresa de serviços e é responsável
         * por gerenciar o vencimento das faturas dos clientes. Em alguns casos, os
         * clientes solicitam um adiamento da data de pagamento, e o sistema precisa
         * calcular a nova data de vencimento com base na quantidade de meses
         * adicionados.
         * 
         * Crie um programa que:
         * 
         * Receba uma data de vencimento original.
         * Adicione um número de meses ao vencimento.
         * A data ajustada deve ser exibida no formato dd-MM-yyyy.
         * 
         * Saída esperada:
         * 
         * Se a data de vencimento original for 20 de março de 2025 e o adiamento for de
         * 1 mês, a saída deve ser:
         * 
         * Nova data de vencimento: 20-04-2025
         */

        LocalDate dtVencimentoOriginal = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int mesesAdiamento = 2;

        LocalDate nvDtVencimento = dtVencimentoOriginal.plusMonths(mesesAdiamento);

        System.out.println("Data de vencimento: " + dtVencimentoOriginal.format(formatter));
        System.out.println("Nova data de vencimento: " + nvDtVencimento.format(formatter));

    }

}
