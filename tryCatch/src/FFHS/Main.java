package FFHS;

public class Main {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        try {
            division(a, b);

        }catch (ArithmeticException e){
//            e.printStackTrace();
            System.out.println("error" + e.getMessage());
        }
    }

    private static int division(int a, int b){
/*
        int result = a/b;

        return result;*/

        return a/b;
    }
}
