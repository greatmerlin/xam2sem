package FFHS;

import java.util.concurrent.Semaphore;

public class Connection {

    private static Connection instance = new Connection();

    private int connections = 0;  // number of connections at a time

    private Connection(){}

    public static Connection getInstance(){
        return instance;
    }

    // to limit the connections: Semaphore

    Semaphore semaphore = new Semaphore(10, true);
    // so to make a connection, you need to acquire one of these permits
    // after the connection is finished, it will release the permit

    public void doConnect() throws InterruptedException { // throws, or try & catch

        synchronized (this){
            connections++;
            System.out.println("Current connections: " + connections);
        }

        Thread.sleep(2000);

        synchronized (this){
            connections--;
        }
    }

    public void connect(){
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            doConnect();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}
