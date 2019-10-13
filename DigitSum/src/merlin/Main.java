package merlin;

/*
*Prigram na metraei ta digits tou ari8mou p bazoume. px to "125" einai 1+2+5 = 8.
*
* The first thing we need to do is to declare the method
* validate our paramenter (number < 10)
* */

public class Main {

    public static void main(String[] args) {

        System.out.println("Sum of digits in number 125 is " + sumDigits(125));


    }

    // ----------------------------------OTHER METHODS HERE ----------------------------------------------

    public static int sumDigits(int number){

        if(number < 10) {
            return -1;
        }

       int sum = 0;     // a var to hold the digits

        // first step is to extract the least significant digit

        // 125 -> 125 / 10 = 12*10 = 120 -> 125 -120 = 5

        while(number > 0) {
            // to divide na s tamatisei sto 0
            int digit = number % 10;
            sum += digit;   // add the digit to the sum
            //drop the least significant digit
            number /= 10; // number = number / 10

        }

        return sum;

    }










//--------------------------------------------until here-----------------------------------------------------
}
