package instance.approche_objet.fr.diginamic.banque.entites;

public abstract  class  Operation {
    private String dateOp;
    private int montant;

    public Operation(String dateOp, int montant) {
        this.dateOp = dateOp;
        this.montant = montant;
    }

     public abstract String getType() ;

    public String getDateOp() {
        return dateOp;
    }

    public int getMontant() {
        return montant;
    }
}
