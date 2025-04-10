package aula2;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Bic Cristal";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 80;

        caneta1.tampar();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();

    }
}