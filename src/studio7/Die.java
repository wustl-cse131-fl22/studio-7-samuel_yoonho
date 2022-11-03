package studio7;

public class Die {

	private int sides;
	
	public Die(int initSides) {
		sides = initSides;
	}
	
	private int getSides() {
		return sides;
	}
	
	public static void main(String[] args) {
		Die n1 = new Die(69);
		System.out.print((int)(Math.random()*69) +1);
	}
	
	
	
	
	
	
}
