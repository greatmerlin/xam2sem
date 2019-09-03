package FFHS;

import java.util.Random;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 */

public class SubProcess extends Thread {

    private long dartsInside = 0;
    private long dartsTotal = 0;
    private Random generator = null;

    public SubProcess(Random gen,long dt) {
        generator = gen;
        dartsTotal = dt;
    }


    private double distance(double x, double y){
        return Math.sqrt(x*x+y*y);
    }

    public long getDartsInside() {
        return dartsInside;
    }

    public long getDartsTotal() {
        return dartsTotal;
    }

    @Override
    public void run() {
        for (long i = 0; i < dartsTotal; i++) {
            double x = generator.nextDouble();
            double y = generator.nextDouble();
            if (distance(x, y) <= 1) {
                dartsInside++;
            }
        }
    }
}
