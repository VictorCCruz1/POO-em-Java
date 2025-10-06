import java.util.Arrays;
import java.util.Random;

public class Main{

    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        final int TAMANHO_VETOR = 50;
        final int TAMANHO_COMBINADO = TAMANHO_VETOR * 2;
        final int LIMITE_ALEATORIO = 1000;

        int[] vetor1 = new int[TAMANHO_VETOR];
        int[] vetor2 = new int[TAMANHO_VETOR];
        Random random = new Random();

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor1[i] = random.nextInt(LIMITE_ALEATORIO);
            vetor2[i] = random.nextInt(LIMITE_ALEATORIO);
        }

        System.out.println("Vetor 1 Desordenado:\n" + Arrays.toString(vetor1));
        System.out.println("\nVetor 2 Desordenado:\n" + Arrays.toString(vetor2));

        bubbleSort(vetor1);
        bubbleSort(vetor2);


        System.out.println("\nVetor 1 Ordenado:\n" + Arrays.toString(vetor1));
        System.out.println("\nVetor 2 Ordenado:\n" + Arrays.toString(vetor2));

        int[] vetorCombinado = new int[TAMANHO_COMBINADO];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < TAMANHO_VETOR && j < TAMANHO_VETOR) {
            if (vetor1[i] <= vetor2[j]) {
                vetorCombinado[k] = vetor1[i];
                i++;
            } else {
                vetorCombinado[k] = vetor2[j];
                j++;
            }
            k++;
        }

        while (i < TAMANHO_VETOR) {
            vetorCombinado[k] = vetor1[i];
            i++;
            k++;
        }

        while (j < TAMANHO_VETOR) {
            vetorCombinado[k] = vetor2[j];
            j++;
            k++;
        }

        System.out.println("\nVetor Combinado:\n" + Arrays.toString(vetorCombinado));
    }
}