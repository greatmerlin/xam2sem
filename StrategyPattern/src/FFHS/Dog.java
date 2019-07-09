package FFHS;

public class Dog extends Animal {

    private String sound;

    public Dog(int feet, int eyes, String sound) {
        super(feet, eyes);
        this.sound = sound;
        System.out.println("the Dog Barks");

//        flyngType = new ItCantFly();
        setFlyingAbility(new ItCantFly());
    }


}
