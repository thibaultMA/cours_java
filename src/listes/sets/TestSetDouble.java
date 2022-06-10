package listes.sets;

import java.util.*;

public class TestSetDouble {


    public static void main(String[] args) {
//        ArrayList<Double> setDouble= new ArrayList<>();
        HashSet<Double> setDouble = new HashSet<>();
        setDouble.add(1d);
        setDouble.add(1.1d);
        setDouble.add(1.2d);
        setDouble.add(1.3d);
        setDouble.add(1.4d);
        setDouble.add(1.5d);

        setDouble.add(4d);
        setDouble.add(5d);
        setDouble.add(6d);
        setDouble.add(7d);
        setDouble.add(3d);

        setDouble.removeIf(DD -> DD.equals(1d));
//        System.out.println(setDouble);
        for (Double aDouble : setDouble) {
            System.out.println(aDouble);
        }
    }
}
