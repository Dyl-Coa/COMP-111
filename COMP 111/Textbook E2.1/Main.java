//E2.1
//Write a program that initializes a string with "Mississippi". Then replace all "i" with "ii" and print the length of the resulting string.
//In that string, replace all "ss" with "s" and print the length of the resulting string.
public class Main {
    public static void main(String[] args) {
        String stateName = "Mississippi";
        System.out.println(stateName);
    
        stateName = stateName.replace("i" , "ii");
        System.out.println(stateName);
        System.out.println(stateName.length());
    
        stateName = stateName.replace("ss" , "s");
        System.out.println(stateName);
        System.out.println(stateName.length());

    }
}