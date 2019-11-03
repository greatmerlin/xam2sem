public class Main {

    public static void main(String[] args) {

        /*
        * 2 tropoi gia na ftia3eis ena antikeimeno p exei san parameter ston contructor ena allo antikeimeno.
        * eite ftiaxnontas prwta to allo antikeimeno
        * eite me to new Antikeimeno(bla bla);
        * */

        Dimensions dimensions = new Dimensions(20,20,5);

        Case theCase = new Case("220B", "Dell","240",dimensions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",27,new Resolution(2540,1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4,6,"v2.44");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);

        // to access through the PC the Methods from the other classes: ( .Getter.Method) !!!!!!!!!!!!!!!

        thePC.getMonitor().drawPixelAt(1500,1200,"red");

        thePC.getMotherboard().loadProgram("Windows 1.0");

        thePC.getTheCase().pressPowerButton();












//-----------------------------------------------MAIN-------------------------------------------------------------------
    }

//-----------------------------------------------OTHER METHODS----------------------------------------------------------














//-----------------------------------------------END--------------------------------------------------------------------

}
