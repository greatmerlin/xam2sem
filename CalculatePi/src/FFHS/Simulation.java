package FFHS;

import java.util.LinkedList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 */

public class Simulation {

    private int dartThreads = 0;
    private int dartIter = 0;
    private LinkedList<SubProcess> threads;
    private ExecutorService threadPool;

    public Simulation(int dartThreads, int dartI) {
        this.dartThreads = dartThreads;
        dartIter = dartI;
        threads = new LinkedList();
        threadPool = Executors.newFixedThreadPool(dartThreads);
        startProcesses();
    }

    public void startProcesses(){
        Random rnd = new Random();
        for(int i = 0; i < dartThreads; i++)
            threads.add(new SubProcess(rnd, dartIter / dartThreads)); //what will happen to each thread
    }

    public void startAll(){
        for(SubProcess s : threads){
            threadPool.execute(s);
        }
        threadPool.shutdown();
    }

    public double pi(){
        startAll();
        long totalInside = 0;long totalTotal = 0;
        while (!threadPool.isTerminated());
        for (SubProcess t : threads) {
            totalInside += t.getDartsInside();
            totalTotal += t.getDartsTotal();
        }
        return 4.0 * totalInside / totalTotal;
    }
}