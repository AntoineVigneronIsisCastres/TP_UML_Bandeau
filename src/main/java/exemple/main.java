package exemple;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import bandeau.Bandeau;

public class main {

    public static void main(String[] args) {
        Bandeau bandeau1 = new Bandeau();
        Font font = bandeau1.getFont();
        Color back = bandeau1.getBackground();
        Color fore = bandeau1.getForeground();
        bandeau1.setMessage("Hello");
        bandeau1.setFont(font);
        bandeau1.setForeground(fore);
        bandeau1.setBackground(back);
        Zoom zoom = new Zoom("ça va zoomer");
        zoom.appliquer(bandeau1);
        Spin spin = new Spin("ça va tourner");
        spin.appliquer(bandeau1);

        Bandeau bandeau2 = new Bandeau();
        Font font2 = bandeau1.getFont();
        Color back2 = bandeau1.getBackground();
        Color fore2 = bandeau1.getForeground();
        bandeau2.setMessage("Hello 2");
        bandeau2.setFont(font2);
        bandeau2.setForeground(fore2);
        bandeau2.setBackground(back2);
        ArrayList<Effet> listeEffets = new ArrayList<Effet>();
        Scenario scenar1 = new Scenario(listeEffets);
        scenar1.ajouterEffet(bandeau1, zoom, 2);
        scenar1.ajouterEffet(bandeau1, spin, 3);
        scenar1.demarrerScenario(bandeau2);
    }
}
