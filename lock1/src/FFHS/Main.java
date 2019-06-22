package FFHS;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {

        ReentrantLock reentrantLock = new ReentrantLock();

        Countdown countdown1 = new Countdown("t1", reentrantLock);
        Countdown countdown2 = new Countdown("t2", reentrantLock);

        countdown1.start();
        countdown2.start();
    }
}
