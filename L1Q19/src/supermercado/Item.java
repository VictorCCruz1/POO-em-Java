package supermercado;
public class Item {
    private Produto produto;
    private int quantidade;

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public void atualizarEstoque() {
        produto.reduzirEstoque(quantidade);
    }

    @Override
    public String toString() {
        return produto.getNome() + " x " + quantidade + " = R$ " + calcularSubtotal();
    }
}
