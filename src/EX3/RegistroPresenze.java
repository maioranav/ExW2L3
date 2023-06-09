package EX3;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RegistroPresenze {

    private static String handle = "";
    public static Map<String, Integer> elenco = new HashMap<String, Integer>();
    private static File f = new File("w2l3ex3.txt");

    public static void main(String[] args) {

        if (leggiFile(f) != "") {
            String[] harr = leggiFile(f).split(",");
            for (int e = 0; e < harr.length; e = e + 2) {
                elenco.put(harr[e], Integer.valueOf(harr[e + 1]));
            }
            System.out.println("-> Elenco presenze salvate nel file " + f.toString());
            System.out.println(elenco.toString());
        } else {
            System.out.println("Il file è vuoto!");
        }

        elenco.put("Mario Rossi", 5);
        elenco.put("Giorgio Bianchi", 7);
        elenco.put("Gianni Verdi", 7);

        Set<String> keys = elenco.keySet();

        for (String k : keys) {
            handle += k + "@" + elenco.get(k) + "#";
        }

        System.out.println("\n-> Elenco presenze aggiornato:");
        System.out.println(elenco.toString());

        scriviFile(f, handle);

        System.out.println("\n-> Elaborazione presenze Completata");

    }

    public static void scriviFile(File f, String s) {
        try {
            FileUtils.writeStringToFile(f, s, "UTF-8");
            System.out.println("\n-> Ho scritto i valori sul file" + f.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String leggiFile(File f) {
        try {
            return ((FileUtils.readFileToString(f, "UTF-8")).replace("@", ",")).replace("#", ",");
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
