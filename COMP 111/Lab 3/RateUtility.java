

/**
 * A utility class to help calculate demographic impact on rates.
 *
 * @author Doyt Perry/<Dylan Coakley>
 * @version Fall '22
 */
public class RateUtility
{
    // This is a utility class, all methods are static,
    // thus objects are not created from this class.
    // Methods are called on the class name, similar
    // to how we call methods on the standard Java API
    // Math class i.e. Math.pow(5, 2), Math.sqrt(25) etc.

    // constants

    /**
     * Indicates that policy cannot be quoted due
     * to value of one of the rate factors.
     */
    public static final double INVALID = -999.0;

        /**
     * Calculate age-related rate adjustment.
     *
     * @param  inAge        age of candidate.
     * @return double       monthly premium adjustment
     *                      (return INVALID if bad input).
     */
    public static double calcAgeAdj(int inAge)
    {
        // Age-related adjustment
        if (inAge < 0)
        {
            return INVALID;
        }
        else if (inAge < 25)
        {
            return 0.00;
        }

        // REPLACE these comments and replace with coding
        // of SEQUENCE OF COMPARISONS for other ages
        else if (inAge < 35)
        {
            return 18.00;
        }
        else if (inAge < 45)
        {
            return 23.00;
        }
        else if (inAge < 55)
        {
            return 36.00;
        }
        else if (inAge < 65)
        {
            return 51.00;
        }
        else if (inAge < 80)
        {
            return 100.00;
        }
        else
        {
            return INVALID;
        }
    }

    /**
     * Calculate smoker-related rate adjustment.
     *
     * @param inSmoker      whether or not candidate is a smoker.
     * @return double       monthly premium adjustment.
     *
     */
    public static double calcSmokerAdj(boolean inSmoker)
    {
        // REPLACE these comments and return statement
        // with your coding of this method
        if (inSmoker == true) 
        {
            return 55.00;
        }
        else if (inSmoker == false)
        {
            return 0.00;
        }
        return INVALID;
    }

    /**
     * Calculate gender-related rate adjustment.
     *
     * @param   inGender    gender (M/F) of candidate.
     * @return  double      monthly premium adjustment
     *                      (return INVALID if bad input).
     *
     */
    public static double calcGenderAdj(char inGender)
    {
        // REPLACE these comments and return statement
        // with your coding of this method
        if (inGender == 'M' || inGender == 'm')
        {
            return 15.00;
        }
        else if (inGender == 'F' || inGender == 'f') 
        {
            return 0.00;
        }
        else 
        {
            return INVALID;
        }
    }

    /**
     * Calculate risk-related rate adjustment.
     *
     * @param inHighRisk        whether or not candidate is high risk.
     * @return double           monthly premium adjustment.
     *
     */
    public static double calcRiskAdj(boolean inHighRisk)
    {
        // REPLACE these comments and return statement
        // with your coding of this method
        if (inHighRisk == true)
        {
            return 42.00;  
        }
        else 
        {
            return -5.00;
        }
    }

    /**
     * Calculate tickets-related rate adjustment.
     *
     * @param   inNumTickets    number of traffic tickets for candidate.
     * @return  double          monthly premium adjustment
     *                          (return INVALID if bad input).
     *
     */
    public static double calcTicketsAdj(int inNumTickets)
    {
        // REPLACE these comments and return statement
        // with your coding of this method
        if (inNumTickets == 0)
        {
            return 0.00;    
        }
        else if (inNumTickets == 1)
        {
            return 5.00;
        }
        else if (inNumTickets == 2)
        {
            return 9.00;
        }
        else if (inNumTickets > 2)
        {
            return 19.00;
        }
        else 
        {
            return INVALID;
        }
    }

    /**
     * Calculate health-related rate adjustment.
     *
     * @param   inHealth        candidate health status (Good, Fair, Poor).
     * @return  double          monthly premium adjustment
     *                          (return INVALID if bad input).
     *
     */
    public static double calcHealthAdj(String inHealth)
    {
        if (inHealth.equalsIgnoreCase("Good"))
        {
            return -6.00;
        }
        // REPLACE these comments and return statement
        // with your coding of a
        // of SEQUENCE OF COMPARISONS for other health status
        if (inHealth.equalsIgnoreCase("Fair"))
        {
            return 0.00;
        }
        if (inHealth.equalsIgnoreCase("Poor"))
        {
            return 60.00;
        }
        else
        {
            return INVALID;
        }
    }

    /**
     * Calculate demographics-related rate adjustment.
     *
     * @param   inSmoker        whether or not candidate is a smoker.
     * @param   inAge           age of candidate.
     * @param   inHighRisk      whether or not candidate is high risk.
     * @param   inNumTickets    number of traffic tickets for candidate.
     * @param   inHealth        candidate health status (Good, Fair, Poor).
     * @return  double          monthly premium adjustment.
     *
     */
    public static double calcDemogAdj(int inAge, boolean inSmoker,
        boolean inHighRisk, int inNumTickets, String inHealth)
    {
        // Variable to count factors that contribute to premium decrease
        int asset = 0;

        // Variable to count factors that contribute to premium increase
        int liability = 0;

        // Variable to hold rate adjustment
        double rateAdjustment = 0;

        // Determine if demographic data counts toward increase/decrease

        if (inAge > 0 && inAge < 25)
        {
            ++asset;
        }
        if (inSmoker == true)
        {
            ++liability;
        }
        else if (inSmoker == false)
        {
            ++asset;
        }
        if (inNumTickets == 0)
        {
            ++asset;
        }
        else if (inNumTickets > 2)
        {
            ++liability;
        }
        if (inHighRisk == true)
        {
            ++liability;
        }
        else if (inHighRisk == false)
        {
            ++asset;
        }
        if (inHealth.equals("Good"))
        {
            ++asset;
        }
        else if (inHealth.equals("Poor"))
        {
            ++liability;
        }

      
        // REPLACE these comments and replace with coding
        // to test other demographic data contributing to
        // a premium increase/decrease
      
    
        // were there enough factors to decrease premium?
        if (asset >= 3)
        {
            rateAdjustment = -15.00;
        }

        // REPLACE these comments and replace with coding
        // to determine if an increase in premium is needed
        else if (liability >= 3)
        {
            rateAdjustment = 65.00;
        }
    
        return rateAdjustment;
        
        
    }
}
    


