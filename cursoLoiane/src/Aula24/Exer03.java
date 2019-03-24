package Aula24;

public class Exer03 {
    public static void main(String[] args) {
        LivroLivraria livro = new LivroLivraria();

        livro.nome = "O conto da aia";
        livro.autor = "Margaret Atwood";
        livro.anoLancamento = 2016;
        livro.isbn = "985.582.469-70";
        livro.qtPaginas = 368;
        livro.preco = 38.90;

        System.out.println("Nome do livro = "+livro.nome);
    }
}
