import java.util.Scanner;

class Scan{
    static Scanner scan = new Scanner(System.in);
    static char caracter(){
        return scan.next().charAt(0);
    }

}

public class Main{
    public static void main(String[] args) {
        char[][] tabuleiro = new char[3][3];

        System.out.println("Digite o tabuleiro (X, O ou - para vazio):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = Scan.caracter();
            }
        }
        int[] jogada = melhorJogada(tabuleiro, 'X', 'O');
        if (jogada != null)
            System.out.println("Jogue em: (" + jogada[0] + ", " + jogada[1] + ")");
        else
            System.out.println("Nenhuma jogada decisiva encontrada.");
    }
    static int[] melhorJogada(char[][] t, char jogador, char oponente) {
        // 1️⃣ Tentar vencer
        int[] pos = verifica(t, jogador);
        if (pos != null) return pos;

        // 2️⃣ Bloquear derrota
        pos = verifica(t, oponente);
        return pos;
    }

    static int[] verifica(char[][] t, char simbolo) {
        for (int i = 0; i < 3; i++) {
            // Linha
            if (conta(t[i][0], t[i][1], t[i][2], simbolo) == 2)
                for (int j = 0; j < 3; j++)
                    if (t[i][j] == '-') return new int[]{i, j};
            // Coluna
            if (conta(t[0][i], t[1][i], t[2][i], simbolo) == 2)
                for (int j = 0; j < 3; j++)
                    if (t[j][i] == '-') return new int[]{j, i};
        }
        // Diagonais
        if (conta(t[0][0], t[1][1], t[2][2], simbolo) == 2) {
            if (t[0][0] == '-') return new int[]{0, 0};
            if (t[1][1] == '-') return new int[]{1, 1};
            if (t[2][2] == '-') return new int[]{2, 2};
        }
        if (conta(t[0][2], t[1][1], t[2][0], simbolo) == 2) {
            if (t[0][2] == '-') return new int[]{0, 2};
            if (t[1][1] == '-') return new int[]{1, 1};
            if (t[2][0] == '-') return new int[]{2, 0};
        }
        return null;
    }

    static int conta(char a, char b, char c, char simbolo) {
        int cont = 0;
        if (a == simbolo) cont++;
        if (b == simbolo) cont++;
        if (c == simbolo) cont++;
        return cont;
    }
}
