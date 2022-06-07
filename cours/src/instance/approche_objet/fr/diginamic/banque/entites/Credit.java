package instance.approche_objet.fr.diginamic.banque.entites;

public class Credit extends Operation{
    public Credit(String dateOp, int montant) {
        super(dateOp, montant);
    }

    @Override
    public String getType() {
        return "Credit";
    }
}
