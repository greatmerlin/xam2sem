package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

public class Sieve_of_Eratosthenes {

    public static void main(String[] args) {

        //Limit according the task
        int limit = 100;

        //init our numbers array, create a boolean array of size: limit

        boolean[] isPrime = new boolean[limit];

        //set all of the values : true

        isPrime[0] = false; // except 1, we know that 1 is false, task and primes start from 2

        for (int a = 1; a < limit; a++) {
            isPrime[a] = true;
        }

        // the sieving part: check every number >= 2 for primality
        for (int i = 2; i <= limit; i++) {
            // i is prime if it hasn't been tagged false yet
            if (isPrime[i - 1]) {
                //print out the prime number
                System.out.println(i);

                //cross of all the subsequent multiples of i
                //for(int j = 2*i; j  <= n; j+= i){
                for (int j = i + i; j <= limit; j += i) {        //more efficient
                    isPrime[j - 1] = false;
                }
            }
        }


    }
}
