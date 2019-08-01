package FFHS;

public class Dog extends Animal implements hasTail, CanRun, Omni {

    public Dog() {
        super();  // calls the constructor from the Parent class
        System.out.println("Dog here");
    }
    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("overridden method from dog");
    }

    public double getWeight(){
        return  super.getWeight() + 5.0;
    }

    @Override
    void eat() {
        System.out.println("dog eats meat");
    }

    @Override
    public void moveTheTailSpeed() {
        System.out.println("yes, with speed of: " + DEFAULT_TAIL_LENGTH);
    }

    @Override
    public boolean runs() {
        return true;
    }

    @Override
    public void One() {

    }

    @Override
    public void Three() {

    }
}
