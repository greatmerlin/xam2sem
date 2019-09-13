package reflection;
import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

@Todo(task = "develop code", release = 1)
public class Task1 {

    private String task;
    private int release;

    public Task1(String task, int release){
        this.task = task;
        this.release = release;
    }

    public void task() {
        System.out.println("Task1 : ");
    }

    public void release() {
        System.out.print("Release1 : ");
    }
}
