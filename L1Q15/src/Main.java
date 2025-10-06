import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = calcularMedia(nota1, nota2, nota3);
        String status = verificarStatus(media);

        System.out.printf("A média do aluno é: %.2f\n", media);
        System.out.println("Status do aluno: " + status);

        scanner.close();
    }

    public static double calcularMedia(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String verificarStatus(double media) {
        if (media > 6.0) {
            return "Aprovado";
        } else if (media >= 4.0 && media <= 6.0) {
            return "Verificação Suplementar";
        } else {
            return "Reprovado";
        }
    }
}

