package FFHS;

public class Main {

    public static void main(String[] args) {

//        myMethod();  // cant be  called because it is checked Exception: throw new Exception("failed to f her"); -> need to be handled

        another(); // can be called, because RuntimeException is an unchecked exception -> doesnt need to be handled
    }

    public static void myMethod() throws Exception{
        throw new Exception("failed to f her");
    }

    public static void another() {
        throw new RuntimeException("failed to f her");
    }

}
