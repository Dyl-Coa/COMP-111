//E2.6
//Write a program AddTester that prints the expected and actual location, width, and height of box after the call to add.

import java.awt.Rectangle;

public class AddTester {
	public static void main(String[] args){

		Rectangle box = new Rectangle(5,10,20,30);
		
		System.out.println("The rectangles coordinates are: " + box.getLocation());
		System.out.println("The rectangles width is: " + box.getWidth());
		System.out.println("The rectangles height is: " + box.getHeight());
		System.out.println("The expected coordinates are: 5 , 10");
		System.out.println("The expected width is: 20");
		System.out.println("The expected height is: 30");

		box.add(0, 0);

		System.out.println("The rectangles coordinates are: " + box.getLocation());
		System.out.println("The rectangles width is: " + box.getWidth());
		System.out.println("The rectangles height is: " + box.getHeight());
		System.out.println("The expected coordinates are: 0, 0");
		System.out.println("The expected width is: 25");
		System.out.println("The expected height is: 40");
		

	}
}