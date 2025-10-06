package supermercado;

public class Produto{
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void reduzirEstoque(int quantidade) {
        if (quantidade <= estoque) {
            estoque -= quantidade;
        } else {
            System.out.println("Estoque insuficiente para o produto: " + nome);
        }
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco + " (Estoque: " + estoque + ")";
    }
}
