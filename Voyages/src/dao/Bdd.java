package dao;

import domaine.Propriete;
import domaine.Trajet;
import domaine.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class Bdd {
    /**
     * À modifier selon la strategy et en utilisant la Fabrique
     **/

    /** Inteface avec la BDD SQL pour récupérer la liste des propriétés */
    public static List<Propriete> getProprietes() { return new ArrayList<>(); }

    /** Inteface avec un système d'informations externe qui récupère la liste des véhicules */
    public static List<Vehicule> getVehicules() { return new ArrayList<>(); }

    /** Inteface avec un système d'informations externe qui récupère la liste des Trajets */
    public static List<Trajet> getTrajets() { return new ArrayList<>(); }
}
