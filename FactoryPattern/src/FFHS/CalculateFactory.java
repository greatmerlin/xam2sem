package FFHS;

public class CalculateFactory {

    public Calculate getCalculation(String type){
        Calculate obj = null;
        if (type.toLowerCase().equals("add")) {
            obj = new Add();
        } else if (type.toLowerCase().equals("divide")) {
            obj = new Divide();
        } else if (type.toLowerCase().equals("subtract")) {
            obj = new Subtract();
        }else {
            System.out.println("please type down a valid command");
        }
        return obj;
    }
}
