package FFHS;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService myExecutor = Executors.newFixedThreadPool(5); // create a pool of 5  Threads

        // rather than .start():   --- > oder ---> myExecutor.execute(className1); myExecutor.execute(className2);  etc...
        for (int i = 0; i < 5; i ++){
            Runnable leRunnableTheoBuilder = new TheoLeBuilder("i am the Theo-Builder: " + i);
            myExecutor.execute(leRunnableTheoBuilder);   // call the execute Method of the Executorservice Class
        }
        myExecutor.shutdown(); // always shutdown when he is no longer needed
        while (!myExecutor.isTerminated()){}
        System.out.println("finished all Threads");
    }
}
