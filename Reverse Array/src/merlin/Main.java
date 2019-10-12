package merlin;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

    int[] array = {1,5,3,7,11,9,15};

        System.out.println("Array is equal to = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed is equal to = " + Arrays.toString(array));

    }

    private static void reverse(int[] array){

        int maxIndex = array.length -1;   // maximum int
        int halfLength = array.length/2;

        for(int i=0; i < halfLength; i++){
            int temp = array[i]; // beginns in index 0
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
}
