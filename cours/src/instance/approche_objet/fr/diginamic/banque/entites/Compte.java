package instance.approche_objet.fr.diginamic.banque.entites;

public class Compte {
   private int id;
    private int solde;
    private int nombreOperation = 0;

    public Compte(int id, int solde) {
        setId(id);
        setSolde(solde);
    }

    @Override
    public String toString() {
        return "Numero : "+ getId() +
                " – Nombre d’opérations : " + getNombreOperation() +
                " – Solde "+getSolde();
    }

    public int getNombreOperation() {
        return nombreOperation;
    }

    public void setNombreOperation() {
        ++this.nombreOperation;
    }

    public Integer getId() {
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
