//E2.7
//Write a program ReplaceTester that encodes a string by replacing all letters "i" with "!" and all letters "s" with "$".
//Use the replace method. Demonstrate that you can correctly code "Mississippi". Print both the actual and expected result.

public class main {
	public static void main(String[] args){

		String stateName = "Mississippi";
		String stateNameReplaceI = stateName.replace("i", "!");
		String stateNameReplaceS = stateNameReplaceI.replace("s", "$");

		System.out.println(stateName);
		System.out.println("Replace i with !");
		System.out.println("Expected: M!ss!ss!pp!");
		System.out.println("Actual: " + stateNameReplaceI);
		System.out.println("Replace s with $");
		System.out.println("Expected: M!$$!$$!pp!");
		System.out.println(stateNameReplaceS);

	
	}
}