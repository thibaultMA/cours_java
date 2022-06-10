package listes.gestionFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;


public class ManipulationFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("src/listes/gestionFile/recensement.csv");
        List<String>lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        Path path2 = Paths.get("src/listes/gestionFile/newRecensement.csv");
        List<String>newListe = new ArrayList<>();
        newListe.add(" le nom de la ville;"+"le code département;"+"population totale;");

        for (String line : lines) {
            String[]value = line.split(";");
            String noSpace = value[9].trim().replaceAll(" ", "");
            long POPTotal =  -1;
            try{
                POPTotal = Long.parseLong(noSpace);

            }catch (NumberFormatException Exp){
                System.err.println(Exp);
            }
            if (POPTotal  > 25000){
                newListe.add(value[2]+";"+value[1]+";"+value[9]+";");
            }
//
        }

//        for (String s : newListe) {
//            System.out.println(s);
//        }
        Files.write(path2,newListe,StandardOpenOption.CREATE);
    }
}
