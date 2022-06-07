package instance.approche_objet.tpInterface.tpDifficile;

import instance.approche_objet.fr.diginamic.banque.entites.Compte;
import instance.approche_objet.fr.diginamic.banque.entites.CompteTaux;

import java.util.ArrayList;

public class CompteDaoMem implements CompteDao{
    ArrayList<Compte> tabC = new ArrayList<>();


    @Override
    public Compte[] lister() {
        for (Compte compte : tabC) {
            System.out.println(compte);
        }
        return new Compte[0];
    }

    @Override
    public void sauvegarder(Compte nvCompte) {
        tabC.add(nvCompte);
    }

    @Override
    public boolean supprimer(String numero) {

        return tabC.remove(numero);
    }

    @Override
    public boolean existe(String numero) {

        System.out.println(tabC.indexOf(Integer.parseInt(numero)));
        return true;
    }

    @Override
    public Compte getCompte(String numero) {

        return null;
    }
}
