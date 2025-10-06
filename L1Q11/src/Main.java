import java.util.Scanner;

class Sqrt{
    public static double raiz(int numero, double erro) {
        if (numero == 0) {
            return 0;
        }
        double x = numero; // Chute inicial
        double proximoX = (x + numero / x) / 2.0;

        while (Math.abs(x - proximoX) > erro) {
            x = proximoX;
            proximoX = (x + numero / x) / 2.0;
        }
        return proximoX;
    }
    }

public class Main{

    public static void main(String[] args) {
        double erro;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro não negativo para calcular a" +
                " raiz quadrada: ");
        int numero = scanner.nextInt();
        System.out.print("Digite o erro máximo permitido (ex: 0.001): ");
        erro = scanner.nextDouble();
        if (numero < 0) {
            System.out.println("Não é possível calcular a raiz quadrada de um " +
                    "número negativo.");
        } else {
            double raiz = Sqrt.raiz(numero, erro);
            System.out.printf("A raiz quadrada aproximada de %d é %.5f (com erro " +
                    "máximo de %.5f).\n", numero, raiz, erro);
        }
        scanner.close();
    }

}

