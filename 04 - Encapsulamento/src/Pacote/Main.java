package Pacote;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        ControleRemoto controle0 = new ControleRemoto();
        controle0.ligar();
        controle0.play();
        controle0.mutar();
        controle0.desmutar();
        controle0.maisVolume();
        controle0.maisVolume();
        controle0.maisVolume();
        controle0.abrirMenu();
        controle0.fechaMenu();
    }
        // controle.getVolume(); encapsulamento
}