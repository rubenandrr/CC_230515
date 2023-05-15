package domaine;

import java.time.LocalDate;

public class ReservationPropriete extends Reservation{

    Propriete bienReserve;

    public ReservationPropriete(Propriete bienReserve, LocalDate dateDebut, LocalDate dateFin, Client client) {
        super(dateDebut, dateFin, client);
        this.bienReserve = bienReserve;

    }

    public Propriete getBienReserve() {
        return bienReserve;
    }
}
