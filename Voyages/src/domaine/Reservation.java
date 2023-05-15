package domaine;

import java.time.LocalDate;

public abstract class Reservation {

    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Client client;
    private Float prixHT;

    public Reservation(LocalDate dateDebut, LocalDate dateFin, Client client) {
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.client = client;
    }

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setPrixHT(Float prixHT) {
        this.prixHT = prixHT;
    }

    public Float getPrixHT() {
        return prixHT;
    }
}
