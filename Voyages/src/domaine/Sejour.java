package domaine;

import java.util.ArrayList;
import java.util.List;

public class Sejour {
    /**
     * Créer un singleton pour la classe Sejour pour avoir une seule instance de Sejour.
     * <p>
     * Également créer un Builder pour créer l'objet Sejour seulement lorsque toutes les informations sont vérifiées.
     */

    /**Singleton - à modifier*/
    private static Sejour instance = null;

    public static Sejour getInstance(Client c) {
        if (instance == null)
            instance = new Sejour(c);
        return instance;
    }

    Client c;
    List<Reservation> reservations;
    List<Trajet> voyage;

    public Sejour(Client c) {
        this.c = c;
        reservations = new ArrayList<>();
        voyage = new ArrayList<>();
    }

    Float CalculerPrix() {
        Float prixHTTotal = 0.0F;

        for (Reservation r : reservations)
            prixHTTotal += r.getPrixHT();

        for (Trajet e : voyage)
            prixHTTotal += e.getPrixHT();

        if (c.getPays() == "FR")
            return prixHTTotal * 1.20F;
        if (c.getPays() == "CH")
            return prixHTTotal * 1.07F;

        return prixHTTotal;
    }

}
