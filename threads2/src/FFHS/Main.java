package FFHS;

public class Main {

    public static void main(String[] args) {

        Countdown countdown1 = new Countdown();
        Countdown countdown2 = new Countdown();

        /*
        * both threads use the same instance variable from the Hype (sometimes is suspended)
        * */

        countdown1.start();
        countdown2.start();








    }
}
