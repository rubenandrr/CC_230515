package domaine;

public class Voiture extends Vechicule {
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
