package VolumeSolido;
import java.util.Scanner;

public class Main {
    public static final float PI = 3.14F;

    public static class Cubo {
        public void volume(float r){
            r = r*r*r;
            System.out.println("O volume do cubo é de "+r+".");
        }
    }

    public static class Esfera{
        public void volume(float r){
            r = (4f /3f)*(PI)*(r*r*r);
            System.out.println("O volume da esfera é de "+r+".");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor de r: ");
        float r = entrada.nextFloat();

        System.out.print("Digite 1 para cubo e 2 para esfera: ");
        int opcao = entrada.nextInt();

        if(opcao == 1){
            Cubo valor = new Cubo();
            valor.volume(r);
        } else if (opcao == 2) {
            Esfera valor = new Esfera();
            valor.volume(r);
        } else {
            System.out.println("Erro.");
        }
        entrada.close();
    }
}

