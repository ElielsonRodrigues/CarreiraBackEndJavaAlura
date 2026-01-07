package exercicio6.model;

public class Colaborador {

    private String nome;
    private String cargo;
    private int nivelAcesso;

    public Colaborador(String nome, String cargo, int nivelAcesso) {
        this.nome = nome;
        this.cargo = cargo;
        this.nivelAcesso = nivelAcesso;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void updateCargoAndNivel(String novoCargo, int novoNivel) {
        this.cargo = novoCargo;
        this.nivelAcesso = novoNivel;
    }

}
