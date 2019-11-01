package merlin;

/*
*  - we need to add a condition to check if the birth year is positive or a valid range
*  - also an error message to be written if the user enters letters instead of numbers
* */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        /* that  checks if the next input is a number !!!!!!
        * if not, it will return false! but we need to add some extra code using this boolean variable
         */

        boolean hasNextInt = scanner.hasNextInt();

        // now use the boolean var ->>> bazoume olo to text mas edw mesa

        if(hasNextInt){

            int yearOfBirth = scanner.nextInt();

            scanner.nextLine();

            System.out.println("Enter your name: ");

            String name = scanner.nextLine();

            int age = 2018 -yearOfBirth;

            // the condition for the valid age

            if(age >= 0 && age <= 100){                  // if age is in the range, it is g oing to print that
                System.out.println("Your name is: " + name + " , and you are " + age + " years old");

            } else {

                System.out.println("Invalid year of birth");
            }


        } else {
            System.out.println("unable to parse year of birth!"); // if the user types string and not int to year of birth!
        }



        scanner.close();








    }
    //-----------------------------OTHER METHODS-----------------------------------



















    //--------------------------------UNTIL HERE-------------------------------------
}
