package sistema_de_emprestimo_em_biblioteca;

public class Biblioteca {
    private int quantidadeMaximaItens;
    private ItemBiblioteca[] itens;
    private static int totalItensCriados;
    private int numeroItensEmprestados;

    public Biblioteca(int totalItens) {
        this.quantidadeMaximaItens = totalItens;
        this.itens = new ItemBiblioteca[totalItens];
        this.numeroItensEmprestados = 0;
    }

    public void addItem(ItemBiblioteca item) {
        for (int i = 0; i < itens.length; i++) {
            if (itens[i] == null) {
                itens[i] = item;
                totalItensCriados++;
                break;
            }
        }
    }
    public void emprestar(int itemId) {
        for (ItemBiblioteca item : itens) {
            if (item != null && item.getId() == itemId) {
                if (!item.isEmprestado()) {
                    item.setEmprestado(true);
                    numeroItensEmprestados++;
                } else {
                    System.out.println("Item já emprestado.");
                }
                break;
            }
        }
    }



}
