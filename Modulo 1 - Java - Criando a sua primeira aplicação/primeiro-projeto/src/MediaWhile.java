import java.util.Scanner;

public class MediaWhile {

    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        double media = 0;
        double nota = 0;
        int count = 0; // quantidade de contagens

        while (nota != -1) {
            System.out.println("Informe a nota?");
            nota = sc.nextDouble();

            if (nota != -1) {
                media += nota; // ou media = media + nota;
                count ++;
            }
        }

        System.out.println("Media $%.2f".formatted(media/count));
    
    }
    
}
