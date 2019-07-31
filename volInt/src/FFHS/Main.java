package FFHS;

import java.util.Random;

public class Main {

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Starting...");

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();

                while (!flag) {

                    for (int i = 0; i < 1E8; i++) {  // 1E6 = 1 million, "6 zeros"

                        Math.sin(random.nextDouble());
                    }
                }

            }
        });

        t.start();

        Thread.sleep(2000);

        stopNow();

        t.join();

        System.out.println("Finished.");
    }

    public static void stopNow(){
        flag = true;
    }
}
