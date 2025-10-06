import java.util.Random;

public class Main{
    public static void main(String[] args) {
        int[] vetor = new int[100];
        Random r = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = r.nextInt(1000);
        }

        System.out.println("Vetor desordenado:");
        int k = 0;
        for (int n : vetor) {
            k++;
            System.out.print(n + "  ");
            if (k%10 == 0) System.out.print("\n");
        }
        System.out.print("\n\n");

        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado:");
        int y = 0;
        for (int n : vetor) {
            k++;
            System.out.print(n + "  ");
            if (k%10 == 0) System.out.print("\n");
        }
    }
}
