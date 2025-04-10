package aula2;

public class Main {
    public static void main(String[] args) {
        ///System.out.println("Hello, World!");

        Caneta caneta1 = new Caneta();
        caneta1.modelo = "Compactor";
        caneta1.cor = "Azul";
        caneta1.ponta = 0.5f;
        caneta1.carga = 80;
        caneta1.tampada= false;
        caneta1.tampar();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.status();

        Caneta caneta2 = new Caneta();
        caneta2.modelo = "Bic";
        caneta2.tampar();
        caneta2.rabiscar();
        caneta2.status();
    }
}