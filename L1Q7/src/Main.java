import java.util.Scanner;


/*                  FUNCIONANDO
class ProgramaA {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo;

        System.out.println("Informe o código: ");
        codigo = teclado.nextInt();

        while (codigo != -1) {
            System.out.println("Código: " + codigo);
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();
        }
        teclado.close();
    }
}
*/

class ProgramaB {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int codigo = 0;
        do {
            System.out.println("Informe o código: ");
            codigo = teclado.nextInt();
            if( codigo != -1){System.out.println("Código: " + codigo);}
        } while (codigo != -1);
        teclado.close();
    }
}