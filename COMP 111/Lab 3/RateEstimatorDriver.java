
/**
 * Driver to demonstrate RateEstimator class.
 *
 * @author Tina Comston/<Dylan Coakley>
 * @version Fall '22
 */
public class RateEstimatorDriver
{

    /**
     * Creates RateEstimator object, displays values.
     *@param args  Main 
     */
    public static void main(String[] args)
    {
        // Non smoker, Male, 25, Low Risk, 1 ticket, Good health
        RateEstimator rate = new
            RateEstimator(false, 'M', 25, false, 1, "Good");
        System.out.println(rate);

        rate.setSmoker(true);
        rate.setGender('F');
        rate.setAge(55);
        rate.setHighRisk(true);
        rate.setNumTickets(3);
        rate.setHealth("Fair");
        System.out.println(rate);
    }
}
