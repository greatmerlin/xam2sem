package FFHS;

/**
 * @author Baxevanos Theologos
 * @version 1.0.0
 * Task: Find the Prime Numbers [2;100] using the Eratosthenes Sieve and write a proper JUnit Test.
 */

/*
* Explanation: The Sieve of Erastothenes, is a method that Erastothenes (an ancient greek mathematician) used
* to find the prime Numbers. The logic is simple. if the number we search is not 0,1,2,3,5,7 or one of the multiples
* of the 2,3,5,7, then it's a Prime number. A Prime Number is a number, that can be divided only by itself or by 1.
*
* */

public class Main {

    public static void main(String[] args) {


        for (int i = 2; i <= 100; i++) {

            if (i != 2 && i % 2 == 0 || i != 3 && i % 3 == 0 || i != 5 && i % 5 == 0 || i != 7 && i % 7 == 0) {
                System.out.print("");
            } else {
                System.out.println(i);
            }

        }

    }
}
