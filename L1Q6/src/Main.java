import java.util.Scanner;

class Scan{
    static Scanner scan = new Scanner(System.in);
    static int inteiro(){
        return scan.nextInt();
    }
}

public class Main {
    public static void main(String[] args) {
        int inteiro;
        String tamanho;
        while(true){
            System.out.print("Digite o número: ");
            inteiro = Scan.inteiro();
            tamanho = (String.valueOf(inteiro));
            System.out.println(tamanho.length());
        }
    }
}

