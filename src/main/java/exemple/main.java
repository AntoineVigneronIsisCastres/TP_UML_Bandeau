package exemple;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import bandeau.Bandeau;

public class main {

    public static void main(String[] args) {
        new main().exemple();
    }

    public void exemple(){
        Bandeau bandeau1 = new Bandeau();
        Font font1 = bandeau1.getFont();
        Color back1 = bandeau1.getBackground();
        Color fore1 = bandeau1.getForeground();
        Zoom zoom = new Zoom();
        Spin spin = new Spin();
        Typewriter typewriter = new Typewriter();
        bandeau1.setMessage("Bonjour");
        bandeau1.setFont(font1);
        bandeau1.setForeground(fore1);
        bandeau1.setBackground(back1);
        Scenario scenar1 = new Scenario();
        scenar1.ajouterEffet(bandeau1, zoom, 3);
        scenar1.ajouterEffet(bandeau1, typewriter, 2);
        scenar1.ajouterEffet(bandeau1, spin, 2);
        scenar1.demarrerScenario(bandeau1);
    }
}
