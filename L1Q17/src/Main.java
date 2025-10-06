import java.util.Scanner;

public class Main {

    private static final String[] UNIDADES = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static final String[] DEZENAS = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static final String[] CENTENAS = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
    private static final String[] MILHARES = {"", "M", "MM", "MMM"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número decimal (até 3 dígitos): ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 3999) {
            System.out.println("Número fora do intervalo suportado (1 a 3999).");
        } else {
            String romano = converterDecimalParaRomano(numero);
            System.out.println("O número " + numero + " em romano é: " + romano);
        }

        scanner.close();
    }

    public static String converterDecimalParaRomano(int numero) {
        StringBuilder sb = new StringBuilder();

        // Milhares
        sb.append(MILHARES[obterDigito(numero, 1000)]);
        // Centenas
        sb.append(CENTENAS[obterDigito(numero % 1000, 100)]);
        // Dezenas
        sb.append(DEZENAS[obterDigito(numero % 100, 10)]);
        // Unidades
        sb.append(UNIDADES[obterDigito(numero % 10, 1)]);

        return sb.toString();
    }

    // Método para obter um dígito específico do número
    public static int obterDigito(int numero, int divisor) {
        return numero / divisor;
    }
}

