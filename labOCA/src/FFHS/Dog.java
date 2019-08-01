package FFHS;

public class Dog extends Animal {

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


}
