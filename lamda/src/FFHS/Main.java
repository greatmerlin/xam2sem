package FFHS;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.mym(8);
        System.out.println(Cat.x);
//        System.out.println(cat.y); does not compile

        System.out.println();

        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));

        print(animals, new CheckCanJump());

        print(animals, animal -> animal.isCanSwim());
        print(animals, animal -> !animal.isCanSwim());  // animals that can't swim

        //filter

        List<String> names = new ArrayList<>();

        names.add("cl");
        names.add("theo");
        names.add("thana");
        names.add("chr");

        System.out.println(names);

        names.removeIf(name -> name.charAt(0) == 't');
        System.out.println(names);
    }

    private static void print(List<Animal> animals, CheckAnimal filter){

        for (Animal animal : animals){
            if (filter.check(animal)){
                System.out.println(animal.getType());
            }
        }
        System.out.println();
    }


}
