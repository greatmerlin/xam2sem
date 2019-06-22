package FFHS;

public class Countdown extends Thread {

    private int number = 1;
    private String name;


    public Countdown(String name) {
        this.name = name;

    }

    @Override
    public void run() {

            doCountdown();

    }

    private void doCountdown(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop turn: " + i + " = " + number++);
        }

        System.out.println("thread completed");
    }
}