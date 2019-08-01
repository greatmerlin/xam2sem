package FFHS.main;

import FFHS.Animal;
import FFHS.Cat;
import FFHS.Dog;

public class PolyParameters {

    public static void main(String[] args) {

        Dog dog = new Dog();
        printDetails(dog);

        Cat cat = new Cat();
//        printDetails(cat);  // not possible because the parameter type is dog
        printDetails(cat);
        printDetails(cat);  // now it's possible with animal as parameter
    }

/*    public static void printDetails(Dog dog){
        dog.printDetails();
    }

    public static void printDetails(Cat cat){   // is possible with overloaded methods
        cat.printDetails();
    }*/

    public static void printDetails(Animal animal){
        animal.printDetails();
    }

}
