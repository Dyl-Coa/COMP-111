//E2.8
//Write a program HollePrinter that switches the letter "e" and "o" in a string. Use the replace method repeatedly.
//Demonstrate that the string "Hello, World!" turns into "Holle, Werld!".

public class main {
	public static void main(String[] args){

		String basicPhrase = "Hello, World!";

		System.out.println(basicPhrase);
		basicPhrase = basicPhrase.replace("e" , "x");
		basicPhrase = basicPhrase.replace("o" , "e");
		basicPhrase = basicPhrase.replace("x", "o");

		System.out.println("Actual: " + basicPhrase);
		System.out.println("Expected: Holle Werld!");
	
	}
}