package listes.listes;

import java.util.Objects;

public class Ville {
    String nom;
    long nbHabitant;

    public Ville(String nom, long nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }

    public Ville() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ville ville = (Ville) o;
        return nbHabitant == ville.nbHabitant && Objects.equals(nom, ville.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, nbHabitant);
    }
}



