package studio7;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {

	private double length;
	private double width;
	
	public Rectangle(double initLength, double initWidth ) {
		length = initLength;
		width = initWidth;
	}
	
	private double getLength() {
		return length;
	}
	private double getWidth() {
		return width;
	}
	

	public static void main(String[] args) {
		Rectangle n1= new Rectangle(0.1,0.2);
		Rectangle n2= new Rectangle(0.1,0.2);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.filledRectangle(0, 0, n2.getWidth()/2, n2.getLength()/2);
		
		
		if (n1.width==n1.length) {
			
			System.out.println("Is a square");
			
		}
	}
	
	
	
}
