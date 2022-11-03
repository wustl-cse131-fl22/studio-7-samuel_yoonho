package studio7;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int initNumerator, int initDenominator)
	{
		numerator = initNumerator;
		denominator = initDenominator;
	}
	
	private int getNumerator() {
		return numerator;
	}
	
	private int getDenominator() {
		return denominator;
	}
	
	public static void main(String [] args) {
		Fraction f1 = new Fraction(2,3);
		System.out.print(f1.numerator + "/" + f1.denominator);
	}
	
	
	
	
	
	
	
}
