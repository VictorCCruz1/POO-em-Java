package sistema_de_emprestimo_em_biblioteca;

public class ItemBiblioteca {
    private int id;
    private String titulo;
    private int ano;
    private boolean emprestado;

    public int getId() {
        return id;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
}