package instance.approche_objet.fr.diginamic.banque;

import instance.approche_objet.fr.diginamic.banque.entites.Credit;
import instance.approche_objet.fr.diginamic.banque.entites.Debit;
import instance.approche_objet.fr.diginamic.banque.entites.Operation;

public class textOperation {

    public static void main(String[] args) {
        Operation[] tabOp = new Operation[4];
            tabOp[0]= new Debit("ezfef",1);
            tabOp[1]= new Credit("ezfef",3);
            tabOp[2]= new Debit("ezfef",2);
            tabOp[3]= new Credit("ezfef",1);

        double totalCompt = 0;

        for (Operation operation : tabOp) {
            System.out.println(operation.getType());
            System.out.println(operation.getMontant());
            System.out.println(operation.getDateOp());
            System.out.println("----- ----- ----- -----");
            if (operation.getType().equals("Credit")){
                totalCompt += operation.getMontant();
            }
            else {
                totalCompt -= operation.getMontant();
            }
        }
        System.out.print("totale:  ");
        System.out.println(totalCompt);
    }
}
