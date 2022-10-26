import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * The test class RateUtilityTest.
 *
 * @author Doyt Perry/<Dylan Coakley>
 * @version Fall '22
 */
public class RateUtilityTest 
{

    /**
     * Tolerance variable when comparing floating point values.
     */
    public static final double DELTA = .0001;

    /**
     * dummy variable to keep WebCat from complaining about RateUtility class
     */
    private RateUtility rt = new RateUtility();
    
    /**
     * Default constructor for test class RateUtilityTest.
     */
    public RateUtilityTest()
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
        // the following line is needed to keep WebCat from 
        // complaining about RateUtility class
        rt.toString();
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
     * Test calcAgeAdj method.
     */
    @Test
    public void testCalcAgeAdj()
    {
        assertEquals(0.0, RateUtility.calcAgeAdj(24), DELTA);
        assertEquals(18.0, RateUtility.calcAgeAdj(25), DELTA);
        assertEquals(23.0, RateUtility.calcAgeAdj(35), DELTA);
        assertEquals(36.0, RateUtility.calcAgeAdj(45), DELTA);
        assertEquals(51.0, RateUtility.calcAgeAdj(55), DELTA);
        assertEquals(100.0, RateUtility.calcAgeAdj(65), DELTA);
        assertEquals(RateUtility.INVALID, RateUtility.calcAgeAdj(80), DELTA);
        assertEquals(RateUtility.INVALID, RateUtility.calcAgeAdj(-1), DELTA);
    }


    /**
     * Test calcSmokerAdj method.
     */
    @Test
    public void testCalcSmokerAdj()
    {
        // REMOVE this comment and assert statement
        // and complete the coding of this test method
        assertEquals(55.00, RateUtility.calcSmokerAdj(true), DELTA);
        assertEquals(0.00, RateUtility.calcSmokerAdj(false), DELTA);
    
    }

    /**
     * Test calcGenderAdj method.
     */
    @Test
    public void testCalcGenderAdj()
    {
        // REMOVE this comment and assert statement
        // and complete the coding of this test method
        assertEquals(15.00, RateUtility.calcGenderAdj('M'), DELTA);
        assertEquals(15.00, RateUtility.calcGenderAdj('m'), DELTA);
        assertEquals(0.00, RateUtility.calcGenderAdj('F'), DELTA);
        assertEquals(0.00, RateUtility.calcGenderAdj('f'), DELTA);
        assertEquals(RateUtility.INVALID, RateUtility.calcGenderAdj('h'),
            DELTA);

    }

    /**
     * Test calcRiskAdj method.
     */
    @Test
    public void testCalcRiskAdj()
    {
        // REMOVE this comment and assert statement
        // and complete the coding of this test method
        assertEquals(42.00, RateUtility.calcRiskAdj(true), DELTA);
        assertEquals(-5.00, RateUtility.calcRiskAdj(false), DELTA);
  
    }

    /**
     * Test calcTicketsAdj method.
     */
    @Test
    public void testCalcTicketsAdj()
    {
        // REMOVE this comment and assert statement
        // and complete the coding of this test method
        assertEquals(0.00, RateUtility.calcTicketsAdj(0), DELTA);
        assertEquals(5.00, RateUtility.calcTicketsAdj(1), DELTA);
        assertEquals(9.00, RateUtility.calcTicketsAdj(2), DELTA);
        assertEquals(19.00, RateUtility.calcTicketsAdj(3), DELTA);
        assertEquals(RateUtility.INVALID,
            RateUtility.calcTicketsAdj(-1), DELTA);

    }

    /**
     * Test calcHealthAdj method.
     */
    @Test
    public void testCalcHealthAdj()
    {
        // REMOVE this comment and assert statement
        // and complete the coding of this test method
        assertEquals(-6.00, RateUtility.calcHealthAdj("Good"), DELTA);
        assertEquals(0.00, RateUtility.calcHealthAdj("Fair"), DELTA);
        assertEquals(60.00, RateUtility.calcHealthAdj("Poor"), DELTA);
        assertEquals(RateUtility.INVALID,
            RateUtility.calcHealthAdj("fine"), DELTA);
        
    }

    /**
     * Test calcDemogAdj method.
     */
    @Test
    public void testcalcDemogAdj()
    {
        // 24, Non smoker, Low Risk, 0 tickets, Good health
        assertEquals(-15.00,
            RateUtility.calcDemogAdj(24, false, false, 0, "Good"), DELTA);

        // REMOVE these 2 comment lines and then code
        // EACH test case specified below

        // 79, Smoker, High Risk, 3 tickets, Poor health
        assertEquals(65.00,
            RateUtility.calcDemogAdj(79, true, true, 3, "Poor"), DELTA);
        // 34, Non smoker, High Risk, 3 tickets, Fair health
        assertEquals(0.00,
            RateUtility.calcDemogAdj(34, false, true, 3, "Fair"), DELTA);
        // 56, Non smoker, Low Risk, 0 tickets, Fair health
        assertEquals(-15.00,
            RateUtility.calcDemogAdj(56, false, false, 0, "Fair"), DELTA);
        // 24, Smoker, High Risk, 0 tickets, Poor health
        assertEquals(65.00,
            RateUtility.calcDemogAdj(24, true, true, 0, "Poor"), DELTA);
        // 80, Non smoker, Low Risk, -1 tickets, Fair health
        assertEquals(0.00,
            RateUtility.calcDemogAdj(80, false, false, -1, "Fair"), DELTA);
        // 24, Non smoker, Low Risk, 0 tickets, Average health
        assertEquals(-15.00,
            RateUtility.calcDemogAdj(24, false, false, 0, "Average"), DELTA);
        // add a few test cases that will return INVALID to 
        // make sure code logic can handle exceptions
        assertEquals(RateUtility.INVALID,
            RateUtility.calcDemogAdj(-1, false, false, 0, "Average"), DELTA);

    }

}
