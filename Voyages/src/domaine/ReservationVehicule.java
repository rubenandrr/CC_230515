package domaine;

import java.time.LocalDate;

public class ReservationVehicule extends Reservation{
    private Vehicule vehiculeReserve;

    public ReservationVehicule(LocalDate dateDebut, LocalDate dateFin, Client client, Vehicule vehiculeReserve) {
        super(dateDebut, dateFin, client);
        this.vehiculeReserve = vehiculeReserve;
    }


    public Vehicule getVehiculeReserve() {
        return vehiculeReserve;
    }

    public void setVehiculeReserve(Vehicule vehiculeReserve) {
        this.vehiculeReserve = vehiculeReserve;
    }
}
