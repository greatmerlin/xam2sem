package FFHS;

public interface Herbi {

    default void two(){
        System.out.println("this is the default");
    }

    default int firstCalc(){
        return 5;
    }
}
