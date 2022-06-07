package instance.approche_objet.fr.diginamic.banque;

import instance.approche_objet.fr.diginamic.banque.entites.Compte;
import instance.approche_objet.fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte cpm = new Compte(0,2);
        System.out.println(cpm);
        CompteTaux CT = new CompteTaux(2,3,15);
        System.out.println(CT);
        Compte[] tabCompte = new Compte[2];

        tabCompte[0] = cpm;
        tabCompte[1] = CT;

        for (Compte compte : tabCompte) {
            System.out.println(compte);
        }
    }
}
