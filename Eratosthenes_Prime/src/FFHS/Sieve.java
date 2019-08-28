package FFHS;

import java.util.ArrayList;

public class Sieve {

    private ArrayList<Integer> myNumbers = new ArrayList<>();

    public Sieve(){

        int n = 100;
        for (int i = 0; i <= n; i++) {
            myNumbers.add(i);
        }
        myNumbers.remove(0);
        myNumbers.remove(1);

        for (int i = 2; i <= 100; i++) {

            if (i != 2 && i % 2 == 0 || i != 3 && i % 3 == 0 || i != 5 && i % 5 == 0 || i != 7 && i % 7 == 0) {
                myNumbers.remove(i);
            } else {
                myNumbers.set(i,i);
            }

        }

    }

    public void printMe(){

        for(int myNumber: myNumbers){
            System.out.println(myNumbers.get(myNumber));
        }
    }


}
