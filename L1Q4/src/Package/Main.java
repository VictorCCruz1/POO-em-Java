package Package;

public class Main{

    public static void main(String[] args) {

        String nome = ""; double preco = -1; int quantidade = -1;

        while (nome.isEmpty()){
            System.out.print("Digite o nome do produto: ");
            nome = Scan.texto();
        }

        while(preco < 0) {
            System.out.print("Digite o preço: ");
            preco = Scan.flutuante();
        }

        while(quantidade < 0) {
            System.out.print("Digite a quantidade: ");
            quantidade = Scan.inteiro();
        }

        if (quantidade <= 10){
            double total = preco * quantidade;
            System.out.println("O produto comprado foi: " + nome);
            System.out.printf("O preço total foi: R$%.2f\n",total);
        }
        if (quantidade > 10 && quantidade <= 20){
            double total = (preco*0.9) * quantidade;
            System.out.println("O produto comprado foi: " + nome);
            System.out.printf("O preço total foi: R$%.2f\n",total);
        }
        if (quantidade > 20 && quantidade <= 50){
            double total = (preco*0.8) * quantidade;
            System.out.println("O produto comprado foi: " + nome);
            System.out.printf("O preço total foi: R$%.2f\n",total);
        }
        if (quantidade > 50){
            double total = (preco*0.75) * quantidade;
            System.out.println("O produto comprado foi: " + nome);
            System.out.printf("O preço total foi: R$%.2f\n",total);
        }
    }
}
