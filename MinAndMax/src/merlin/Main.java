package merlin;

/*
* another fix for the bug (we used the boolean flag the first time to solve it
* is to use the max and min int numbers : min 2147483647 max -2147483648
* i me constants -> min = Integer.MAX_VALUE kai max = Integer.MIN_VALUE
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min = 0;
        int max = 0;
        boolean first = true;    // boolean is oft referred as a flag (true or false)

        while (true) {

            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();   // get input from user

            if(isAnInt) {

            int number = scanner.nextInt();

            if(first) {                 // check if the flag is true ( it should be, we entered the value before)
                first = false;          // when  the user enters the first number the f lag is set to false
                min = number;
                max = number;

            }

            if(number > max) {

                number = number;
            }

            if(number < min) {

                min = number;
            }

            }else {
                break;
            }
            scanner.nextLine(); // handle input  -> press a string to exit the loop

        }


        System.out.println("min = " + min + ", max = " + max);
        scanner.close();























    //-----------------------------------Main--------------------------------------------------------
            }
    //-----------------------------------Other Methods------------------------------------------------


















//-----------------------------------END------------------------------------------------------------
}
