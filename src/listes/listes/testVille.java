package listes.listes;

import java.util.ArrayList;

public class testVille {
    public static void main(String[] args) {
        ArrayList<Ville> villes = new ArrayList<>();

        villes.add(new Ville("nice",343000));
        villes.add(new Ville("Carcassonne",47800));
        villes.add(new Ville("Narbonne",53400));
        villes.add(new Ville("Lyon",484000));
        villes.add(new Ville("Foix",9700));
        villes.add(new Ville("Pau",77200));
        villes.add(new Ville("Marseille",850700));
        villes.add(new Ville("Tarbes",40600));
    }
}
