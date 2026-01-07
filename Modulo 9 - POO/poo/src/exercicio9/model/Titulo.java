package exercicio9.model;

public class Titulo {

    private String nomeTitulo;
    private int diasAtraso;
    private double totalMulta;

    public Titulo(String nomeTitulo, int diasAtraso) {
        this.nomeTitulo = nomeTitulo;
        this.diasAtraso = diasAtraso;
    }

    public String getNomeTitulo() {
        return nomeTitulo;
    }

    public int getDiasAtraso() {
        return diasAtraso;
    }

    public void calcularMulta() {

        // valor da multa por dia
        double valorDiaAtraso = 2.50;

        totalMulta = valorDiaAtraso * diasAtraso;

        System.out.printf("Livro: %s | Multa por %d dias de atraso: R$ %.2f", nomeTitulo, diasAtraso, totalMulta);

    }

}
