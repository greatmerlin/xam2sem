package merlin;

public class Porsche extends Car {

//------------------------------------Data Field-------------------------------------------------

private int roadServiceMonths;




//------------------------------------Contructor-------------------------------------------------

    public Porsche( int roadServiceMonths) {
        super("Porsche", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }


//------------------------------------Methods-------------------------------------------------

public void accelerate(int rate){     // accelerate = change in velocity

        // me local var 8etoume tin taxutita

        int newVelocity = getCurrentVelocity() + rate;

        if(newVelocity == 0){
            stop();
            changeGear(1);
        }else if(newVelocity >0 && newVelocity <= 10){
            changeGear(1);
        }else if(newVelocity >0 && newVelocity <= 20){
            changeGear(2);
        }else if(newVelocity >0 && newVelocity <= 30) {
            changeGear(3);
        }else {
            changeGear(4);
        }

        if(newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
}













//------------------------------------End Here-------------------------------------------------

}

