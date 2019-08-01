package FFHS;

public class Pug extends Dog {

    public Pug() {
        super();
        System.out.println("pug constructor here");
    }

    @Override
    public void printDetails(){
        super.printDetails();
        System.out.println("i am the pug");
    }
}
