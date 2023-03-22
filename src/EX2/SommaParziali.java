package EX2;

import java.util.ArrayList;

public class SommaParziali extends Thread {

    private static long counter = 0;
    private static ArrayList<Long> arr = null;

    public SommaParziali(ArrayList<Long> arr) {
        this.arr = arr;
    }

    public void run() {
        for (int i = 0; i < arr.size(); i++) {
            counter += arr.get(i);
        }
        System.out.println("La somma dei tre parziali è di " + counter);
    }
}
