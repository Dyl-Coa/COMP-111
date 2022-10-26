import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class RateEstimator.
 *
 * @author Doyt Perry/<Dylan Coakley>
 * @version Fall '22
 */
public class RateEstimatorTest 
{
    /**
     * Tolerance variable when comparing floating point values.
     */
    public static final double DELTA = .0001;

    /**
     * Default constructor for test class RateEstimatorTest.
     */
    public RateEstimatorTest()
    {
        // not used for this lab
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        // not used for this lab
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
        // not used for this lab
    }

    /**
     * Test constructor #1.
     */
    @Test
    public void testConstructor1()
    {
        RateEstimator rateTest = new RateEstimator();
        assertNotNull(rateTest);

        // check smoker attribute value
        assertEquals(true, rateTest.isSmoker());

        // check gender attribute value
        assertEquals('M', rateTest.getGender(), 'm');

        // check age attribute value
        assertEquals(25, rateTest.getAge(), 25);

        // check high risk attribute value
        assertTrue(rateTest.isHighRisk());

        // check number of tickets attribute value
        assertEquals(1, rateTest.getNumTickets(), 1);

        // check health attribute value
        assertEquals("Good", rateTest.getHealth(), "Good");
    }

    /**
     * Test constructor #2.
     */
    @Test
    public void testConstructor2()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the setSmoker method.
     */
    @Test
    public void testSetSmoker()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the setGender method.
     */
    @Test
    public void testSetGender()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the setAge method.
     */
    @Test
    public void testSetAge()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the setHighRisk method.
     */
    @Test
    public void testSetHighRisk()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the setNumTickets method.
     */
    @Test
    public void testSetNumTickets()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }


    /**
     * Test the setHealth method.
     */
    @Test
    public void testSetHealth()
    {
        // REMOVE these comments and assert statement
        // and complete the coding of this test method
        assertTrue(true);
    }

    /**
     * Test the calcMonthlyRate method.
     */
    @Test
    public void testCalcMonthlyRate()
    {
        // Exhaustive testing of all permutations would require many
        // tests.  This is a small subset of all permutations.

        // Non smoker, Female, 24, Low Risk, 0 tickets, Good health
        RateEstimator rateTest1 = new
            RateEstimator(false, 'F', 24, false, 0, "Good");
        assertEquals(19.00, rateTest1.calcMonthlyRate(), DELTA);

       // REMOVE these 3 comment lines and then code
       // EACH test case specified below
       // (the last two test for INVALID demographic data)

        // Smoker, Male, 79, High Risk, 3 tickets, Poor health
        RateEstimator rateTest2 = new
        RateEstimator(true, 'M', 79, true, 3, "Poor");
        assertEquals(401.00, rateTest2.calcMonthlyRate(), DELTA);

        // Non smoker, Female, 34, High Risk, 3 tickets, Fair health
        RateEstimator rateTest3 = new
        RateEstimator(false, 'F', 34, true, 3, "Fair");
        assertEquals(124.00, rateTest3.calcMonthlyRate(), DELTA);

        // Non smoker, Female, 56, Low Risk, 0 tickets, Fair health
        RateEstimator rateTest4 = new
        RateEstimator(false, 'F', 56, false, 0, "Fair");
        assertEquals(76.00, rateTest4.calcMonthlyRate(), DELTA);

        // Smoker, Male, 24, High Risk, 0 tickets, Good health
        RateEstimator rateTest5 = new
        RateEstimator(true, 'M', 24, true, 0, "Good");
        assertEquals(136.00, rateTest5.calcMonthlyRate(), DELTA);

        // Non smoker, Female, 80, Low Risk, 0 tickets, Good health
        RateEstimator rateTest6 = new
        RateEstimator(false, 'F', 80, false, 0, "Good");
        assertEquals(-999.00, rateTest6.calcMonthlyRate(), DELTA);

        // Non smoker, Female, 24, Low Risk, -1 tickets, "Average" health
        RateEstimator rateTest7 = new
        RateEstimator(false, 'F', 24, false, -1, "Average");
        assertEquals(40.00, rateTest7.calcMonthlyRate(), DELTA);

    }



    /**
     * Test the toString method.
     */
    @Test
    public void testToString()
    {
        // Smoker, Male, 25, Low Risk, 1 ticket, Good health
        RateEstimator rateTest = new
            RateEstimator(true, 'M', 25, false, 1, "Good");
        String attributes = rateTest.toString();

        assertTrue(attributes.contains("Smoker: true"));
        assertTrue(attributes.contains("Gender: M"));
        assertTrue(attributes.contains("Age: 25"));
        assertTrue(attributes.contains("Risky: false"));
        assertTrue(attributes.contains("# of tickets: 1"));
        assertTrue(attributes.contains("Health: Good"));
        assertTrue(attributes.contains("Monthly premium: 127"));
    }

}
