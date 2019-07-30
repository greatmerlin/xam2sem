package FFHS;

public class Runner extends Thread{

    private volatile boolean running = true;

    @Override
    public void run() {

        while (running){

            System.out.println("Hello");

            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public void shutdown(){
        running = false;
        System.out.println("The End");
    }
}
