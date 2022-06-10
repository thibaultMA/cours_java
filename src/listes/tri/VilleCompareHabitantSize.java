package listes.tri;

import java.util.Comparator;

public class VilleCompareHabitantSize implements Comparator<Ville> {
    /**
     * @param ville the first object to be compared.
     * @param autreVille the second object to be compared.
     */
    @Override
    public int compare(Ville ville, Ville autreVille) {
        return Long.compare(ville.getNbHabitant(), autreVille.getNbHabitant());
    }
}
