package listes.dates;

import listes.listes.Ville;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class tp01 {
    String today ;


    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = new Date();
        String chaine1 = formateur.format(date1),chaine2 = chaine1;

        Date date2 = formateur.parse(chaine2);

        SimpleDateFormat formateu2 = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");

        Date date19 = new Date("05/19/2016 23:59:30");
        String ch3 = formateu2.format(date19);
//        System.out.println(ch3);

        String sysDate = formateu2.format(new Date());
//        System.out.println(sysDate);

        String t1 = new String("tomate");
        String t2 = new String("tomate");
//        System.out.println(t1.equals(t2));

        Ville v1 = new Ville();
        Ville v2 = new Ville();

        System.out.println(v1.equals(v2));
    }
}
