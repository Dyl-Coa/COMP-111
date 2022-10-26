//E2.12
//Repeat exercise E2.10, but apply the darker method of the color class twice to the object color red. Call your class DarkerDemo.
import java.awt.Color;

public class DarkerDemo {
	public static void main(String[] args){

		Color color = new Color(50, 100, 150);

		System.out.println("Red: " + color.getRed());
		System.out.println("Green: " + color.getGreen());
		System.out.println("Blue: " + color.getBlue());

		color = Color.red.darker().darker();

		System.out.println("Red: " + color.getRed());
		System.out.println("Green: " + color.getGreen());
		System.out.println("Blue: " + color.getBlue());

	}
}