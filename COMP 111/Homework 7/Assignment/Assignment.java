
/**
 * Assignment class is used to add assignments into a gradebook
 *
 * @author (Dylan Coakley)
 * @version (1.06)
 */


public class Assignment{
    // instance variables - replace the example below with your own
    private String name;
    private int totalPoints;
    private int maximumGrade;
    private int minimumGrade;
    private int sumOfAllGrades;
    private int countOfAllGrades;


    /**
     * Explicit Constructor for objects of class Assignment.
     */
    public Assignment(String name, int totalPoints) 
    {
        // initialise instance variables
        this.name = name;
        this.totalPoints = totalPoints;
        this.maximumGrade = -1;
        this.minimumGrade = -1;
        this.sumOfAllGrades = 0;
        this.countOfAllGrades = 0;

    }

    /**
     *Updates minGrade, maxGrade, sumOfAllGrades and countOfAllGrades
     *
     * @param  int assignment score
     * @return    minimumGrade, maximumGrade, sumOfAllGrades, countOfAllGrades.
     */
    public void accureScore(int assignmentScore) {
        // put your code here
        if (assignmentScore < 0 || assignmentScore > totalPoints)
        {
            return;
        }

        if(countOfAllGrades == 0)
        {
            maximumGrade = assignmentScore;
            minimumGrade = assignmentScore;
        }

        else {
            if (assignmentScore > maximumGrade)
            {
                maximumGrade = assignmentScore;
            }
            if (assignmentScore < minimumGrade)
            {
                minimumGrade = assignmentScore;
            }
        }
        sumOfAllGrades += assignmentScore;
        countOfAllGrades ++;

    }

     /**
     * Returns the name of the assignment.
     *
     * 
     * @return    name
     */
    public String getName()
    {
        return this.name;
    }

    
     /**
     * Returns the amount of points possible
     *
     * 
     * @return    totalPoints
     */
    public int getTotalPoints()
    {
        return this.totalPoints;
    }

     /**
     * Returns the Maximum Grade
     *
     * 
     * @return    maximumGrade
     */
    public int getMaximumGrade()
    {
        return this.maximumGrade;
    }

     /**
     *Returns the Minimum Grade.
     *
     * 
     * @return   minimumGrade
     */
    public int getMinimumGrade()
    {
        return this.minimumGrade;
    }

     /**
     * Returns all of the grades added together
     *
     * 
     * @return    countOfAllGrades
     */
    public int getCountOfAllGrades()
    {
        return this.countOfAllGrades;
    }
    
     /**
     * Returns the sum of all grades calculation
     *
     * 
     * @return    sumOfAllGrades
     */
    public int getSumOfAllGrades()
    {
        return this.sumOfAllGrades;
    }

     /**
     * Calculates the averageScore
     *
     * 
     * @return    averageScore
     */
    public double getAverageScore()
    {
        return ((double) sumOfAllGrades / countOfAllGrades);
    }

     /**
     * Calculates the average percent of grades
     *
     * 
     * @return    averagePercent
     */
    public double getAveragePercent()
    {
        return ((double) sumOfAllGrades / totalPoints) * 100;
    }

     /**
     * Returns the letter grade
     *
     * 
     * @return    averageLetterGrade
     */
    public char getAverageLetterGrade()
    {
        double percentage = getAveragePercent();

        if (percentage >= 90)
        {
            return 'A';
        }

        else if (percentage >= 80)
        {
            return 'B';
        }

        else if (percentage >= 70)
        {
            return 'C';
        }

        else if (percentage >= 60)
        {
            return 'D';
        }
        
        else

        {
            return 'F';
        }

    }
}
