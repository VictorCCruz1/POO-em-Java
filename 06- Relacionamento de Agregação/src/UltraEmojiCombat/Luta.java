package UltraEmojiCombat;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;
import java.util.Random;

public class Luta {
    private Lutador desafiado,desafiante;
    private int rounds, resultado;
    private boolean aprovada = false;

    public Lutador marcarLuta(Lutador L1, Lutador L2){
        setDesafiante(L1); setDesafiado(L2);
        if (!desafiante.getNome().equals(desafiado.getNome())){
            if (Objects.equals(desafiado.getCategoria(), desafiante.getCategoria())){
                this.setAprovada(true);
            }else{System.out.println("erro, categorias diferentes");}
        } else {System.out.println("erro, mesmo lutador");}
        return L1;
    }

    public Lutador lutar(Lutador L1, Lutador L2){
        if(this.aprovada){
            setDesafiante(L1); setDesafiado(L2);
            desafiado.apresentar();
            desafiante.apresentar();
            Random aleatorio = new Random();
            resultado = aleatorio.nextInt(2);
            if (resultado == 0){
                System.out.println("Empate!");
                desafiado.setEmpates(desafiado.getEmpates()+1);
                desafiante.setEmpates(desafiante.getEmpates()+1);
            } else if (resultado == 1){
                System.out.println("Vitória de "+ desafiado.getNome());
                desafiado.setVitorias(desafiado.getVitorias()+1);
                desafiante.setDerrortas(desafiante.getDerrortas()+1);
            } else if(resultado == 1){
                System.out.println("Vitória de "+ desafiante.getNome());
                desafiante.setVitorias(desafiante.getVitorias()+1);
                desafiado.setDerrortas(desafiado.getDerrortas()+1);
            }
            desafiado.apresentar();
            desafiante.apresentar();

        }else {System.out.println("erro, luta não aprovada");}
        return desafiante;
    }

    public Lutador getDesafiante() {return desafiante;}
    public void setDesafiante(Lutador desafiante) {this.desafiante = desafiante;}

    public Lutador getDesafiado() {return desafiado;}
    public void setDesafiado(Lutador desafiado) {this.desafiado = desafiado;}

    public boolean isAprovada() {return aprovada;}
    public void setAprovada(boolean aprovada) {this.aprovada = aprovada;}
}
