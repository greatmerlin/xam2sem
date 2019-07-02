package FFHS;

import java.util.Scanner;

public class Processor {

    /*
    * with wait, the thread waits without consuming a lot of system resources (like with sleep)
    * and you can only call it inside of a synchronized block and it hands over control of the
    * lock that the synchronized block is locked on.
    * so after we call "wait();" this block will lose control of the lock, and it will not
    * resume until 2 things happen:
    * -it must be possible to regain control of the lock to be able to resume (from another method using
    * the notify() or notifyAll()).
    *
    * So, the produce will start working, because of the .sleep in the consume(),
    * then at the moment produce() reaches "wait()", the lock "this" will be released, at that
    * point the consumer() will wake up from the sleep
    * and the consume() will be able to  grab the lock "this".
    *
    * then it waits until i press the enter key, and once i do it, the notify() is been executed
    *
    * notify can also only be called inside a synchronized code block.
    *
    * notify will notify the produced thread that it can wake up, if it is waiting.
    * so after notifying, we need to release the lock quickly, otherwise the producer() will
    * not be able to get back the lock (already used), and he must wait until the block of code
    * under the "notify()" is finished. only then, the producer() receives the lock again and starts from the line
     * under the "wait()".
     *
     * for example, if we have a Thread.sleep(5000); under the notify();, then the producer() should w8 another
     * 5 seconds after we press the enter key, until he will be able to grab the lock again.
     *
    * */

    public void produce() throws InterruptedException{
        synchronized (this){  // using this, we synchronize on the Processor object itself
            System.out.println("Producer thread running");
            wait(); // every object has a wait method (inherits from object class)
            System.out.println("resumed");
        }
    }

    public void consume() throws InterruptedException{

        Scanner scanner = new Scanner(System.in);
        Thread.sleep(2000);  // so that the thread that runs the produce method will have a chance to kick off first

        synchronized (this){    // here the SAME lock is being used, the object "this", the object of the class Processor
            System.out.println("Waiting for return key");
            scanner.nextLine(); // waits until i press the return key
            System.out.println("return key pressed");
            notify(); // after the enter key is being pressed notify will be executed
            // Thread.sleep(5000);

        }
    }


}
