import java.util.Scanner;

class Scan{
    static Scanner scan = new Scanner(System.in);
    static int inteiro(){
        return scan.nextInt();
    }
}


public class Main {

    public static void main(String[] args) {

        int totalSegundos = lerTempo(Scan.scan);

        int horas = obterHoras(totalSegundos);
        int minutos = obterMinutos(totalSegundos);
        int segundos = obterSegundos(totalSegundos);

        escreverTempo(horas, minutos, segundos);

    }

    public static int lerTempo(Scanner scanner) {
        System.out.print("Digite o tempo em segundos: ");
        return scanner.nextInt();
    }

    public static int obterHoras(int totalSegundos) {
        return totalSegundos / 3600;
    }

    public static int obterMinutos(int totalSegundos) {
        return (totalSegundos % 3600) / 60;
    }

    public static int obterSegundos(int totalSegundos) {
        return totalSegundos % 60;
    }

    public static void escreverTempo(int horas, int minutos, int segundos) {
        System.out.printf("Tempo: %d horas, %d minutos e %d segundos.\n", horas, minutos, segundos);
    }
}

