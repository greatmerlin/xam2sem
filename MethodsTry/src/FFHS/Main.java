package FFHS;

public class Main {

    // Methods that compile

    public void jump(){}

    void jump2(){}

    public final void jump3(){}

    public static final void jump4(){}

    public final static void jump5(){}

    final public void jump6(){}

    final static void jump7(){}

    String pedro(){
        return "";
    }

    int xerox(){
        return 5;
    }

    boolean isTrue(){
        return 5 > (10 % 3);
    }


    // method that has variable arguments - you can only have ONE var arguments parameter
    public void jump8(int... numbers){}

    // the variable arguments has to be the last parameter, otherwise it doesn't compile

    //    public void jump9(int... numbers, int one){} -> doesn't compile


static int lol = 5; // must be static to be able to be called inside from main


    public static void main(String[] args) {

        int pear = lol + 4;

        System.out.println(Dog.count);
        Dog.incrementCountByOne();
        System.out.println(Dog.count);

        Dog newDog = new Dog();
        newDog.count = 5;
        System.out.println(Dog.count);

        newDog = null;

        System.out.println(newDog.count); // because static methods are shared.

        Dog dog2 = new Dog();
        System.out.println(dog2.count); // again, static methods are shared (changes in all instances)
    }


}
