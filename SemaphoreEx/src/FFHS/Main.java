package FFHS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

//        Semaphore semaphore = new Semaphore(1);
//
//        semaphore.release(); // like unlock
//        semaphore.acquire(); //like lock
//
//        System.out.println("Available permits: " + semaphore.availablePermits());

//    Connection.getInstance().connect();

        ExecutorService executor = Executors.newCachedThreadPool();

        //every time i call submit(), it will create a new thread for me

        // i am calling 200 threads, and i am trying to say connect from each one

        for (int i=0; i < 200; i++){
            executor.submit(new Runnable() {
                @Override
                public void run() {
                    Connection.getInstance().connect();
/*                    try {
                        Connection.getInstance().doConnect();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }*/

                }
            });
        }
        executor.shutdown();

        executor.awaitTermination(1, TimeUnit.DAYS); // or that instead of shutdown
    }
}
