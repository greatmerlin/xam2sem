package FFHS;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void main() {

        Simulation sim = new Simulation(6, (int) 1e7); //3 seconds using 6 threads

        //double actual = sim.pi();
        System.out.println(sim.pi());

        System.out.println("vs");

        //double expected = Math.PI;
        System.out.println(Math.PI);

        double tolerance = Math.PI * (5.00/100);
        System.out.println(Math.PI * (5.00/100));

        //System.out.println(Math.abs(expected - actual));



    }
}