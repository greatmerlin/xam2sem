package inheritance;

public class Human extends Monkey {
	
	private int IQ;
	
	public Human(String n, int fA, int t, int iq) {
		
		super(n, fA, t);   // mporoun na graftoun k san suntomeuseis
		this.IQ = iq;
	}
	
	public String toString() {
		return super.toString() + " and  with IQ " + IQ;
	}

	public void drink(int amount) {
		super.drink(amount/2);         // to miso apo to super tou, dil tin maimou
	}
}
