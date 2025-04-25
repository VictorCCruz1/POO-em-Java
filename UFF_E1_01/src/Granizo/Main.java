/*1. Escreva um programa Java que leia do teclado um numero inteiro n estritamente maior que 1.
        Come ̧cando por n, sua fun ̧c ̃ao deve imprimir a sequencia de granizo gerada a partir deste termo.
        Esta sequencia obedece os seguintes prinćıpios:
        • Se o n ́umero anterior for par, divida-o por 2 para obter o proximo numero.
        • Se o n ́umero anterior for ımpar, multiplique-o por 3 e adicione 1 para obter o proximo
        n ́umero.
        • Uma vez impresso o numero 1, A execucao do programa deve terminar. */

package Granizo;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.print("Enter number: ");

        int numero = enter.nextInt();
        GranizoFunction result = new GranizoFunction();
        result.granizo(numero);
    }
}