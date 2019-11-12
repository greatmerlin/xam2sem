package inheritance;

public class Monkey extends Animal implements WalkOnFeet {  //  exteds -> einai child tou. pairnei tis idiotites tou
															// implements-> pairnei tin idiotita tou Interface
	
	private boolean isClimbing;  // monadiki idiotita autis tis class
	
	public Monkey(String name, int foodAmount, int thirst) {
		super(name, foodAmount, thirst);
		isClimbing = false;
	}

	@Override
	public void eat(int amount) {
		foodAmount += amount/2;     // eat half of the normal
		
	}

	@Override
	public void drink(int amount) {
		thirst += amount/2; // amount /2 gt trwei ligotero apo alla zwa
		
	}
	
	/*
	 * override methods praino belaki pros ta panw
	 * idio name methoou sto child me parent px toString
	 * */
	
	@Override
	public String toString() {
		return super.toString() + " and is it climbing? --> " + isClimbing;   //super.ParentMethod()  
	}

	@Override
	public int distanceTravelled() {			// added from Interface
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void climb() {
		isClimbing = true;
	}
	
	public void stopClimbing() {
		isClimbing = false;
	}
	
	

}
