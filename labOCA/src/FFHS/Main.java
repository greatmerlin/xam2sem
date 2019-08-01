package FFHS;

public class Main {

    public static void main(String[] args) {

        TestRoom a = new TestRoom(5.0, 6.0);
        TestRoom b = new TestRoom(-3.0, 4.0);

        TestRoom bPlusA = b.plus(a);

        TestRoom aPlusB = TestRoom.staticPlus(a,b);

        System.out.println("a real = " + a.getReal() + " imaginary = " + a.getImaginary());
        System.out.println("b real = " + b.getReal() + " imaginary = " + b.getImaginary());
        System.out.println("a + b real = " + bPlusA.getReal() + " imaginary = " + bPlusA.getImaginary());
        System.out.println("static a + b = " + aPlusB.getReal() + " + " +  aPlusB.getImaginary());

        System.out.println();

//        Animal animal = new Animal();   because it's abstract

        System.out.println();

        Dog dog = new Dog(); // with super(), the constructor of the parent is called

        System.out.println();

        John john = new John(18, "blue"); // with super(), the constructor of the parent is called

        System.out.println();


        dog.printDetails();

        System.out.println();

        Dog doggy = new Dog();

        System.out.println();

        doggy.setAge(5);
        doggy.setName("husky");
        doggy.printDetails();

        System.out.println();

        Pug pug = new Pug();

        System.out.println();

        pug.setAge(3);
        pug.setName("rolf");
        pug.printDetails();

        System.out.println();

        System.out.println(doggy.getWeight());

        System.out.println();

        pug.moveTheTailSpeed();
        System.out.println("a dog can run: " + dog.runs());

        System.out.println();

        Cat cat = new Cat();

        cat.two();

        System.out.println();

        System.out.println(dog.firstCalc() + dog.secondCalc());
        System.out.println(cat.firstCalc() + cat.secondCalc());
        cat.testHop();
    }
}
