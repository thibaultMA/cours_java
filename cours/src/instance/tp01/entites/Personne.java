package instance.tp01.entites;

public class Personne {
     String nom;
     String preNom;
     AdressePostale adresse;

    public Personne(String nom, String preNom, AdressePostale adresse) {
        this(nom,preNom);
        this.adresse = adresse;
    }
    public Personne(String nom, String preNom) {
        this();
        this.nom = nom;
        this.preNom = preNom;
    }

    public Personne() {

    }

     void afficheNom(){

        System.out.println(nom +" "+ preNom.toUpperCase());
    }
}
