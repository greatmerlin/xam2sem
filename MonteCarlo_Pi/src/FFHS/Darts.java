package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 *
 * Task 2: Calculate the constant PI with the help of a Monte Carlo-Algorithm.
 * Verify your function with a JUnit Test.
 * The Test should tolerate maximum 5% difference between out result and Math.PI.
 *
 * ----
 *
 * The idea of the calculation of PI using the Monte Carlo method is to sample random points in a square,
 * and count the fraction (ratio) of them that fall within the area of a circle bound by that square.
 * If enough points are uniformly sampled, the fraction (ratio) would be close to the area of the circle divided
 * by the area of the bounding square
 *
 * */

public class Darts
{
    //"throwing" a dart
    public static boolean [] dartThrow(int r, int d){
        boolean [] booleanArray = new boolean[d];
        for(int i = 0; i < d; i++){
            double xCoord = Math.random() * r;
            double yCoord = Math.random() * r;
            if((Math.pow(xCoord,2) + Math.pow(yCoord,2)) <= r*r){
                booleanArray[i] = true;
            }
            else{
                booleanArray [i] = false;
            }
        }
        return booleanArray;
    }

    //calculating pi from throwing results
    public static double piEstimater(boolean [] h, int d){
        int trueCounter = 0;
        for(int i = 0; i < h.length; i++){
            if(h[i] == true){
                trueCounter++;
            }
        }
        return 4 * ((double)trueCounter / d);
    }

    //printing results
    public static void printer(double [] a){
        System.out.println("     Pi Estimation Tool    ");
        System.out.println("---------------------------");
        for(int i = 0; i < a.length; i++){
            System.out.print("Trial [" + i + "]: pi = ");
            System.out.printf("%6f\n", a[i]);
        }
    }

    public static void main(String[] args){

        int radius = 1;
        int darts;
        int trials;

        darts = 10000;
        trials = 10000;

        double [] arrayOfEstimates = new double [trials];
        int i = 0;
        for(double a : arrayOfEstimates){
            boolean [] hitCounter = dartThrow(radius, darts);
            double piEstimate = piEstimater(hitCounter, darts);
            arrayOfEstimates[i] = piEstimate;
            i++;
        }

        printer(arrayOfEstimates);
    }
}