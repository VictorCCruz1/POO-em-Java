import java.util.Scanner;

static class Scan{
    static Scanner scanner = new Scanner(System.in);

    public String string(){
        return scanner.nextLine();
    }

    public double flutuante(){
        return scanner.nextDouble();
    }
}

public static void main(String[] args) {
        Scan teclado = new Scan();
        double x1, y1, x2, y2, x3, y3, sqrt, distancia;
        System.out.println("Entre com as coordenadas x e y dos pontos nesta ordem:");
        x1 = teclado.flutuante();
        y1 = teclado.flutuante();
        x2 = teclado.flutuante();
        y2 = teclado.flutuante();
        x3 = (x2 - x1) * (x2 - x1);
        y3 = (y2 - y1) * (y2 - y1);
        distancia = Math.sqrt(x3+y3);


        System.out.println("A distância é: " + distancia);
}
