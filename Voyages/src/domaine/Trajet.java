package domaine;

import java.time.LocalDate;
import java.time.LocalTime;

public abstract class Trajet {
    private String origine;
    private String destination;
    private LocalDate dateDepart;
    private LocalTime horaireDepart;
    private LocalDate dateArrivee;
    private LocalTime horaireArrivee;
    private Float prixHT;

    public Trajet(String origine, String destination, LocalDate dateDepart, LocalTime horaireDepart, LocalDate dateArrivee, LocalTime horaireArrivee, Float prixHT) {
        this.origine = origine;
        this.destination = destination;
        this.dateDepart = dateDepart;
        this.horaireDepart = horaireDepart;
        this.dateArrivee = dateArrivee;
        this.horaireArrivee = horaireArrivee;
        this.prixHT = prixHT;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDate getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(LocalDate dateDepart) {
        this.dateDepart = dateDepart;
    }

    public LocalTime getHoraireDepart() {
        return horaireDepart;
    }

    public void setHoraireDepart(LocalTime horaireDepart) {
        this.horaireDepart = horaireDepart;
    }

    public LocalDate getDateArrivee() {
        return dateArrivee;
    }

    public void setDateArrivee(LocalDate dateArrivee) {
        this.dateArrivee = dateArrivee;
    }

    public LocalTime getHoraireArrivee() {
        return horaireArrivee;
    }

    public void setHoraireArrivee(LocalTime horaireArrivee) {
        this.horaireArrivee = horaireArrivee;
    }

    public Float getPrixHT() {
        return prixHT;
    }

    public void setPrixHT(Float prixHT) {
        this.prixHT = prixHT;
    }
}
