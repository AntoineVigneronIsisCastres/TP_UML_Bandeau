package exemple;
import java.awt.Color;
import java.awt.Font;
import bandeau.Bandeau;

public class Typewriter extends Effet {

    public Typewriter() {
        super("Effet machine à écrire");
    }

    @Override
    public void appliquer(Bandeau bandeau) {
        System.out.println(this.getDescription());
        String message = bandeau.getMessage();
        char[] messagetemp = new char[message.length()];
        for (int i = 0; i < message.length(); i++) {
            messagetemp[i] = message.charAt(i);
            String msgtempstr = String.valueOf(messagetemp);
            bandeau.setMessage(msgtempstr);
            bandeau.sleep(100);
        }
    }
    
}
