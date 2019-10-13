package merlin;

public class Car extends Vehicle {

//------------------------------------Data Field-------------------------------------------------

private int wheels;

private int doors;

private int gears;

private boolean isManual;

private int currentGear;



//------------------------------------Contructor-------------------------------------------------

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }


//------------------------------------Methods-------------------------------------------------

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): changed to " +this.currentGear + " gear.");
    }

    public void changeVelocity(int speed, int direction) {
        move(speed,direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
    }


//------------------------------------End Here-------------------------------------------------

}

