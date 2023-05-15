package domaine;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrajetTrain extends Trajet {

    private String gareDepart;
    private String gareArrivee;
    private String compagnie;

    public TrajetTrain(String origine, String destination, LocalDate dateDepart, LocalTime horaireDepart, LocalDate dateArrivee, LocalTime horaireArrivee, Float prixHT) {
        super(origine, destination, dateDepart, horaireDepart, dateArrivee, horaireArrivee, prixHT);
    }

    public String getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(String gareDepart) {
        this.gareDepart = gareDepart;
    }

    public String getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(String gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }
}
