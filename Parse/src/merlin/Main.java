package merlin;

/*
* suni8ws kanoume parse ena String otan 8eloume na metatrepsoume to apotelesma tou se kati allo, px se int (convert String to other primitive type)
* auto to kanoume suni8ws otan pairnoume input apo ton user
*
* we use a class called Integer (wrapper class) - it contains some useful static MEthods like
* parseInt.
* to .parseInt douleuei mono an to String apoteleitai apo ari8mous kai oxi apo grammata!
* px "2018" einai accepted, "2018a" omws oxi!
* */

public class Main {

    public static void main(String[] args) {
	// write your code here


        String numberAsString = "2018";
        System.out.println("numberAsString= " + numberAsString);

        System.out.println();

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;          // to String mas
        number += 1;                   // to converted int mas. afou to kanoume convert to use like int weiter!

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);

        System.out.println();

        // me me Doubles!!! Class Double, parse Double!!!

        String doubleNumber = "500.5";

        double secondNumber = Double.parseDouble(doubleNumber);

        System.out.println("The String: " + doubleNumber);
        System.out.println("The converted one: " + secondNumber);

        System.out.println();

        System.out.println(getLargestPrime(21));

        System.out.println();

        printSquareStar(8);




    }
    //------------------------Other Methods------------------------------


    public static int getLargestPrime(int number){
        int result = 0;
        if(number <=1){
            return -1;
        }
        int aux = number;
        int i = 2;
        while(aux != 0 && i <= number){
            if(aux % i == 0){
                result = i;
                aux = aux / i;
            }else{
                i++;
            }
        }
        return result;
    }


    //------------------------------------------------------------------------

    public static void printSquareStar(int number){
        if(number<5){
            System.out.println("Invalid Value");
        }else{
            for(int i=1;i<=number;i++){
                for(int j=1;j<=number;j++){
                    if(i==1 || j==1 || i==number || j==number || i==j || j==number-i+1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }System.out.println();
            }
        }
    }



















//------------------------------- bis hier-----------------------------------------
}
