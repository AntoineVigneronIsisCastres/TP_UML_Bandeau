package exemple;
import java.util.ArrayList;
import java.util.List;
import bandeau.Bandeau;

public class Scenario {

    private List<Effet> listeEffets = new ArrayList<Effet>();

    public Scenario(List<Effet> liste) {
        this.listeEffets = liste;
    }

    public void demarrerScenario(Bandeau bandeau) {
        for (Effet e : listeEffets) {
            e.appliquer(bandeau);
        }
    }
    
}
