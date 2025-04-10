package aula2;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga); System.out.println("%");
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("\n\n");
    }

    void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO!\nA caneta está tampada.");
        } else {
            System.out.println("Você rabiscou.");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar (){
        this.tampada = false;
    }

}
