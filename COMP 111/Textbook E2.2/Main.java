//E2.2
//Look into the API documentation of the String class and locate the trim method.
//Write a program demonstrating what is does. Then show how you can use the replace method to remoce all spaces from a string.
public class Main {
    public static void main(String[] args) {
        String trimDemonstration = "         Demonstrate what the trim method does within a string.";
        String replaceDemonstration = "         Demonstrate what the replace method does within a string.     ";
        System.out.println(trimDemonstration.trim());
        System.out.println(replaceDemonstration.replaceAll("\\s", ""));
    }
}