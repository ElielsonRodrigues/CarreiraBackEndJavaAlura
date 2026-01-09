package exercicio1.model;

public class Carro {

    private String modelo;
    private String placa;
    private int ano;

    public Carro(String modelo, String placa, int ano) {
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAno() {
        return ano;
    }

    public void exibeVeiculo() {

        System.out.printf("""
                ------------------------------
                Veículo Cadastrado
                ------------------------------

                Modelo: %s.
                Placa: %s
                Ano: %d
                """, modelo, placa, ano);
    }

}
