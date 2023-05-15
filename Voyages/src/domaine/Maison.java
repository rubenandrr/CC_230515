package domaine;

public class Maison extends Propriete {

    private Boolean airConditionne;
    private Boolean piscine;
    private Boolean jardin;
    private Boolean laveLinge;
    private Boolean laveVaisselle;

    public Maison(Float superficie, String adresse, String ZIP, String ville, String pays, Integer nbPieces, Integer nbPersonnes) {
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

    public Boolean getJardin() {
        return jardin;
    }

    public void setJardin(Boolean jardin) {
        this.jardin = jardin;
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
