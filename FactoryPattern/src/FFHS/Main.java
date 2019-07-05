package FFHS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number");
        double number1 = input.nextInt();
        System.out.println("Enter the second number");
        double number2 = input.nextInt();
        System.out.println("Now choose the calculation, type: " +
                "\n'add' for addition, " +
                "\n'divide' for division " +
                "\n'subtract' for subtraction");
        CalculateFactory calculateFactory = new CalculateFactory();
        Calculate obj = calculateFactory.getCalculation(input.next());
        obj.calculate(number1, number2);
    }
}
