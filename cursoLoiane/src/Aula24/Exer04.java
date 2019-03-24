package Aula24;

import java.util.Date;

public class Exer04 {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "O conto da aia";
        livro.autor = "Margaret Atwood";
        livro.anoLancamento = 2016;
        livro.isbn = "985.582.469-70";
        livro.qtPaginas = 368;
        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.nomeDeQuemPegou = "Barbara";

        System.out.println("Nome do livro = "+livro.nome);
    }
}
