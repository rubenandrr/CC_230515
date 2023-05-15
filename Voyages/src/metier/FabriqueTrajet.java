package metier;
import domaine.Trajet;

public abstract class FabriqueTrajet {
    public Trajet nouveauTrajet(String... data) {
        return newTrajet(data);
    }

    public abstract Trajet newTrajet(String... data);
}
