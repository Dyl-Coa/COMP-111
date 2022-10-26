//E2.14
//Write a program RandomPrice that prints a random price between 10.00 and 19.95 everytime the program is ran.

import java.text.DecimalFormat;
import java.util.Random;

public class RandomPrice {
	public static void main(String[] args){

		Random price = new Random();
		DecimalFormat df = new DecimalFormat("##.##");

		String randomPrice1 = df.format(price.nextDouble(10.00, 19.96));
		String randomPrice2 = df.format(price.nextDouble(10.00, 19.96));
		String randomPrice3 = df.format(price.nextDouble(10.00, 19.96));
		String randomPrice4 = df.format(price.nextDouble(10.00, 19.96));
		String randomPrice5 = df.format(price.nextDouble(10.00, 19.96));
		
		System.out.println(randomPrice1);
		System.out.println(randomPrice2);
		System.out.println(randomPrice3);
		System.out.println(randomPrice4);
		System.out.println(randomPrice5);
		
	}
}