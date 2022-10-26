

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class AssignmentTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AssignmentTest {
    /**
     * Default constructor for test class AssignmentTest.
     */
    public AssignmentTest() {
        /*# TODO: uncomment if you are extending a base unit test */
        // super();
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        /*# TODO: uncomment if you are extending a base unit test */
        // super.setUp();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
        /*# TODO: uncomment if you are extending a base unit test */
        // super.tearDown();
    }
    
    /**
     * A sample test case.
     *
     * Process:
     *  1. Create an object to test
     *  2. Assert something about the initial object state
     *  3. Call a method
     *  4. Assert something about the return value
     *     or the state of the object after the call
     */
    @Test
    public void testConstructor() {
        /*# sample test on strings */
        Assignment testAssignment = new Assignment("HomeWork 7", 100);
        assertNotNull(testAssignment);
        assertEquals("HomeWork 7", testAssignment.getName());
        assertEquals(100, testAssignment.getTotalPoints(), 100);
        assertEquals(-1, testAssignment.getMaximumGrade());
        assertEquals(-1, testAssignment.getMinimumGrade());
        assertEquals(0, testAssignment.getSumOfAllGrades());
        assertEquals(0, testAssignment.getCountOfAllGrades());
        assertEquals('A', testAssignment.getAverageLetterGrade(), 100);
        
        
    }

}
