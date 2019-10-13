package merlin;

public class Vehicle {

//------------------------------------Data Field-------------------------------------------------

private String name;

private String size;

private int currentVelocity;  // velocity = the speed of sth in a given direction

private int currentDirection;

//------------------------------------Contructor-------------------------------------------------

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        // an auta ta 2 instance variables tou DF ta orisw kateu8eian edw den ta xreiazomai stin paren8esi

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }


//------------------------------------Methods-------------------------------------------------

public void steer(int direction){

        this.currentDirection += direction;
    System.out.println("Vericle.steer(): Steering at " + currentDirection + " degrees.");

}

public void move(int velocity, int direction) {
        currentVelocity =    velocity;
        currentDirection =   direction;

    System.out.println("Vehicle.move(): Moving at " +currentVelocity + " in direction " + currentDirection);
}

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void stop(){
        this.currentVelocity = 0;
    }

//------------------------------------End Here-------------------------------------------------

}
