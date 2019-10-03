package merlin;

/*
* how to read input from an user
* what the Scanner does, is that the user types sth, and the program saves it as a variable!
* you need to IMPORT the scanner
* */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  // we create a new Object of the class Scanner.

        //ask for the year if birth and if needed convert it with Parse to int of use the .nextInt method tis class Scanner (auto parses a string to int)

        System.out.println("Enter your year of birth: ");
        int yeatOfBirth = scanner.nextInt();   // etsi apo8ikeuei eisagwgi int k oxi String

/*      POLU SHMANTIKO!!!! meta apo ena input, prepei na balw to parakatw gia na sunexisei na zitaei input apo ton xristi!!!
        gt diaforetika apla 3ekinaw ftiaxnontas mia var!!! to "name". antistoixa an i8ela prwta to name k meta tin age, use : scanner.nextInt(); k meta to name
        after reading a scanner, there MUST be a line of code to indicate what the scanner should read next!*/

        scanner.nextLine();

        System.out.println("Enter your name: ");   // the text BEFORE the scanner reads the user's input

        String name = scanner.nextLine(); // we save the text the user will give us to a variable "name" - read a line of the input - etsi apo8ikeuei input String

        // to calculate the age of the user (depending on his birth year)

        int age = 2018 -yeatOfBirth;

        // after the line is being read, we can type it as we saved it in our variable called "name"

        System.out.println("Your name is: " + name + " , and you are " + age + " years old");

        scanner.close();  // we close the scanner when we are done to save memory








    }
    //-----------------------------OTHER METHODS-----------------------------------



















    //--------------------------------UNTIL HERE-------------------------------------
}
