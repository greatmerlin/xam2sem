package FFHS;

public class VolatileFlag extends Thread {

    private volatile boolean flag = false;

    @Override
    public void run(){

        while (!flag){

            try {
                Thread.sleep(5);
            }catch (InterruptedException e){
                System.out.println("Interrupted");
                break;
            }
        }
        System.out.println("Thread is safe!");
    }

    public void stopNow(){
        flag = true;
    }

}
