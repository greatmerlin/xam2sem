package FFHS;

public interface Fly {

    String fly();
}

class ItFlys implements Fly{

    @Override
    public String fly() {
        return "it can fly!";
    }
}

class ItCantFly implements Fly{

    @Override
    public String fly() {
        return "it cant fly";
    }
}
