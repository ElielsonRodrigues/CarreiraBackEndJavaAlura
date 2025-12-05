import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome?");
        String nome = sc.nextLine();

        System.out.println("Informe sua idade?");
        int idade = sc.nextInt();

        System.out.println("Informe sua altura?");
        double altura = sc.nextDouble();

        // USANDO String.format() (pre-Java 15)
        String outputFormat = String.format("Nome: %s, Idade: %d, Altura: $%.2f", nome, idade, altura);
        System.out.println(outputFormat);

        // USANDO String::formatted (Java 15 and later)
        String outputFormatted = "Nome: %s, Idade: %d, Altura: $%.2f".formatted(nome, idade, altura);
        System.out.println(outputFormatted);




        

    }
}
