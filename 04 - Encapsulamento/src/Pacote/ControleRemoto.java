package Pacote;

public class ControleRemoto implements Controlador{

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume(){
        return volume;
    }
    private boolean isLigado(){
        return ligado;
    }
    private boolean isTocando(){
        return tocando;
    }

    private void setVolume(int v){
        volume = v;
    }
    private void setLigado(boolean l) {
        ligado = l;
    }
    private void setTocando(boolean t){
        tocando = t;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-------MENU-------");
        System.out.println("Está ligado: " + this.isLigado());
        System.out.println("Está tocando: " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for(int i = 0; i <= this.getVolume();i +=5){
            System.out.print("I");
        }
        System.out.println("\n---------=---------");
    }

    @Override
    public void fechaMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()+5);
        }
    }
    @Override
    public void menosVolume() {
        if (this.isLigado()){
            this.setVolume(this.getVolume()-5);
        }
    }
    @Override
    public void mutar() {
        if(this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }
    @Override
    public void desmutar() {
        if(this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }
    @Override
    public void play() {
        if(this.isLigado() && !(this.isTocando())){
            this.setTocando(true);
        }
    }
    @Override
    public void pause() {
        if(this.isLigado() && (this.isTocando())){
            this.setTocando(false);
        }
    }
}

