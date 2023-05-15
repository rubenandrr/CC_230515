package domaine;

public class Appartement extends Propriete {
    /**
     * Cette classe extends la classe Propriete et ajoute des attributs spécifiques aux appartements
     * Ce qu'il faut ajouter :
     *     Un builder qui va permettre de créer un appartement avec les informations optionnelles qu'il aura besoin
     * */
    private Boolean airConditionne;
    private Boolean piscine;
    private Boolean balcon;
    private Boolean laveLinge;
    private Boolean laveVaisselle;

    public Appartement(Float superficie, String adresse, String ZIP, String ville, String pays, Integer nbPieces, Integer nbPersonnes) {
        super(superficie, adresse, ZIP, ville, pays, nbPieces, nbPersonnes);
    }

    public Boolean getAirConditionne() {
        return airConditionne;
    }

    public void setAirConditionne(Boolean airConditionne) {
        this.airConditionne = airConditionne;
    }

    public Boolean getPiscine() {
        return piscine;
    }

    public void setPiscine(Boolean piscine) {
        this.piscine = piscine;
    }

    public Boolean getBalcon() {
        return balcon;
    }

    public void setBalcon(Boolean balcon) {
        this.balcon = balcon;
    }

    public Boolean getLaveLinge() {
        return laveLinge;
    }

    public void setLaveLinge(Boolean laveLinge) {
        this.laveLinge = laveLinge;
    }

    public Boolean getLaveVaisselle() {
        return laveVaisselle;
    }

    public void setLaveVaisselle(Boolean laveVaisselle) {
        this.laveVaisselle = laveVaisselle;
    }
}
