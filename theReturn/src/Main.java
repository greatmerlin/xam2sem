package merlin;

public class Main {

    public static void main(String[] args) {

        // the for statement to loop some  . to automate processes
        // it loops continuously until its condition is satisfied

        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        System.out.println();

        // for(init; termination; increment)
        // initialising a special variable -> px -> i=0 , once the loop is done, this var will not exist anymore, its just for the loop.
        // to i mporei na einai opoios ari8mos 8eloume! px i=1
        //termination has to be false before the loop is finished
        //at the end of each loop we want to increase the value of i by 1
        // sto increment anti gia i++ 8a mporousame na exoume px: += 2  alliws 8a mporousame: for(int number = 1; number < 100;  number += 10)

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        System.out.println();

        for (int i = 2; i <= 8; i++) {
            System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, i));

            // "%.2f - take the number and convert it with 2 decimal points.
            // kai gia na ginei auto xrisimopoiw tin String.format()
            System.out.println();
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            System.out.println();

        }

        System.out.println();

        // backwards loop

        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.1f", calculateInterest(10000.0, i)));
        }

        System.out.println();

        System.out.println("The number is Prime: " + isPrime(5));

        System.out.println();

        //--------------------------------------------------------------------------------------

        int count = 0;     // count of the Prime numbers found

        for(int i = 10; i<50;i++)
        {
            if (isPrime(i)) {      // an auto einai true, an exoume diladi brei enan Prime number
                count++;
                System.out.println("Number " + i + " is a prime number");

                if (count == 3) {
                    System.out.println("**********Exiting for loop**********");
                    break;                   // the break exits the loop !!
                }
            }
        }

        //--------------------------------------------------------------------------------------




    }

    // -------------------------------------------------------------- Main


    /*
    * anti gia to n/2 mporousame na baloume to (long) Math.sqrt(n); gia na kanei ligotera loop (ligoteri mnimi)
    * */

    public static double calculateInterest(double amount, double interestRate) {

        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }


}

