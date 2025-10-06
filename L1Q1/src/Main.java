import java.util.Scanner;
import java.lang.Math;

class Scan{
    static Scanner scanner = new Scanner(System.in);

    static String string(){
     return scanner.nextLine();
    }

    static float numero(){
        return scanner.nextFloat();
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.print("Informe o valor de a: ");
        float a = Scan.numero();

        System.out.print("Informe o valor de b: ");
        float b = Scan.numero();

        System.out.print("Informe o valor de c: ");
        float c = Scan.numero();

        float delta = (b * b) - 4 * a * c;
        float x1;
        float x2;

        if (delta>0 && a>0){
            System.out.printf("Expressão: (%.2f)x²+ (%.2f)x+ (%.2f)= 0 \n", a, b, c);

            x1 = (float) (((-b) + (Math.sqrt(delta))) / (2 * a));
            x2 = (float) (((-b) - (Math.sqrt(delta))) / (2 * a));

            System.out.println("Raiz 1: "+x1);
            System.out.println("Raiz 2: "+x2);
        }else{
            System.out.println("O Delta e/ou o coeficiênte a não foram maiores que zero, ou houve " +
                    "divisão por zero, portanto essa equação do segundo grau não é possível.");
        }


    }
}