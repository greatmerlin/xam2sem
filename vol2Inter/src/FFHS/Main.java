package FFHS;

public class Main {

    public static void main(String[] args) {

        VolatileFlag t1 = new VolatileFlag();

        t1.start();

        for (int i=0; i< 1E6; i++){
            Math.cos(i);
        }
        t1.stopNow();
//        t1.interrupt();
    }
}
