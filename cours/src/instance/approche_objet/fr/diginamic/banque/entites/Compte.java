package instance.approche_objet.fr.diginamic.banque.entites;

public class Compte {
   private int id;
    private int solde;

    public Compte(int id, int solde) {
        setId(id);
        setSolde(solde);
    }

    @Override
    public String toString() {
        return "Compte : {\n " +
                "id=" + getId() +
                ",\n solde=" + getSolde() +
                " \n }";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }
}
