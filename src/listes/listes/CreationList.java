package listes.listes;

import java.util.ArrayList;


public class CreationList {
    public static void main(String[] args) {
        ArrayList<Integer> entite = new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            entite.add(i);
        }
        System.out.println(entite.size());
    }
}
