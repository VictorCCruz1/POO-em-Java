import java.util.Scanner;

public class Main {

    private static final String[] UNIDADES = {
            "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove"
    };
    private static final String[] DEZESSEIS_A_DEZENOVE = {
            "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"
    };
    private static final String[] DEZENAS = {
            "", "dez", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"
    };
    private static final String[] CENTENAS = {
            "", "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro (até 9 dígitos): ");
        long numero = scanner.nextLong();

        if (numero == 0) {
            System.out.println("O número por extenso é: zero");
        } else if (numero < 0) {
            System.out.println("Número negativo não suportado para esta função.");
        } else {
            System.out.println("O número por extenso é: " + converterNumeroParaExtenso(numero));
        }

        scanner.close();
    }

    public static String converterNumeroParaExtenso(long numero) {
        if (numero == 0) {
            return "zero";
        }

        String[] classesGrandes = {"", "mil", "milhões", "bilhões"};
        StringBuilder resultado = new StringBuilder();
        int blocoIndex = 0;

        // Processa o número em blocos de 3 dígitos, da direita para a esquerda
        // Ex: 123.456.789 -> 789, 456, 123
        while (numero > 0) {
            int bloco = (int) (numero % 1000);
            if (bloco > 0) {
                String parteExtenso = convertLessThanOneThousand(bloco);
                String sufixoClasse = "";

                if (blocoIndex == 1) { // Mil
                    sufixoClasse = "mil";
                } else if (blocoIndex == 2) { // Milhões
                    sufixoClasse = (bloco == 1) ? "milhão" : "milhões";
                } else if (blocoIndex == 3) { // Bilhões
                    sufixoClasse = (bloco == 1) ? "bilhão" : "bilhões";
                }

                // Adiciona a conjunção 'e' e o espaço entre os blocos
                if (resultado.length() > 0) {
                    // Adiciona 'e' se o bloco atual for menor que 100 ou se o bloco atual for 100 e o bloco anterior não for vazio
                    if (bloco < 100 || (bloco % 100 == 0 && bloco != 0)) {
                        resultado.insert(0, " e ");
                    } else {
                        resultado.insert(0, " ");
                    }
                }

                if (!sufixoClasse.isEmpty()) {
                    resultado.insert(0, parteExtenso + " " + sufixoClasse);
                } else {
                    resultado.insert(0, parteExtenso);
                }
            }
            numero /= 1000;
            blocoIndex++;
        }

        return resultado.toString().trim();
    }

    // Converte um número de 1 a 999 em extenso
    private static String convertLessThanOneThousand(int numero) {
        StringBuilder sb = new StringBuilder();

        int centena = numero / 100;
        int dezenaUnidade = numero % 100;

        if (centena > 0) {
            if (centena == 1 && dezenaUnidade == 0) {
                sb.append("cem");
            } else {
                sb.append(CENTENAS[centena]);
            }
        }

        if (dezenaUnidade > 0) {
            if (centena > 0) {
                sb.append(" e ");
            }

            if (dezenaUnidade < 10) {
                sb.append(UNIDADES[dezenaUnidade]);
            } else if (dezenaUnidade >= 10 && dezenaUnidade < 20) {
                sb.append(DEZESSEIS_A_DEZENOVE[dezenaUnidade - 10]);
            } else {
                sb.append(DEZENAS[dezenaUnidade / 10]);
                if (dezenaUnidade % 10 > 0) {
                    sb.append(" e ").append(UNIDADES[dezenaUnidade % 10]);
                }
            }
        }
        return sb.toString();
    }
}

