package dao;

public class TrajetsTelechargement implements TelechargementStrategy{
    /**
     * Classe TrajetsTelechargement qui permet de télécharger les données depuis un fichier
     * */
    @Override
    public void telecharger() {
        System.out.println("Téléchargement des trajets depuis un fichier");
    }
}
