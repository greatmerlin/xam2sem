package house;

public class Main {

    public static void main(String[] args){

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("South");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("East");

        Ceiling ceiling = new Ceiling(12,"blue");

        Bed bed = new Bed("Modern",4,3,2,1);

        Lamp lamp = new Lamp("Classic",false,75);

        Bedroom bedroom = new Bedroom("Theos",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

        bedroom.makeBed();

        bedroom.getLamp().turnOn();





    }






}
