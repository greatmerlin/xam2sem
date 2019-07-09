package FFHS;

public class Animal {

    private int feet;
    private int eyes;

    public Fly flyngType;

    public Animal(int feet, int eyes){
        this.eyes = eyes;
        this.feet = feet;
    }

    public String tryToFly(){
        return flyngType.fly();
    }

    public void setFlyingAbility(Fly newFlyingType){
        flyngType = newFlyingType;
    }
}
