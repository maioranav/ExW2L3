package EX2;

import java.util.ArrayList;




public class SommArray extends Thread {
    private long min = 0;
    private long max = 3000;

    private long somma = 0;
    private ArrayList<Long> arr = null;

    public SommArray(long min, long max, ArrayList<Long> arr) {
        this.min = min;
        this.max = max;
        this.arr = arr;
    }

    @Override
    public void run() {
        for (int i = (int) this.min; i < this.max; i++) {
            somma += this.arr.get(i);
        }
        Main.aggiungiSomme(somma);
        System.out.println("La somma di questo thread è " + somma);
    }

}
