import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double media = 0;
        double nota = 0;
        Scanner sc  = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Informe a nota?");
            nota = sc.nextDouble();
            //media += nota; // ou media = media + nota;
            ;
        }
        System.out.println("Media $%.2f".formatted(media/3));
    }
    
}
