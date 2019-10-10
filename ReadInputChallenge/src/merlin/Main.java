package merlin;

/*
* we need to write 10 numbers in the console, count them and print out the sum
* after we have our 10 numbers we will break the while loop
*
* there is also a solution with break!(as comment)
* */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);

        // add 2 var , count and sum

        int counter = 0;   // count the valid numbers
        int sum = 0;       // sum the numbers

        // use a while loop that never ends and we need sth to break it when we want

//        while(true) {

        while(counter < 10) {

            int order = counter + 1;             // for the number of the int the user needs to write
            System.out.println("Enter number #" + order + ": ");

            boolean isAnInt = myScanner.hasNextInt(); // to check if the user enters an int

            if(isAnInt) {

                int number = myScanner.nextInt();
                counter++;
                sum += number;
/*                if(counter == 10) {
                    break;
                }*/

            } else {

                System.out.println("Invalid number");

            }


            myScanner.nextLine();   // handle end of the line (enter key)

        }

        System.out.println("sum = " + sum);
        myScanner.close();











        //------------------------------------ STOP MAIN ----------------------------------------

            }
    //------------------------------------ OTHER METHODS ----------------------------------------






















    //------------------------------------ STOP HERE ----------------------------------------

}
