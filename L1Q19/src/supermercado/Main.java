package supermercado;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando produtos
        Produto p1 = new Produto("Arroz", 10.50, 20);
        Produto p2 = new Produto("Feijão", 8.75, 15);
        Produto p3 = new Produto("Macarrão", 5.20, 30);

        Pedido pedido = new Pedido();

        System.out.println("Bem-vindo ao Supermercado!");
        System.out.println("Produtos disponíveis:");
        System.out.println("1 - " + p1);
        System.out.println("2 - " + p2);
        System.out.println("3 - " + p3);

        while (true) {
            System.out.print("Digite o número do produto (0 para finalizar): ");
            int opcao = sc.nextInt();

            if (opcao == 0) break;

            System.out.print("Quantidade: ");
            int qtd = sc.nextInt();

            switch (opcao) {
                case 1 -> pedido.adicionarItem(new Item(p1, qtd));
                case 2 -> pedido.adicionarItem(new Item(p2, qtd));
                case 3 -> pedido.adicionarItem(new Item(p3, qtd));
                default -> System.out.println("Opção inválida.");
            }
        }

        System.out.print("Forma de pagamento (dinheiro/cheque/cartão): ");
        sc.nextLine(); // limpar buffer
        String pagamento = sc.nextLine();
        pedido.setFormaPagamento(pagamento);

        System.out.println();
        pedido.exibirResumo();

        sc.close();
    }
}
