//E1.4
//Write a program that prints the balance of an account after the first, second, and third year.
//The account has an initial balance of 1,000 and earns 5%  interest per year.
public class Main {
    public static void main(String[] args) {
        double startingAmount = 1000;
        double secondYearAmount = 1000*1.05;
        double thirdYearAmount = secondYearAmount * 1.05;
        double fourthYearAmount = thirdYearAmount * 1.05;
        System.out.println(startingAmount);
        System.out.println(secondYearAmount);
        System.out.println(thirdYearAmount);
        System.out.println(fourthYearAmount);
    }
}
