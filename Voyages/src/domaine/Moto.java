package domaine;

public class Moto extends Vechicule {
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
