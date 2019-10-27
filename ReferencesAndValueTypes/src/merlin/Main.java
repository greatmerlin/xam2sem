package merlin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int myIntValue = 10;

        int anotherIntValue = myIntValue; //auto DEN einai reference! gt den mas deixnei to address tou Int
                                          // pairnei apla tin timi tou k kanei ena kanourgio Int, to opoio einai
                                         //  autonomo!!

        System.out.println("myIntValue = " +myIntValue);

        System.out.println("anotherValue = " + anotherIntValue);

        anotherIntValue++;

        System.out.println("myIntValue = " +myIntValue);

        System.out.println("anotherValue = " + anotherIntValue);

        /*
        * a reference holds an address to an object, but not the object itself!!!
        * array is a reference type
        *myIntArray is a reference to the array in the memory
        * */

        int[] myIntArray = new int[5];

        int[] anotherArray = myIntArray;  // edw den kaname use to "new", mono to "=".

        /*
        * gia na tis doume 8a kanoume use tis methodou toString!!!
        * it prints the contents of an entire array!!
        * toString will convert every Element in the array to string and return a new String
        * */
        System.out.println();

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));

        System.out.println();

        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        System.out.println();

        anotherArray[0] = 1;       // AUTO einai to referece!! to ena epireazei to allo! oxi opws me ta intValues

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));

        System.out.println();

        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        System.out.println();

        modifyArray(myIntArray);    // kai me tin xrisi mias METHOD!! epireazetai KAI to reference k to original!

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));

        System.out.println();

        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        System.out.println();

        /*
        * an twra mia apo tis 2 arrays tin kanw na exei reference kapou allou, tote exoume 2 arrays p
        * pianoun 2     di a foretikous xwrous sti mnimi
        * */

        anotherArray = new int[] {4,5,6,7,8}; //new keyword makes the difference!!
        modifyArray(myIntArray);

        System.out.println("myIntArray = " + Arrays.toString(myIntArray));

        System.out.println();

        System.out.println("anotherArray = " + Arrays.toString(anotherArray));

        System.out.println();

    }


    private static void modifyArray(int[] array){
        array[0] = 2;
        array = new int[] {1,2,3,4,5}; // it points to a different array named "array"!!
    }







}
