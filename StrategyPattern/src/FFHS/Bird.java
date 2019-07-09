package FFHS;

public class Bird extends Animal {

    private boolean layEggs;

    public Bird(int feet, int eyes) {
        super(feet, eyes);
        layEggs = true;
        System.out.println("the Bird tweets");

//        flyngType = new ItFlys();
        setFlyingAbility(new ItFlys());
    }
}
