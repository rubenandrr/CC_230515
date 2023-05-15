package metier;
import domaine.Propriete;

public abstract class FabriqueLogement { // écrit Logement et pas Propriete dans le diagramme de classes
    public Propriete nouveauLogement(String... data) {
        return newLogement(data);
    }

    public abstract Propriete newLogement(String... data);
}
