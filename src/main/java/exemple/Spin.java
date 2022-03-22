package exemple;
import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class Spin extends Effet {

    public Spin() {
        super("Effet Spin");
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        System.out.println(this.getDescription());
        for (int i = 0; i <= 100; i++) {
            bandeau.setRotation(2 * Math.PI * i / 100);
            bandeau.sleep(30);
        }
    }
    
}
