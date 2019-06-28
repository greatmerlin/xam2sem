package FFHS;

public class Main {

    public static void main(String[] args) {

        TestC t1 = new TestC();
        t1.setName("Thread t1");
        TestC t2 = new TestC();
        t2.setName("Thread t2");

        t1.start();
        t2.start();
    }
}
