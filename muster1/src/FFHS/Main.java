package FFHS;

/*
* There is no happens-before relationship between the assignment of the message and the output of sout.
*
* To create this relationship:  use .join() or synchronized
* */

public class Main {

    static String message;

    static class MyThread extends Thread{
        public void run(){
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            message = "Multi-Threading with java is not hard";
        }
    }

    public static void main(String[] args) throws InterruptedException {

        new MyThread().start();
        message = "this is not the message that will be shown";
        Thread.sleep(2000);
        System.out.println(message);
    }
}
