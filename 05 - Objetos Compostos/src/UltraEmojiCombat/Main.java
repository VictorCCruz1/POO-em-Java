package UltraEmojiCombat;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0]= new Lutador("Pretty Boy", "França",
                30,1.75f,68.9f,11,2,1);
        lutador[1]= new Lutador("Putscript","Brasil",
                29,1.68f,57.8f,14,2,1);
        lutador[2]= new Lutador("SnapShadow","EUA",
                35,1.65f,80.9f,12,2,1);
        lutador[3]= new Lutador("Dead Code","Australia",
                28,1.93f,81.6f,13,0,2);
        lutador[4]= new Lutador("UFOCobol","Brasil",
                37,1.70f,119.3f,5,4,3 );
        lutador[5]= new Lutador("NerdArt","Congo",
                30,1.81f,105.7f,12,2,4);


        for(int i = 0;i < 6;i++) {
            lutador[i].apresentar();
            lutador[i].status();
        }
    }
}
