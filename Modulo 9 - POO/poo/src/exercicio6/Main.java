package exercicio6;

import exercicio6.model.Colaborador;

public class Main {
    public static void main(String[] args) throws Exception {

        /*
         * Você está desenvolvendo um sistema de controle de colaboradores para uma
         * empresa de tecnologia. Às vezes, é necessário atualizar o cargo e o nível de
         * acesso de um funcionário devido a promoções ou mudanças de departamento. Seu
         * programa deve permitir essas alterações e mostrar as informações atualizadas.
         * 
         * Crie uma classe que:
         * 
         * Represente um colaborador com os atributos nome, cargo e nivel de acesso.
         * Implemente um método que permita alterar o cargo e o nível de acesso.
         * Exiba no console as informações antes e depois da atualização.
         * 
         * Exemplo de entrada:
         * Nome: Júlia Oliveira
         * Cargo atual: Pessoa Desenvolvedora Júnior
         * Novo cargo: Pessoa Desenvolvedora Plena
         * Nível de acesso atual: 1
         * Novo nível de acesso: 2
         * 
         * Saída esperada:
         * 
         * --- Antes da atualização ---
         * Nome: Júlia Oliveira
         * Cargo: Pessoa Desenvolvedora Júnior
         * Nível de acesso: 1
         * 
         * --- Após atualização ---
         * Nome: Júlia Oliveira
         * Cargo: Pessoa Desenvolvedora Plena
         * Nível de acesso: 2
         */

        Colaborador c1 = new Colaborador("Júlia Oliveira", "Pessoa Desenvolvedora Júnior", 1);

        System.out.printf("""
                --- Antes da atualização ---
                Nome: %s
                Cargo: %s
                Nível de acesso: %d
                                """, c1.getNome(), c1.getCargo(), c1.getNivelAcesso());

        // ATUALIZANDO CARGO E NIVEL
        c1.updateCargoAndNivel("Pessoa Desenvolvedora Plena", 2);

        System.out.printf("""
                --- Após atualização ---
                Nome: %s
                Cargo: %s
                Nível de acesso: %d
                                """, c1.getNome(), c1.getCargo(), c1.getNivelAcesso());

    }
}
