package FFHS;

import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting...");

//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                Random random = new Random();
//
//                for (int i=0; i < 1E8; i++){  // 1E6 = 1 million, "6 zeros"
//
//                    if (Thread.currentThread().isInterrupted()){
//                        System.out.println("Interrupted!");
//                        break; // end the loop
//                    }
//
//                    Math.sin(random.nextDouble());
//                }
//            }
//        });

//        t.start();
//
//        Thread.sleep(500); // after half a second i call the interrupt
//
//        t.interrupt(); // does not kill the thread, only sets a flag on the thread and do what you want
//
//        t.join();

        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<?> future = executorService.submit(new Callable<Void>() {

            @Override
            public Void call() throws Exception {
                Random random = new Random();

                for (int i = 0; i < 1E8; i++) {  // 1E6 = 1 million, "6 zeros"

                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Interrupted!");
                        break; // end the loop
                    }

                    Math.sin(random.nextDouble());
                }
                return null;
            }
        });

        executorService.shutdown();

        Thread.sleep(500);

        future.cancel(true); // sets the interrupted flag to true
//        executorService.shutdownNow(); //also this sets the interrupted flag to true

        executorService.awaitTermination(1, TimeUnit.DAYS);



        System.out.println("Finished.");
    }
}
