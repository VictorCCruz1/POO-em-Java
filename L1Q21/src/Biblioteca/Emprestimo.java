package Biblioteca;

import java.time.LocalDate;

public class Emprestimo {
    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Pessoa pessoa) {
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = LocalDate.now();
        this.dataDevolucao = null;
    }

    public void registrarEmprestimo() {
        if (!livro.isEmprestado()) {
            livro.emprestar();
            System.out.println("Empréstimo realizado: " + pessoa.getNome() + " pegou o livro \"" + livro.getTitulo() + "\".");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já está emprestado.");
        }
    }

    public void registrarDevolucao() {
        if (livro.isEmprestado()) {
            livro.devolver();
            dataDevolucao = LocalDate.now();
            System.out.println("Livro \"" + livro.getTitulo() + "\" devolvido por " + pessoa.getNome() + ".");
        } else {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já estava disponível.");
        }
    }

    @Override
    public String toString() {
        return "Livro: " + livro.getTitulo() +
                " | Pessoa: " + pessoa.getNome() +
                " | Empréstimo: " + dataEmprestimo +
                (dataDevolucao != null ? " | Devolvido em: " + dataDevolucao : " | Ainda emprestado");
    }
}
