package FFHS;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        calculateClusters(1,2);
        validClusters();

    }

    // 1a -> To run it, just run the main Method. "z" and "j" can be manipulated the way the user wants to.

    public static void calculateClusters(int z, int j){
        for (int i = 1; i <= 30; i++){
            int k = ((z*z) + (z*j) + (j*j));
            System.out.print(k + " ");
            z++;
            j++;
        }
    }

    // 1b -> To run it, just run the main Method.

    public static void validClusters(){

        List<Integer> myList = new ArrayList<>();
        List<Integer> mySecondList = new ArrayList<>();

        int[] clustersTested = {3, 4, 7, 12, 13, 14, 16, 20, 21, 28};

        for (int i = 0; i < clustersTested.length; i++){
            myList.add(clustersTested[i]);
        }

        int z = 1;
        int j = 2;
        for (int i = 1; i <= 30; i++){
            int k = ((z*z) + (z*j) + (j*j));
            mySecondList.add(k);
            z++;
            j++;
        }

        myList.retainAll(mySecondList);

        System.out.println("valid clusters: "
                + myList);
    }
}
