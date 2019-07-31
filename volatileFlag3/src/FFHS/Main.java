package FFHS;

public class Main {

    public static void main(String[] args) {

        myThread t1 = new myThread();

        t1.start();
        t1.requestPause();
        t1.requestResume();
    }
}
