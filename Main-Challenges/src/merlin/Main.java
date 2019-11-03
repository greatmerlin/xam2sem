package merlin;

public class Main {

    public static void main(String[] args) {


        int count = 0;
        int sum = 0;

        for(int i=1; i <=1000; i++){
            if((i%3 == 0) && (i%5 ==0)){
                count++;
                sum += i;
                System.out.println(i);
                if(count == 5){
                    System.out.println("***Breaking the Loop***");
                    break;
                }
            }
        }

        System.out.println();
        System.out.println("The sum of the found numbers is: " +sum);

        System.out.println();

        // System.out.println("Test, is this number Odd? : " + isOdd(50) );


        System.out.println("************   Sum Odd ***************");

        // sumOdd(5,9);

        System.out.println();

        System.out.println(isOdd(5));

        System.out.println(sumOdd(1,100));




        //-------------------------------------------------------------------------------------MAIN

    }

    // odd einai oi monoi ari8moi, to 1,3,5,7....  auf deutsch ungerade
    // oi yugoi legontai even k einai 2,4,6,8...   auf deutsch gerade

/*    public static boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if ((number % 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void sumOdd(int start, int end) {

        if(isOdd(start) && isOdd(end)) {
            if((end>start) && (end != 0 && start !=0)) {

                int sum = 0;

                for (int i = start; i <= end; i++) {

                    sum += i;
                }


                System.out.println("The sum is: " + sum);
            }


        }


    }*/

    public static boolean isOdd(int number) {

        if (number > 0 && number % 2 != 0)
            return true;
        else
            return false;

    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if (start > 0 && end >= start) {
            for (int a = start; a <= end; a++) {
                if (isOdd(a)) {
                    sum +=a;
                }
            }
            return sum;

        } else
            return -1;
    }



    //-----------------------------------------------------------------------------------CLASS
}






