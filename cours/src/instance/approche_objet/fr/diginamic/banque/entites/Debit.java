package instance.approche_objet.fr.diginamic.banque.entites;

public class Debit extends Operation{
    public Debit(String dateOp, int montant) {
        super(dateOp, montant);
    }

    @Override
    public String getType() {
        return "Debit";
    }
}
