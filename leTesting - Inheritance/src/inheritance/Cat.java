package inheritance;

public class Cat extends Animal {
	
	private String mow;

	public Cat(String name, int foodAmount, int thirst) {
		super(name, foodAmount, thirst);
		mow = "meow";
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat(int amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drink(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return super.toString() + " and this one also does: " + mow;
	}
	
	

}
