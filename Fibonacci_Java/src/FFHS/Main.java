package FFHS;

import java.util.concurrent.ForkJoinPool;

public class Main {

    public static void main(String[] args) {

        FibonacciTask task = new FibonacciTask(8);

        // define a pool of Worker_Threads
        final int WORKER_THREAD_COUNT = 4;
        final ForkJoinPool pool = new ForkJoinPool(WORKER_THREAD_COUNT);

//        System.out.println(pool.invoke(new FibonacciTask(8)));

        System.out.println(pool.invoke(task));
    }
}
