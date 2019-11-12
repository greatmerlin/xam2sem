package inheritance;

// opoia class den einai abstract einai  -> concrete! abstract class me keyword: "static"


public class Main {

	static Animal toZwoMou;  
	
	/*
	 * auto p dimourgisa twra einai kati geniko, mporw na kanw opoio zwo 8elw
	 * */
	
	public static void main(String[] args) {
		
		toZwoMou = new Monkey("pedro", 8, 6);
		
		/*
		 * gia na kanw use mia Method dn mporw na kanw toZwoMou.climb() gt o compiler
		 * to blepei san "animal" k oxi san monkey k to climb den einai mesa sto animal.
		 * opote kanoume to "downcasting" me tin parakatw sunta3i:
		 * */
		
		((Monkey)toZwoMou).climb();
		
		System.out.println(toZwoMou);
		
		((Monkey)toZwoMou).stopClimbing();
		
		System.out.println(toZwoMou);
		
		Human anthrwpos = new Human("theo", 10, 8, 120);
		
		anthrwpos.eat(10);
		
		anthrwpos.drink(10);
		
		anthrwpos.climb();  // auto einai Method tou Monkey (Parent tou Human)
		
		System.out.println(anthrwpos);
	}

}
