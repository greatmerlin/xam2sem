package merlin;

public class Main {

    public static void main(String[] args) {

// duplex ? print in double site. use false in contructor to use 1 site print.

    Printer printer = new Printer(50,true);

        System.out.println("Initial prage count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new  total print count for printer = " +printer.getPagesPrinted() );

        pagesPrinted = printer.printPages(2);

        System.out.println("Pages printed was " + pagesPrinted + " new  total print count for printer = " +printer.getPagesPrinted() );





    }
}
