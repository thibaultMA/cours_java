package tpSalaire;

public abstract class Personne {
    private String nom;
    private String prenom;
    private int numSecu;
    Adresse adresse;


    public Personne(String nom, String prenom, int numSecu, int NumRue) {
        setNom(nom);
        setPrenom(prenom);
        setNumSecu(numSecu);
        this.adresse = new Adresse();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getNumSecu() {
        return numSecu;
    }

    public void setNumSecu(int numSecu) {
        this.numSecu = numSecu;
    }
}
