package domaine;

import domaine.Vechicule;

import java.time.LocalDate;

public class ReservationVehicule extends Reservation{
    private Vechicule vehiculeReserve;

    public ReservationVehicule(LocalDate dateDebut, LocalDate dateFin, Client client, Vechicule vehiculeReserve) {
        super(dateDebut, dateFin, client);
        this.vehiculeReserve = vehiculeReserve;
    }


    public Vechicule getVehiculeReserve() {
        return vehiculeReserve;
    }

    public void setVehiculeReserve(Vechicule vehiculeReserve) {
        this.vehiculeReserve = vehiculeReserve;
    }
}
