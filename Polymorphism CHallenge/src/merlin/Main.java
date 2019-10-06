package merlin;

class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine";
    }

    public String accelerate() {
        return "Car -> accelerate";

    }

    public String brake() {
        return "Car -> brake";
    }


}

// de3i click sto name tis class, refactor k kaneis copy tin class!! (F5)
/*
* otan mia class einai external k 8elw na tin balw mesa stin class tin main ( i se alli class)
* tote F6(move) -> make iiner class of -> choose the class -> refactor
* */

class Mitsubishi extends Car {

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi-> startEngine";

    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> accelerate";

    }

    @Override
    public String brake() {
        return "Mitsubishi -> brake";

    }
}

 class Holden extends Car {

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
       // mporoume na to kanoume k etsi: return "Holden-> startEngine";
        //like that retrieves the class name
        //                                                                              ----------!!!-------
        return getClass().getSimpleName() + " -> startEngine";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate";

    }

    @Override
    public String brake() {
        return "Holden -> brake";

    }
}

 class Ford extends Car {

    public  Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford-> startEngine";

    }

    @Override
    public String accelerate() {
        return "Ford -> accelerate";

    }

    @Override
    public String brake() {
        return "Ford -> brake";

    }
}


public class Main {

    public static void main(String[] args) {

        System.out.println();

        Car car = new Car(8,"Base Car");

        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        System.out.println();

        Mitsubishi mitsubishi = new Mitsubishi(6,"Oulander VRW 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        System.out.println();

        // de3i click sto name, refactor k  rename (shift + F6)

        Ford Ford = new Ford(6,"Ford Falcon");
        System.out.println(Ford.startEngine());
        System.out.println(Ford.accelerate());
        System.out.println(Ford.brake());

        System.out.println();

        Holden holden = new Holden(6,"le Holden");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());



    }


}
