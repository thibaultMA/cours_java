package listes.listes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        List<Integer> liste1 = new ArrayList<>();
        liste1.add(-1);
        liste1.add(5);
        liste1.add(7);
        liste1.add(3);
        liste1.add(-2);
        liste1.add(4);
        liste1.add(8);
        liste1.add(5);

        int maxArray =0;

//        System.out.println(liste1);
//        System.out.println(liste1.size());
        Iterator<Integer> iterator = liste1.iterator();
        while (iterator.hasNext()){
            int user= iterator.next();
            if (user > maxArray){
                maxArray = user;
            }
        }
        System.out.println(maxArray);
    }
}
