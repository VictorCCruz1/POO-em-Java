package aula2;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("Compactor","Preta",1.0f);
        caneta1.status();
        Caneta caneta2 = new Caneta("Faber Castel","Vermelha",0.5f);
        caneta2.status();
    /*    caneta1.setModelo("Bic Cristal");
    *   caneta1.setPonta(0.7f);
    *   caneta1.status();
    *
    *   System.out.println("Tenho uma caneta "+ caneta1.getModelo()
    *           + " de ponta " + caneta1.getPonta()+"mm.");
    */

    }
}