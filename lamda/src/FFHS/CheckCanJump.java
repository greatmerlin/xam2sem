package FFHS;

public class CheckCanJump implements CheckAnimal {
    @Override
    public boolean check(Animal animal) {
        return animal.isCanJump();
    }
}
