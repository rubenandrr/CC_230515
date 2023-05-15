package metier;

import domaine.Reservation;
import java.util.Random;

public class CentraleReservation {
    Random rand;
    public CentraleReservation() {
        rand  = new Random();
    }

    public void Connect()
    {
        System.out.println("Connexion à la centrale de réservation");
    }

    public Boolean VerifierDisponibilite(Reservation r)
    {
        System.out.println("Vérification de la disponibilté d'une réservation");
        // Dans ce prototype les réservations sont disponibles aléatoirement avec une probabilité de 80%
        if (rand.nextFloat() < 0.8F)
            return Boolean.TRUE;
        else
            return Boolean.FALSE;
    }

    public Float Prix(Reservation r)
    {
        // Dans ce prototype les réservations ont un prix aléatoire entre 100 et 2000 CHF
        return rand.nextFloat()*1900.0F + 100.0F;
    }


}
