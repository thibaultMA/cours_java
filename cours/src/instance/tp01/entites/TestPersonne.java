package instance.tp01.entites;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale addr1 = new AdressePostale(9,"rue","44000","nantes");;
        AdressePostale addr2 = new AdressePostale(8,"place","44200","nantes");
        Personne pers1 = new Personne("nom","prenom",addr1);
        Personne pers2 = new Personne("nom2","prenom2",addr2);
        pers2.afficheNom();
    }

}
