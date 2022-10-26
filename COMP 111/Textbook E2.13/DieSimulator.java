//E2.13
//Write a program DieSimulator that uses the Random class to simulate the cast of a die, printing a random number between 1 and 6 everytime the program is run.

import java.util.Random;

public class DieSimulator {
	public static void main(String[] args){

		Random dice = new Random();
		
		int diceRoll = dice.nextInt(1,7);
		System.out.println(diceRoll);

		int diceRoll2 = dice.nextInt(1,7);
		System.out.println(diceRoll2);
		
		int diceRoll3 = dice.nextInt(1,7);
		System.out.println(diceRoll3);

		int diceRoll4 = dice.nextInt(1,7);
		System.out.println(diceRoll4);
		
		int diceRoll5 = dice.nextInt(1,7);
		System.out.println(diceRoll5);
		
	}
}