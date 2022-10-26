import java.util.Scanner;

public class AssignmentDriver {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter An Assignment Name");
        String name = scanner.nextLine();

        System.out.println("Enter Total Points Possible");
        int totalPoints = scanner.nextInt();

        System.out.println("Enter Score #1 (negative quits)");
        int assignmentScore = scanner.nextInt();

        Assignment assignment = new Assignment (name, totalPoints);
        while (assignmentScore != -1)
        {
            assignment.accureScore(assignmentScore);
            assignmentScore = scanner.nextInt();
        }
        
        System.out.println("Statistics for " + assignment.getName());
        System.out.println("Points Possible: " + assignment.getTotalPoints());
        System.out.println("Scores Processed: " + assignment.getCountOfAllGrades());
        System.out.println("Minimum Score: " + assignment.getMinimumGrade());
        System.out.println("Maximum Score: " + assignment.getMaximumGrade());
        System.out.println("Average Score: " + assignment.getAverageScore());
        System.out.println("Average Percent: " + assignment.getAveragePercent());
        System.out.println("Average Grade: " + assignment.getAverageLetterGrade());
    
    }
}

