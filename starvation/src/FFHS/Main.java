package FFHS;

// Here thread5 have to wait beacause of the
// other thread. But after waiting for some
// interval, thread5 will get the chance of
// execution. It is known as Starvation

public class Main {

    public static void main(String[] args) {

        Countdown thread1 = new Countdown("t1");
        Countdown thread2 = new Countdown("t2");
        Countdown thread3 = new Countdown("t3");
        Countdown thread4 = new Countdown("t4");

        thread1.setPriority(10);
        thread2.setPriority(6);
        thread3.setPriority(3);
        thread4.setPriority(1);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
