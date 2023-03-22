package EX1;

public class Main {

    public static void main(String[] args) {
        PrintTimeOuted r1 = new PrintTimeOuted(" * ", 10);
        PrintTimeOuted r2 = new PrintTimeOuted(" # ", 10);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }

}
