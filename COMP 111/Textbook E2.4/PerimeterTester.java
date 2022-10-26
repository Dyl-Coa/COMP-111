//E2.4
//Write a PerimeterTester program that constructs a rectangle object and then computes and prints its area.
//Use the getWidth and getHeight methods. Also print the answer.

import java.awt.Rectangle;

public class PerimeterTester {
	public static void main(String[] args){

		Rectangle rect = new Rectangle(0,0,35,50);

		System.out.println("The perimeter of the rectangle is "+ ((2 * rect.getWidth()) + (2 * rect.getHeight())));
		System.out.println("The expected perimeter is 170.0");
	}
}