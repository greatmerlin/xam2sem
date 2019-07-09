package FFHS;

public class Main {

    public static void main(String[] args) {

        Animal myDog = new Dog(2,4,"woof");
        Animal myBird = new Bird(2, 1);

        System.out.println();

        System.out.println("Can my Dog fly?: " + myDog.tryToFly());
        System.out.println("Can my Bird fly?: " + myBird.tryToFly());
    }
}
