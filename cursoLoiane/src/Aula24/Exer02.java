package Aula24;

public class Exer02 {
    public static void main(String[] args){
        Livro livro = new Livro();

        livro.nome = "O conto da aia";
        livro.autor = "Margaret Atwood";
        livro.anoLancamento = 2016;
        livro.isbn = "985.582.469-70";
        livro.qtPaginas = 368;

        System.out.println("Nome do livro = "+livro.nome);
    }
}
