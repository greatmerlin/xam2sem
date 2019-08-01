package FFHS;

public class Pug extends Dog implements Omni {

    public Pug() {
        super();
        System.out.println("pug constructor here");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("i am the pug");
    }

    @Override
    public void moveTheTailSpeed() {
        System.out.println("yes, with speed of: " + DEFAULT_TAIL_LENGTH);
    }

    @Override
    public void One() {

    }

    @Override
    public void two() {

    }

    @Override
    public void Three() {
        System.out.println("and this");
    }
}
