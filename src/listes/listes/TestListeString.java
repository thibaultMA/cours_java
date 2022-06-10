package listes.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;


public class TestListeString {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("nice");
        liste.add("Carcassonne");
        liste.add("Narbonne");
        liste.add("Lyon");
        liste.add("Foix");
        liste.add("Marseille");
        liste.add("Tarbes");

        String longNom = "";


        Iterator<String> iterator = liste.iterator();

        int i = 0;

        for (String ville : liste) {
            String newValue = ville.toUpperCase();
            liste.set(liste.indexOf(ville), newValue);

            if (longNom.length() <= ville.length()){
               longNom = ville;
            }
        }

        System.out.println(longNom);

        liste.removeIf(n -> n.contains("N"));
        System.out.println(liste);
    }
}
