package FFHS;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Runner {

    private int count = 0;
    private Lock lock = new ReentrantLock();
    // it means, once a thread has required this lock it can lock again if it wants to

    private Condition condition = lock.newCondition();

    private void increment(){
        for (int i=0; i < 10000; i++){
            count++;
        }
    }

    public void firstThread() throws InterruptedException{

        lock.lock();

        System.out.println("Waiting...");

        condition.await();

        System.out.println("Woken up!");

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void secondThread() throws InterruptedException{

        Thread.sleep(1000);

        lock.lock();

        System.out.println("Press the return key");
        new Scanner(System.in).nextLine();
        System.out.println("Got the return key");

        condition.signal();

        try {
            increment();
        }finally {
            lock.unlock();
        }
    }

    public void finished(){

        System.out.println("Count is: " + count);
    }
}
