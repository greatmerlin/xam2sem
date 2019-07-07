package FFHS;

import java.io.IOException;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args)  {

        ExecutorService executor = Executors.newCachedThreadPool();

//        executor.submit(new Runnable() {
//            @Override
//            public void run() {
//
//                Random random = new Random();
//
//                int duration = random.nextInt(4000);
//
//                try {
//                    Thread.sleep(duration);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println("Starting...");
//
//
//
//                System.out.println("Finished.");
//            }
//        });

        Future<?> future = executor.submit(new Callable<Integer>() {           // the type of the return value is the one we put inside the diamond notation

            @Override
            public Integer call() throws Exception {
            Random random = new Random();

                int duration = random.nextInt(4000);

//                if(duration > 2000){
//                    throw new IOException("Sleeping for too long");
//                }

                try {
                    Thread.sleep(duration);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Starting...");



                System.out.println("Finished.");

                return duration;  // just so that i have sth to return
            }
        });

        executor.shutdown();

//        other useful Methods of future:
//        future.isDone();
//        future.cancel(true);

        // get the result from the callable by calling the future

        try {
            System.out.println("Result is: " + future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
