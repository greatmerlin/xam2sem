package FFHS;

public class Cat extends Animal implements Omni, Hop {  // no need to implement the method two, can be called from main.

    public Cat() {
    }

    @Override
    void eat() {
    }

    @Override
    public void One() {

    }

    @Override
    public void Three() {

    }

    public void testHop(){
        System.out.println("i can hop that much: " + Hop.jumpHeight());
    }

    @Override
    public void printDetails(){

        System.out.println("overridden method from cat");
    }
}
