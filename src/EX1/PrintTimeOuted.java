package EX1;

public class PrintTimeOuted implements java.lang.Runnable {
    private String str = "STRINGA NON DEFINITA";
    private int loops = 5;
    private int time = 1000;

    public PrintTimeOuted(String str) {
        this.str = str;
    }
    public PrintTimeOuted(String str, int loops) {
        this(str);
        this.loops = loops;
    }
    public PrintTimeOuted(String str, int loops, int time) {
        this(str, loops);
        this.time = time;
    }

    @Override
    public synchronized void run() {
      for(int i=0; i<this.loops;i++){
            try {
                Thread.sleep((long) this.time);
                System.out.print(str);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
