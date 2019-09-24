package FFHS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        int[] intArray = { 54, 46, 83, 66, 95, 92, 43 };

        bucketSort(intArray);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];     // Always use the Parent Interface, and  then we can switch between Lists.

        for (int i = 0; i < buckets.length; i++) {
            // using linked lists for the buckets -> can also be done with LinkedList -> Vector can also be used
            //buckets[i] = new LinkedList<Integer>();

            // using arraylists as the buckets
            buckets[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);      // so the index to be entered at the array will be at it's hashed value
        }

        for (List bucket: buckets) {                    // now sort each bucket
            Collections.sort(bucket);
        }

        int j = 0;                                      // gathering phase -> traverse the buckets array and copy the sorted values of each list
        for (int i = 0; i < buckets.length; i++) {      // outer loop is traversing the buckets array
            for (int value: buckets[i]) {               // the inner loop is traversing the arrayList
                input[j++] = value;                     // copy the values into the input array
            }
        }
    }

    private static int hash(int value) {
        return value / 10;
    }


}