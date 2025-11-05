

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CalcEngineTest.
 *
 * @author  (Aimal)
 * @version (2025-11-05)
 */
public class CalcEngineTest
{
    private CalcEngine calcEngi1;

    /**
     * Default constructor for test class CalcEngineTest
     */
    public CalcEngineTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        calcEngi1 = new CalcEngine();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testPlus()
    {
        //make sure the calculator is in a state to perform.
        calcEngi1.clear();
        //display value should now be 5.
        calcEngi1.numberPressed(5);
        //previous operand should be + after this line.
        calcEngi1.plus();
        //left operand is now 5 and display value is 3 now
        calcEngi1.numberPressed(3);
        //calculate.
        calcEngi1.equals();
        //should return display value at 8.
        assertEquals(8, calcEngi1.getDisplayValue());
    }

    @Test
    public void testMinus()
    {
        //make sure the calculator is in a state to perform.
        calcEngi1.clear();
        //display value should now be 1.
        calcEngi1.numberPressed(1);
        //previous operand should be - after this line.
        calcEngi1.minus();
        //left operand is now 1 and display value is 6 now
        calcEngi1.numberPressed(6);
        //calculate.
        calcEngi1.equals();
        //should return display value at -5.
        assertEquals(-5, calcEngi1.getDisplayValue());
    }

    @Test
    public void testClear()
    {
        //pretend to calculate 9 - 7.
        calcEngi1.numberPressed(9);
        calcEngi1.minus();
        calcEngi1.numberPressed(7);
        calcEngi1.clear();
        //should display 0 for all 3.
        assertEquals(0, calcEngi1.getDisplayValue());
        assertEquals(0, calcEngi1.getLeftOperand());
        assertEquals(' ', calcEngi1.getPreviousOperator());
    }
}



