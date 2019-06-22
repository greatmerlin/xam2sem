package FFHS;

public class Main {

    public static void main(String[] args) {

        Thread myThread = new Person("theo"); // this thread has a 3sec (3000ms) delay and instead of called as the first thread,
                                                    // it will be called after 3 seconds

        myThread.start(); //how you start a thread

        new Thread(){
            @Override
            public void run(){
                System.out.println("anonymous Class Thread");
            }
        }.start();

        // now the runnable:

        Thread myRunnableThread = new Thread(new Cat());

        myRunnableThread.start();

        Thread newAnonRun = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Anon runn");
                myThread.interrupt();
                System.out.println("joined the Dark side!");
            }
        });
        newAnonRun.start();


    }


}

