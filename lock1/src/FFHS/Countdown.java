package FFHS;

import java.util.concurrent.locks.ReentrantLock;

public class Countdown extends Thread {

    private int number = 1;
    private String name;
    private  ReentrantLock bufferlock;

    public Countdown(String name, ReentrantLock bufferlock) {
        this.name = name;
        this.bufferlock = bufferlock;
    }

    @Override
    public void run() {

        bufferlock.lock ();
        try {
            doCountdown();
        }finally {
            System.out.printf(
                    "%s printed the document successfully.\n",
                    Thread.currentThread().getName());
            bufferlock.unlock();
        }

    }

    private void doCountdown(){

            for (int i = 0; i < 5; i++) {
                System.out.println("Loop turn: " + i + " = " + number++);
            }


    }
}