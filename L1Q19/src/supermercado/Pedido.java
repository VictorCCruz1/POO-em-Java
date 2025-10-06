package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Item> itens = new ArrayList<>();
    private String formaPagamento;

    public void adicionarItem(Item item) {
        itens.add(item);
        item.atualizarEstoque();
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public void exibirResumo() {
        System.out.println("=== Resumo do Pedido ===");
        for (Item item : itens) {
            System.out.println(item);
        }
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Total a pagar: R$ " + calcularTotal());
    }
}
