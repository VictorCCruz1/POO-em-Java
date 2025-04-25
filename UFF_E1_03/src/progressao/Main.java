package progressao;

import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;

public class Main {

    public static void ProAri(int a1, int n, int r){
        System.out.print(a1+",");
        for (int i = 0; i < n; i++) {
            a1 = a1 + r;
            System.out.print(a1);
            if (i != (n-1)){
                System.out.print(",");
            }
        }
    }

    public static void ProGeo(int a1, int n, int r){
        System.out.print(a1+",");
        for (int i = 1; i < n; i++) {
            a1 = a1 * r;
            System.out.print(a1);
            if (i != (n-1)){
                System.out.print(",");
            }
        }
    }

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Informe o valor inicial:");
        int inicial = enter.nextInt();

        System.out.print("Informe a razão:");
        int razao = enter.nextInt();

        System.out.print("Informe o numero de termos:");
        int termos = enter.nextInt();

        System.out.print("Digite 1 para PA e 2 para PG: ");
        int escolha = enter.nextInt();

        if (escolha == 1) {
            ProAri(inicial, termos, razao);
        } else if (escolha == 2) {
            ProGeo(inicial, termos, razao);
        }else{
            System.out.println("Erro.");
        }
    }
}