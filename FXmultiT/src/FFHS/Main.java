package FFHS;

/**
 * nebenläufig von 1 bis 100 gezählt und der Fortschritt in einer PrograssBar visualisiert werden
 *
 * */

import javafx.concurrent.Task;
import javafx.scene.control.ProgressBar;

public class Main {

    public static void main(String[] args) {

        final Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws InterruptedException {

                for(int i = 1; i <= 100; i++){
                    updateProgress(i,100);
                }

                return null;
            }
        };

        final ProgressBar bar = new ProgressBar();
        bar.progressProperty().bind(task.progressProperty());
        new Thread(task).start();
    }
}
