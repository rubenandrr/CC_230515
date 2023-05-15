package metier;
import domaine.Reservation;

public abstract class FabriqueReservation {
    /**
     * Fabrique pour créer une nouvelle réservation
     * */
    public Reservation nouvelleReservation(String... data) {
        return newReservation(data);
    }

    public abstract Reservation newReservation(String... data);

}
