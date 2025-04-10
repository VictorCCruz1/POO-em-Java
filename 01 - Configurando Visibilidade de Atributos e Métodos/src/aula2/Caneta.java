package aula2;

public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    protected int carga;
    private boolean tampada = true;
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.print("Carga: " + this.carga); System.out.println("%");
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("\n\n");
    }

    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("ERRO!\nA caneta está tampada.");
        } else {
            System.out.println("Você rabiscou.");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar (){
        this.tampada = false;
    }

}
