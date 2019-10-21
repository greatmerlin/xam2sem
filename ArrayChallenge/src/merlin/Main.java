package merlin;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);






    public static void main(String[] args) {



        int[] myDescArray = getIntegers(5);

        int[] sorted = sortInt(myDescArray);

        printArray(sorted);


    }

    public static int[] getIntegers(int array){


        System.out.println("Please enter " + array + " some numbers : \n");

        int[] localArray = new int[array];           //define our array

        for(int i=0; i < localArray.length; i++){
                localArray[i] = scanner.nextInt();
        }
        return localArray;
    }




    public static void printArray(int[] localRay){

        for(int i=0; i < localRay.length; i++) {
            System.out.println("Element " + i + ", value is " + localRay[i]);
        }
    }

    /*
    * copy the contents of our array to the new one , sort them and create a new array
    * */

    public static int[] sortInt(int[] otherLocal){

            int[] sortedArray = new int[otherLocal.length];   // first we create an array with the exact size of our array that we give in
        for (int i=0; i < otherLocal.length; i++){
            sortedArray[i] = otherLocal[i];
        }

        /*
         *enas allos tropos na kanw to parapanw einai o e3is:
         *
         * int[] sortedArray = Arrays.copyOf(otherLocal, otherLocal.length);
         *
         * xrisimopoiw mia me8odo tis class Arrays k stin paren8esi bazw tin array
         * p 8elw na kanw copy k to mege8os p 8elw na exei.
         *
         * */




        boolean flag = true;        // the while loop is going to continue processing until the while loop is false
        int temp;

        /*
        * now we need to get through the sorted array and update it with the highest values
        * */

        while(flag){
            flag = false;   // that means, if we dont reset the flag to true, we will end the loop!
            for(int i=0; i < sortedArray.length -1; i++){
                if (sortedArray[i] < sortedArray[i+1]) {       // if the current number is lower than the next number of the array
                    temp = sortedArray[i];   // we store temporarily this value to a var temp
                    sortedArray[i] = sortedArray[i + 1]; // we move then this element into the position of the next one
                    sortedArray[i +1] = temp;  // then we assign the assigned var back
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}
