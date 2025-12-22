import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws Exception {

        /*
         * Carla começou a praticar trilha e deseja saber quantos degraus precisará
         * subir para chegar ao topo de uma escadaria. Ela sobe um degrau por vez e quer
         * um programa que mostre sua subida até o topo. Sua tarefa é criar um programa
         * que receba um número e simule a subida da escadaria.
         * 
         * Exemplo de entrada:
         * 
         * Digite a quantidade de degraus: 5
         * 
         * Saída esperada:
         * 
         * Subindo o degrau 1
         * Subindo o degrau 2
         * Subindo o degrau 3
         * Subindo o degrau 4
         * Subindo o degrau 5
         * Você chegou ao topo!
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de degraus: ");
        int quantDegraus = sc.nextInt();
        int topo = 0;
        for (int i = 0; i < quantDegraus; i++) {
            System.out.println("Subindo degrau " + (i + 1));
            topo++;
            if (topo == quantDegraus) {
                System.out.println("Voce chegou ao topo");
            }
        }
        sc.close();
    }
}
