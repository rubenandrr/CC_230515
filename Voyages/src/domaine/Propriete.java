package domaine;

public abstract class Propriete {
    /**
     * Dans cette classe il y a toutes les informations relatives à une propriété → Appelé "Logement" dans le diagramme de classe
     * */
    private Integer id;
    private Client proprietaire;
    private Float superficie;
    private String adresse;
    private String ZIP;
    private String ville;
    private String pays;
    private Integer nbPieces;
    private Integer nbPersonnes;

    public Propriete(Float superficie, String adresse, String ZIP, String ville, String pays, Integer nbPieces, Integer nbPersonnes) {
        this.superficie = superficie;
        this.adresse = adresse;
        this.ZIP = ZIP;
        this.ville = ville;
        this.pays = pays;
        this.nbPieces = nbPieces;
        this.nbPersonnes = nbPersonnes;
    }

    public void setProprietaire(Client proprietaire) {
        this.proprietaire = proprietaire;
    }

    public void setSuperficie(Float superficie) {
        this.superficie = superficie;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setZIP(String ZIP) {
        this.ZIP = ZIP;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setNbPieces(Integer nbPieces) {
        this.nbPieces = nbPieces;
    }

    public void setNbPersonnes(Integer nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public Client getProprietaire() {
        return proprietaire;
    }

    public Float getSuperficie() {
        return superficie;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getZIP() {
        return ZIP;
    }

    public String getVille() {
        return ville;
    }

    public String getPays() {
        return pays;
    }

    public Integer getNbPieces() {
        return nbPieces;
    }

    public Integer getNbPersonnes() {
        return nbPersonnes;
    }
}
