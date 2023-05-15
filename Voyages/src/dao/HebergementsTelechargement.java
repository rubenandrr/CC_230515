package dao;

public class HebergementsTelechargement implements TelechargementStrategy{
    /**
     * Classe HebergementsTelechargement qui permet de télécharger les données depuis un fichier
     * */
    @Override
    public void telecharger() {
        System.out.println("Téléchargement des hébergements depuis un fichier");
    }
}
