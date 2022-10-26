
/**
 * Class to generate a Term Life Insurance Quote.
 *
 * @author Doyt Perry/<Dylan Coakley>
 * @version Fall '22
 */
public class RateEstimator
{
    // instance variables
    private boolean smoker;
    private char gender;
    private int age;
    private boolean highRisk;
    private int numTickets;
    private String health;

    // constants

    /**
     * base rate for a 100K face value policy.
     */
    public static final double BASE_RATE = 45.0;

    /**
     * First constructor for objects of class RateEstimator.
     */
    public RateEstimator()
    {
        // REPLACE these comments and return statement
        // with your coding of this constructor
        this.setSmoker(true);
        this.setGender('M');
        this.setAge(25);
        this.setHighRisk(true);
        this.setNumTickets(1);
        this.setHealth("Good");
    }

    /**
     * Second constructor for objects of class RateEstimator.
     *
     * @param inSmoker      whether or not candidate is a smoker.
     * @param inGender      gender (M/F) of candidate.
     * @param inAge         age of candidate.
     * @param inHighRisk    whether or not candidate is high risk.
     * @param inNumTickets  number of traffic tickets for candidate.
     * @param inHealth      candidate health status (Good, Fair, Poor).
     */
    public RateEstimator(boolean inSmoker, char inGender, int inAge,
    boolean inHighRisk, int inNumTickets, String inHealth)
    {
        // REPLACE these comments and return statement
        // with your coding of this constructor
        this.smoker = inSmoker;
        this.gender = inGender;
        this.age = inAge;
        this.highRisk = inHighRisk;
        this.numTickets = inNumTickets;
        this.health = inHealth;


    }

    /**
     * Update whether or not the candidate is a smoker.
     *
     * @param inSmoker      whether or not candidate is a smoker.
     */
    public void setSmoker(boolean inSmoker)
    {
        this.smoker = inSmoker;
    }

    /**
     * Return whether or not the candidate is a smoker.
     *
     * @return boolean      True if smoker, false if not.
     */
    public boolean isSmoker()
    {
        return this.smoker;
    }

    // REPLACE these comments with the coding of the getter/setter
    //      setGender
    //      getGender
    // Be sure to add appropriate javaDoc comments
    
     /**
     * Update whether or not the candidate is Male or Female.
     *
     * @param inGender      M if Male, F if Female.
     */
    public void setGender(char inGender)
    {
        this.gender = inGender;
    }

     /**
     * Return whether or not the candidate is Male or Female.
     *
     * @return char      M if Male, F if Female.
     */
    public char getGender()
    {
        return this.gender;
    }

    // REPLACE these comments with the coding of the getter/setter
    //      setAge
    //      getAge
    // Be sure to add appropriate javaDoc comments
    
     /**
     * Update the age of the candidate.
     *
     * @param inAge      Returns Age.
     */
    public void setAge(int inAge)
    {
        this.age = inAge;
    }

     /**
     * Return the age of the candidate.
     *
     * @return int     Returns Age.
     */
    public int getAge()
    {
        return this.age;
    }

    // REPLACE these comments with the coding of the getter/setter
    //      setHighRisk
    //      isHighRisk
    // Be sure to add appropriate javaDoc comments
    
     /**
     * Set whether or not the candidate has a high risk occupation or not.
     *
     * @param inHighRisk      True if high risk, false if not.
     */
    public void setHighRisk(boolean inHighRisk)
    {
        this.highRisk = inHighRisk;
    }

     /**
     * Return whether or not the candidate has a high risk occupation or not.
     *
     * @return boolean      True if high risk, false if not.
     */
    public boolean isHighRisk()
    {
        return this.highRisk;
    }
    
    // REPLACE these comments with the coding of the getter/setter
    //      setNumTickets
    //      getNumTickets
    // Be sure to add appropriate javaDoc comments
    
     /**
     * Sets the number of tickets that the candidate has.
     *
     * @param inNumTickets      Number of tickets.
     */
    public void setNumTickets(int inNumTickets)
    {
        this.numTickets = inNumTickets;
    }

     /**
     * Returns the number of tickets that the candidate has.
     *
     * @return int      Number of tickets.
     */
    public int getNumTickets()
    {
        return this.numTickets;
    }
    
    // REPLACE these comments with the coding of the getter/setter
    //      setHealth
    //      getHealth
    // Be sure to add appropriate javaDoc comments
    
     /**
     * Sets the health status of the candidate.
     *
     * @param inHealth    Good, Fair or Poor are acceptable.
     */
    public void setHealth(String inHealth)
    {
        this.health = inHealth;
    }

     /**
     * Returns the health status of the candidate.
     *
     * @return String     Good, Fair or Poor are acceptable.
     */
    public String getHealth()
    {
        return this.health;
    }

    /**
     * Calculate monthly rate.
     *
     * @return double  Monthly rate for a 100K face value policy
     */
    public double calcMonthlyRate()
    {
        // The monthly rate starts with at the BASE_RATE and
        // is adjusted for each demographic.

        // Use methods of RateUtility to find needed adjustment for each
        // demographic, and then update the monthly rate accordingly
        // Return the monthly rate after all adjustments are made

        // NOTE: Some demographic data can be invalid - if the utility
        // method returns INVALID, then stop processing and return
        // INVALID as the monthly rate

        // Variable to accumulate monthly rate
        double monthlyRate = BASE_RATE;

        // Variable whose value will be adjustment for specific demographic data
        double rateAdjustment = 0.0;

        // Adjust rate based on age
        rateAdjustment = RateUtility.calcAgeAdj(this.age);

        if (rateAdjustment == RateUtility.INVALID)
        {
            return RateUtility.INVALID;
        }
        else
        {
            monthlyRate = monthlyRate + rateAdjustment;
        }

        // Adjust rate based on whether or not a smoker
        rateAdjustment = RateUtility.calcSmokerAdj(this.smoker);
        monthlyRate = monthlyRate + rateAdjustment;

        // Adjust rate based on gender
        // REPLACE THIS comment with your code
        rateAdjustment = RateUtility.calcGenderAdj(this.gender);
        monthlyRate = monthlyRate + rateAdjustment;

        // Adjust rate based wheter high risk
        // REPLACE THIS comment with your code

        rateAdjustment = RateUtility.calcRiskAdj(this.highRisk);
        monthlyRate = monthlyRate + rateAdjustment;

        // Adjust rate based on number of tickets
        // REPLACE THIS comment with your code

        rateAdjustment = RateUtility.calcTicketsAdj(this.numTickets);
        monthlyRate = monthlyRate + rateAdjustment;

        // Adjust rate based on health
        // REPLACE THIS comment with your code

        rateAdjustment = RateUtility.calcHealthAdj(this.health);
        monthlyRate = monthlyRate + rateAdjustment;
        // Adjust rate based on multiple factors
        // (using the calcDemogAdj method of RateUtility)
        // REPLACE THIS comment with your code
        rateAdjustment = RateUtility.calcDemogAdj(this.age, this.smoker,
            this.highRisk, this.numTickets, this.health);

        monthlyRate = monthlyRate + rateAdjustment;

        return monthlyRate;
    }

    /**
     * Display candidate information.
     *
     * @return String       formatted candidate information.
     *
     * <pre>
     * The resulting string has the format:
     *
     * Policy quote information:
     * Smoker: false
     * Gender: M
     * Age: 25
     * # of tickets: 1
     * Risky: false
     * Health: Good
     * Monthly premium: 50.0
     * </pre>
     */
    public String toString()
    {
        // initialize the variable that will hold the output string
        String quote = "Policy quote information:\n";

        quote += "Smoker: " + this.isSmoker() + "\n";

        // REPLACE these 2 comments with your code to complete
        // the output string per the specified format
        quote += "Gender: " + this.getGender() + "\n";
        quote += "Age: " + this.getAge() + "\n";
        quote += "# of tickets: " + this.getNumTickets() + "\n";
        quote += "Risk: " + this.isHighRisk() + "\n";
        quote += "Health: " + this.getHealth() + "\n";
        quote += "Monthly Premium: " + this.calcMonthlyRate() + "\n";

        return quote;
    }

}
