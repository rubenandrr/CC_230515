package domaine;

public class Voiture extends Vehicule {
    /**
     * Cette classe extends de Vehicule et ajoute des informations spécifiques à une voiture.
     * */
    private Integer categorie;

    public Voiture(String immatriculation, String marque, String modele) {
        super(immatriculation, marque, modele);
    }

    public Integer getCategorie() {
        return categorie;
    }

    public void setCategorie(Integer categorie) {
        this.categorie = categorie;
    }

}
