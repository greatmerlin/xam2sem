package FFHS;

/**
 * Immutable Classes (not changeable)
 * */

public class TestRoom {

    private final double real;
    private final double imaginary;

    public TestRoom(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public TestRoom plus(TestRoom otherTestRoom){  // same for minus, multiply etc.
        double newReal = real + otherTestRoom.real;
        double newImaginary = imaginary + otherTestRoom.imaginary;

        return new TestRoom(newReal, newImaginary);
    }

    public static TestRoom staticPlus(TestRoom a, TestRoom b){
        return a.plus(b);
    }
}
