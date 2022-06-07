package instance.approche_objet.tpInterface.tpDifficile;


import instance.approche_objet.fr.diginamic.banque.entites.Compte;

public interface CompteDao {
    Compte[] lister();
    void sauvegarder(Compte nvCompte);
    boolean supprimer(String numero);
    boolean existe(String numero);
    Compte getCompte(String numero);
}
