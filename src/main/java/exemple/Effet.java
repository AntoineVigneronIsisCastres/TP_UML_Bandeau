package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

public class Effet {

    private String description;

    public Effet(String desc) {
        this.description = desc;
    }

    public void appliquer(Bandeau bandeau) {}

    public String getDescription(){
        return this.description;
    }
}
