package domaine;

import java.time.LocalDate;
import java.time.LocalTime;

public class TrajetAvion extends Trajet {
    private String companie;
    private String aeroportDepart;
    private String aeroportArrivee;

    public TrajetAvion(String origine, String destination, LocalDate dateDepart, LocalTime horaireDepart, LocalDate dateArrivee, LocalTime horaireArrivee, Float prixHT) {
        super(origine, destination, dateDepart, horaireDepart, dateArrivee, horaireArrivee, prixHT);
    }

    public String getCompanie() {
        return companie;
    }

    public void setCompanie(String companie) {
        this.companie = companie;
    }

    public String getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(String aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public String getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(String aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }
}
