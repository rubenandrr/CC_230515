package domaine;

public class Moto extends Vehicule {
    /**
     * Cette classe extends de Vehicule et ajoute des informations spécifiques à une moto.
     * */
    private Integer id;
    private Integer cylindree;

    public Moto(String immatriculation, String marque, String modele) {
        super(immatriculation, marque, modele);
    }

    public Integer getCylindree() {
        return cylindree;
    }

    public void setCylindree(Integer cylindree) {
        this.cylindree = cylindree;
    }
}
