package exercicio7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Pedro está desenvolvendo um sistema de controle de produtos e precisa
         * verificar se os códigos de referência dos produtos seguem o formato correto.
         * O formato do código de referência é composto por:
         * 
         * 3 letras maiúsculas
         * Um hífen
         * 4 dígitos numéricos Crie um programa que receba um código de referência e
         * informe se ele está no formato correto.
         * 
         * Exemplo de entrada:
         * Digite o código de referência: ABC-1234
         * 
         * Saída esperada:
         * O código de referência está válido.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o código de referência:");
        String codigo = sc.nextLine();

        Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher isValidateCode = pattern.matcher(codigo);

        if (isValidateCode.matches()) {
            System.out.println("O código de referência está válido.");
        } else {
            System.out.println("O código de referência está inválido.");
        }
        sc.close();

    }
}
