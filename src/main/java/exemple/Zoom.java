package exemple;
import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class Zoom extends Effet {

    public Zoom() {
        super("Effet Zoom");
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        System.out.println(this.getDescription());
        for (int i = 5; i < 60; i += 5) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 5 + i));
            bandeau.sleep(100);
        }
    }
    
}
