package instance.approche_objet.tpInterface.tpDifficile;

import instance.approche_objet.fr.diginamic.banque.entites.Compte;
import instance.approche_objet.fr.diginamic.banque.entites.CompteTaux;

import java.util.Scanner;

public class app {


    public static void main(String[] args) {
    boolean isok = true;
        Scanner scanner = new Scanner(System.in);
        CompteDao db = new CompteDaoMem();
        while (isok){

            System.out.println("***** Administration des comptes *****");
            System.out.println("1. Lister les comptes");
            System.out.println("2. Ajouter un nouveau compte");
            System.out.println("3. Ajouter une opération à un compte");
            System.out.println("4. Supprimer un compte");
            System.out.println("99. Sortir");


            try {
                switch (scanner.nextInt()){
                    case 1:
                        System.out.println("Liste des compte");
                        db.lister();
                        break;
                    case 2:
//    nike
                        System.out.println("numero du compte à sauvegarder");
                        int id = setID(scanner);
                        int solde = setSold(scanner);
                        System.out.println("Veuillez saisir le type de compte (1: NORMAL, 2: REMUNERE) :");
                        scanner.nextLine();
                        int type = scanner.nextInt();
                        switch (type){
                            case 2:
                                System.out.println("Veuillez saisir le taux :");
                                int taux = scanner.nextInt();
                                db.sauvegarder(new CompteTaux(id,solde,taux));
                                break;
                            case 1:
                                db.sauvegarder( new Compte(id,solde));
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("Ajout d’une opération à un compte");
                        int numCmp = setID(scanner);


                        break;
                    case 4:

                        System.out.println("Suppression d’un compte");
                        db.lister();
                        int supprId = setID(scanner);
                        System.out.println(db.getCompte(supprId + ""));
                        break;
                    default:
                        isok = false;
                        System.out.println("Aurevoir ");
                        break;
                }
            }catch (Error err){
                System.err.println(err);
            }

            System.out.println("");
        }
    }
    static Integer setID (Scanner scanner){
        System.out.println("Veuillez saisir le numéro :");
        int id = scanner.nextInt();
        return id;
    }
    static Integer setSold (Scanner scanner){
        System.out.println("Veuillez saisir le solde initial:");
        int solde = scanner.nextInt();
        return solde;
    }
}
