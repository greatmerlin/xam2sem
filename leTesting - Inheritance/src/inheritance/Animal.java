package inheritance;

public abstract class Animal { 		// abstract - i basi! den kanoume objects apo autin
	
	private String name;
	protected int foodAmount; // protected -> visible MONO apo ta CHILD tis classis autis.
	protected int thirst;
	
	public Animal(String name, int foodAmount, int thirst) {
		
		this.name = name;				//keyword "this" -> parapempei stin timi tou DF.
		this.foodAmount = foodAmount;
		this.thirst = thirst;
		
	}
	
	public String toString() {
		return "This " + name + " eats " + foodAmount + " kg of food, and drinks " + thirst + " ml of water";
	}
	
	public abstract void eat(int amount);   // abstract methods -> ola ta CHILDREN tou prepei na ta exoun.
	public abstract void drink(int amount); // prepei na tis kaneis @override sta child
	
	public void walk(int steps) {
		
	}
	
	public int dinstanceTravelled(int km) {
		return 0;
	}
	
}
