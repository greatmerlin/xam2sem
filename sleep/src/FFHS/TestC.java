package FFHS;

public class TestC extends Thread {

    @Override
    public void run() {

        for (int i=1; i < 5; i++){
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i + " ---> " + " i am the: " + currentThread().getName());
        }
    }
}
