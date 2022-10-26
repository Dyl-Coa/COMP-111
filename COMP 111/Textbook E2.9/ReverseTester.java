//E2.9
//The StringBuilder class has a method for reversing a string. In a ReverseTester clas, construct a StingBuilder from a given string.
//Call the rever method followed by the toString method, and print the result. Also print the expected value.

import java.lang.StringBuilder;

public class ReverseTester {
	public static void main(String[] args){

		StringBuilder stringBuilder = new StringBuilder("Hello World!");
		
		System.out.println(stringBuilder);
		System.out.println("Actual: "+ stringBuilder.reverse());
		System.out.println("Expected: !dlroW olleH");
	
	}
}