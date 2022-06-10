package listes.tri;

public class Ville implements Comparable<Ville>{
      String nom;
     long nbHabitant;

    public Ville(String nom, long nbHabitant) {
        this.nom = nom;
        this.nbHabitant = nbHabitant;
    }


    public String getNom() {
        return this.nom;
    }

    @Override
    public int compareTo(Ville o) {
        return Integer.compare(this.getNom().length(), o.getNom().length());
    }

    public long getNbHabitant() {
        return nbHabitant;
    }

    @Override
    public String toString() {
        return "Ville{" +
                "nom='" + nom + '\'' +
                '}';
    }
}



