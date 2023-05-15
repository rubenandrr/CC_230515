package metier;
import domaine.Vehicule;

public abstract class FabriqueVehicule {
    public Vehicule nouveauVehicule(String... data) {
        return newVehicule(data);
    }

    public abstract Vehicule newVehicule(String... data);
}
