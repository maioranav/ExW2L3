package EX2;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Main {
    static SecureRandom rand = new SecureRandom();
    static ArrayList<Long> numeri = new ArrayList<>();
    static ArrayList<Long> somme = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3000; i++) {
            numeri.add(rand.nextLong(150));
        }
        SommArray t1 = new SommArray(0, 999, numeri);
        SommArray t2 = new SommArray(1000, 1999, numeri);
        SommArray t3 = new SommArray(2000, 2999, numeri);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(1000);
        SommaParziali red = new SommaParziali(somme);
        red.start();
    }

    public static void aggiungiSomme(Long val) {
        somme.add(val);
    }

}
