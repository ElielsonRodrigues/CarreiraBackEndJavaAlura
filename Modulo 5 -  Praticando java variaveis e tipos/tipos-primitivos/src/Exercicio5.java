public class Exercicio5 {

    public static void main(String[] args) {

        /*
         * 
         * Você está iniciando suas atividades como pessoa desenvolvedora e foi
         * designado para criar um programa de cadastro de livros que será escolhida
         * através de um único caractere. O sistema armazenar em variáveis:
         * 
         * Título
         * Autor
         * Número de páginas
         * Preço de um livro
         * Categoria do livro As categorias disponíveis são:
         * F - Ficção
         * N - Não-ficção
         * T - Tecnologia
         * H - História
         * 
         * Escreva um programa que armazene em variáveis as informações de um livro e
         * com base na categoria armazenada exiba uma mensagem de confirmação de acordo
         * com o que foi escolhido.
         * 
         * Exemplo de entrada:
         * char categoria = 'F';
         * Saída esperada:
         * Livro cadastrado: "O Pequeno Príncipe", de Antoine de Saint-Exupéry. Ele
         * possui 96 páginas, custa R$39,9 e pertence à categoria Ficção. *
         */

        String titulo = "O Pequeno Príncipe";
        String autor = "Antoine de Saint-Exupéry";
        int pag = 96;
        double preco = 39.0;
        char categoria = 'F';
        String descCategoria;

        switch (categoria) {
            case 'F':
                descCategoria = "Ficção";
                break;

            case 'N':
                descCategoria = "Não-ficção";
                break;

            case 'T':
                descCategoria = "Tecnologia";

                break;
            case 'H':
                descCategoria = "História";
                break;

            default:
                descCategoria = "Sem categoria";
                break;
        }

        System.out.println(
                """
                        Livro cadastrado: %s, de %s. Ele possui %d páginas, custa R$ %.2f e pertence à categoria %s.

                        """.formatted(titulo, autor, pag, preco, descCategoria));

    }

}
