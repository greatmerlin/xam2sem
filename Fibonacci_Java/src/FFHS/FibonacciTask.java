package FFHS;

import java.util.concurrent.RecursiveTask;

public class FibonacciTask extends RecursiveTask<Integer> {

    final int n;

    public FibonacciTask(final int n){
        if(n < 0){

            throw new IllegalArgumentException("Parameter must be positive");
        }
        this.n = n;
    }

    protected Integer compute(){

        if(n == 0 || n == 1){
            return n;
        }
        final FibonacciTask fibTask1 = new FibonacciTask(n -1);
        fibTask1.fork();
        final FibonacciTask fibTask2 = new FibonacciTask(n - 2);
        fibTask2.fork();                                                // or ignore than
        return fibTask2.join() + fibTask1.join();       //and instead: return fibTask2.compute() + fibTask1.join();
    }

}
