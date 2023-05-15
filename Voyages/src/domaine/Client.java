package domaine;

public class Client {
    private String nom;
    private String prenom;
    private String adresse;
    private String ZIP;
    private String ville;
    private String pays;
    private String telephone;
    private String email;

    public Client(String nom, String prenom, String adresse, String ZIP, String ville, String pays, String telephone, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ZIP = ZIP;
        this.ville = ville;
        this.pays = pays;
        this.telephone = telephone;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
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

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
