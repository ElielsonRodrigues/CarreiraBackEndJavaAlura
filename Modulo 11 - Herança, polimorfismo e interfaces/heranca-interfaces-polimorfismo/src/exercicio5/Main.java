package exercicio5;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo o núcleo de processamento para uma fintech. A startup
         * precisa de um sistema que possa acomodar diferentes métodos de pagamento,
         * cada um com suas particularidades de confirmação e regras de taxação. Seu
         * desafio é criar uma estrutura que unifique o essencial, mas permita
         * comportamentos específicos para cada forma de pagamento.
         * 
         * Crie um programa que:
         * 
         * Defina uma classe base Pagamento com o atributo valor.
         * Cada subclasse (CartaoCredito, BoletoBancario e Pix) implementa sua própria
         * lógica de confirmação e cálculo de taxas.
         * Cartão: 3%.
         * Boleto: 1%
         * Pix: sem taxas
         * Exiba a mensagem de confirmação no console e mostre o valor da taxa.
         * 
         * Exemplo de entrada:
         * 
         * Pagamento cartao = new CartaoCredito(250.00);
         * Pagamento boleto = new BoletoBancario(500.00);
         * Pagamento pix = new Pix(300.00);
         * 
         * cartao.confirmarPagamento();
         * boleto.confirmarPagamento();
         * pix.confirmarPagamento();
         * 
         * Saída esperada:
         * 
         * Pagamento de R$250,00 confirmado no Cartão de Crédito (Taxa: R$7,50)
         * Boleto de R$500,00 gerado com sucesso (Taxa: R$5,00)
         * Pagamento via Pix de R$300,00 confirmado
         * 
         */

    }
}
