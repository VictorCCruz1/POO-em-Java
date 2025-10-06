import java.util.Scanner;

class Scan{
    static Scanner scan = new Scanner(System.in);

    static double duplo(){
        return scan.nextDouble();
    }
    static char caracter() {
        return scan.next().charAt(0);
    }
}

class Main{
    public static void main(String[] args) {
        double iMensal;
        double jMensal;
        char continuar = 'S';

        System.out.print("Digite o valor a ser investido mensal: ");
        iMensal = Scan.duplo();

        System.out.print("Digite a taxa de juros mensal: ");
        jMensal = Scan.duplo() / 100.0; // Converte para decimal

        double saldoTotal = 0;
        int ano = 0;

        while (Character.toUpperCase(continuar) == 'S') {
            ano++;
            System.out.println("\n--- Ano " + ano + " ---");
            double saldoAno = 0;
            for (int mes = 1; mes <= 12; mes++) {
                saldoTotal += iMensal;
                saldoTotal += saldoTotal * jMensal;
                saldoAno = saldoTotal;
            }
            System.out.printf("Saldo após %d ano: %.14f\n", ano, saldoAno);

            System.out.print("Deseja processar mais um ano? (S/N): ");
            continuar = Scan.caracter();
        }
        System.out.println("Cálculo finalizado.");
    }
}
