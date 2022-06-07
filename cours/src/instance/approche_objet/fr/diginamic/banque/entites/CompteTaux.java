package instance.approche_objet.fr.diginamic.banque.entites;

public class CompteTaux extends Compte{
    /**
     *  taux de remuneration
     */
    private  int taux;

    public CompteTaux(int id, int solde , int taux) {
        super(id, solde);
        setTaux(taux) ;
    }

    @Override
    public String toString() {
        return super.toString()+" - Taux : "+getTaux()+"%";
    }

    public int getTaux() {
        return taux;
    }
    public void setTaux(int taux) {
        this.taux = taux;
    }
}
