package dao;

public class VehiculesTelechargement implements TelechargementStrategy{
    /**
     * Classe VehiculesTelechargement qui permet de télécharger les données depuis un fichier
     * */
    @Override
    public void telecharger() {
        System.out.println("Téléchargement des véhicules depuis un fichier");
    }
}
