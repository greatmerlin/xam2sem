package FFHS;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {

        Main testMe = new Main();

        IntSumOperator i1 = (int x, int y) -> {return x + y; };

        IntSumOperator i2 = (int x, int y) -> x + y;

        IntSumOperator i3 = (x, y) -> x + y;

        System.out.println("10 + 5 = " + testMe.operate(10, 5, i3) );

        /*

        // zero parameter
        () -> System.out.println("Zero parameter lambda");

        //one parameter
        (p) -> System.out.println("One parameter: " + p);

        //multiple parameters
        (p1, p2) -> System.out.println("Multiple parameters: " + p1 + ", " + p2);

         */

        /*
        * square all the odd numbers from 1 to 10 and calculate their total (sum) 
        *
        * */

        int result = IntStream.range(1, 1000)
                .limit(10)
                .filter(i -> i % 2 != 0)
                .map(i -> i * i)
                .sum();

        System.out.println(result);


    }
    private int operate(int a, int b, IntSumOperator intSumOperator){
        return intSumOperator.apply(a, b);
    }
}
