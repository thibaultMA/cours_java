package listes.tri;

import java.util.*;


public class testVille {
    public static void main(String[] args) {
        List<Ville> villeList = new ArrayList<>();
        villeList.add(new Ville("madrid",1));
        villeList.add(new Ville("dublin",5));
        villeList.add(new Ville("luxembourg",2));
        villeList.add(new Ville("paris",3));
        villeList.add(new Ville("sanAndreas",4));


//        System.out.println(villeList);
//        Collections.sort(villeList);
//        System.out.println(villeList);
//        System.out.println(villeList);
//        villeList.sort(new VilleCompareAlphabet());
//        System.out.println(villeList);

        villeList.sort(new VilleCompareHabitantSize());
        System.out.println(villeList);
    }
}
