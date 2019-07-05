package FFHS;


import java.util.LinkedList;
import java.util.Random;

public class Processor {

    private LinkedList<Integer> list = new LinkedList<Integer>();
    private final int LIMIT = 10;
    // first thing i need for the synchronization
    // declare an object

    private Object lock = new Object(); // to lock on

    // you need to call wait and notify on the object you lock



    public void produce() throws InterruptedException{
        // adds items to this list
        int value = 0;

        while (true){
            synchronized (lock) { // lock this object

                while (list.size() == LIMIT) {
                    lock.wait();                // if the list is full, this is going to wait, it releases the lock
                }

                list.add(value++);
                lock.notify();

            }

        }

    }

    public void consume() throws InterruptedException{
        // removes items from the list

        Random random = new Random();

        while (true){
            synchronized (lock) {

                while (list.size() == 0) {
                    lock.wait();
                }
                    System.out.println("List size is: " + list.size());
                    int value = list.removeFirst(); // FIFO
                    System.out.println("Removed Value is: " + value);
                    lock.notify();

            }

            Thread.sleep(random.nextInt(1000));
        }
    }


}
