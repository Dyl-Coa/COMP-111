//E2.10
//Write a program BrighterDemo that constructs a color object with red, green and blue values of 50, 100, 150.
//Then apply the brighter method of the color class and print the red, green and and blue values.

import java.awt.Color;

public class BrighterDemo {
	public static void main(String[] args){

		Color color = new Color(50, 100, 150);

		System.out.println("Red: " + color.getRed());
		System.out.println("Green: " + color.getGreen());
		System.out.println("Blue: " + color.getBlue());

		color = color.brighter();

		System.out.println("Red: " + color.getRed());
		System.out.println("Green: " + color.getGreen());
		System.out.println("Blue: " + color.getBlue());

	}
}