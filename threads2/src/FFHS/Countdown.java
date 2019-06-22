package FFHS;

public class Countdown extends Thread {

   private int number = 1;

    @Override
    public void run() {

        synchronized (this) {
            doCountdown();
        }

    }

    private void doCountdown(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop turn: " + i + " = " + number++);
        }

    }
}
