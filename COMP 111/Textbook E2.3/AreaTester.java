//E2.3
//Write an AreaTester program that constructs a rectangle object and then computes and prints its area.
//Use the getWidth and getHeight methods. Also print the answer.

import java.awt.Rectangle;

public class AreaTester {
	public static void main(String[] args){

		Rectangle rect = new Rectangle(0,0,35,50);

		System.out.println("The area of the rectangle is "+(rect.getWidth()*rect.getHeight()));
		System.out.println("The expected area is 1750.0");
	}
}