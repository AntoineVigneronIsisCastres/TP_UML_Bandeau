package exemple;
import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class Spin extends Effet {

    private String text;

    public Spin(String text) {
        super(text);
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * i / 100);
            bandeau.sleep(100);
        }
    }
    
}
