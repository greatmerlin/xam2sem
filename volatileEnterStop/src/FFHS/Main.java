package FFHS;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Runner t1 = new Runner();
        t1.start();

        System.out.println("Press Enter to stop....");
        scanner.nextLine();
        t1.shutdown();

    }
}
