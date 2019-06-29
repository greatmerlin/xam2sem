package FFHS;

public class TheoLeBuilder implements Runnable {

    private String message;

    public TheoLeBuilder(String s){
        this.message = s;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " (starts): " + message);
        processMessage();
        System.out.println(Thread.currentThread().getName() + " (end): " + message);
    }

    private void processMessage() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

    }
}
