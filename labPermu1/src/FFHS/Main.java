package FFHS;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    private static ArrayList<int[]> permutations;

    public static void main(String[] args) {

        permutations = new ArrayList<>();

        int[] myArr = {0,1,2,3};

        System.out.println(Arrays.toString(myArr));

        System.out.println();

        permutations(myArr, 4);
        System.out.println(Arrays.toString(myArr));

        System.out.println();

       swap(myArr, 0, 2);
       System.out.println(Arrays.toString(myArr));



    }

    private static void permutations(int[] arrayOfInt, int sizeOfArray) {

        if (sizeOfArray == 1) {
            permutations.add(arrayOfInt.clone());
            return;
        }

        for (int i = 0; i < sizeOfArray; i++) {
            swap(arrayOfInt, i, sizeOfArray - 1);		// the swap method is written below
            permutations(arrayOfInt, sizeOfArray - 1);		// recursion
            swap(arrayOfInt, i, sizeOfArray - 1);
        }
    }

    // Swap two values in an array
    private static void swap(int[] array, int xValue, int yValue) {
        int xValueTempSaved = array[xValue];
        array[xValue] = array[yValue];
        array[yValue] = xValueTempSaved;

    }
}
