package Biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar() {
        if (!emprestado) {
            emprestado = true;
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        if (emprestado) {
            emprestado = false;
        } else {
            System.out.println("O livro \"" + titulo + "\" não está emprestado.");
        }
    }

    @Override
    public String toString() {
        String status = emprestado ? "Emprestado" : "Disponível";
        return "\"" + titulo + "\" de " + autor + " - " + status;
    }
}

