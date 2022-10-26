//E2.5
//Write a program that constructs a rectange with area 42 amd a rectangle with perimeter 42.
//Print the widths and heights of both rectangles.

import java.awt.Rectangle;

public class main {
	public static void main(String[] args){

		Rectangle rectArea42 = new Rectangle(0,0,6,7);
		Rectangle rectPerimeter42 = new Rectangle(0,0,12,9);

		System.out.println("The area of the first rectangle is: 42");
		System.out.println("The height of the first rectangle is " + rectArea42.getHeight());
		System.out.println("The width of the first rectangle is " + rectArea42.getWidth());
		System.out.println("The expected height is: 7");
		System.out.println("The expected width is: 6");

		System.out.println("The perimeter of the second rectangle is: 42");
		System.out.println("The height of the second rectangle is " + rectPerimeter42.getHeight());
		System.out.println("The width of the second rectangle is " + rectPerimeter42.getWidth());
		System.out.println("The expected height is: 9");
		System.out.println("The expected width is: 12");
	}
}