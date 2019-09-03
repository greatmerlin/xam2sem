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

public class Main {

    public static void main(String[] args) {

        Simulation sim = new Simulation(6, (int) 1e7); //3 seconds using 6 threads
        System.out.println(sim.pi());

        //double thisBox = sim.pi();

    }
}
