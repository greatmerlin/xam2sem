package FFHS;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {

    private static BlockingQueue queue = new ArrayBlockingQueue<Integer>(10);

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    producer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    consumer();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }

    public static void producer() throws InterruptedException {
        Random random = new Random();

        while (true){
            // add random items to the q
            queue.put(random.nextInt(100));  // a random integer from 0 to 99

        }
    }

    private static void consumer() throws InterruptedException {
        Random random = new Random();

        while (true){
            // take items only once a while
            Thread.sleep(100);

            // random take items from the q
            if (random.nextInt(10) == 0){
                Integer value = (Integer) queue.take();

                System.out.println("Taken value: " + value + "\nQueue size is: " + queue.size());
            }
        }
    }
}
