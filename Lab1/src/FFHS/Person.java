package FFHS;

public class Person extends Thread {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println(name);
            System.out.println(3 + 5);
        }catch (InterruptedException e){
            System.out.println("woke up");
        }

    }
}
