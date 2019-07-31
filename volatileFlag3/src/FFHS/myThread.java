package FFHS;

public class myThread extends Thread {

    private volatile boolean running = true;
    private volatile boolean paused = false;
    private final Object lock = new Object();

    @Override
    public void run() {
        while (running){
            synchronized (lock){
                if (!running){
                    break;
                }
                if (paused){
                    try {
                        lock.wait();
                    }catch (InterruptedException e){
                        break;
                    }
                    if (!running){
                        break;
                    }
                }
                // critical code in synchronized block
                System.out.println("critical code");
            }
            //not critical code here
            System.out.println("non critical code");
        }
    }

    public void requestStop(){  //stop Thread
        running = false;
        requestResume();
    }

    public void requestPause(){
        paused = true;
    }

    public void requestResume(){ // unpause and notify all
        synchronized (lock){
            paused = false;
            lock.notifyAll();
        }
    }
}
