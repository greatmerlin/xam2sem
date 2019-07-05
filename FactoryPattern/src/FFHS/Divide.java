package FFHS;

public class Divide implements Calculate {
    @Override
    public void calculate(double number1, double number2) {
        System.out.println("number 1 / number 2 = " + (number1/number2));
    }
}
