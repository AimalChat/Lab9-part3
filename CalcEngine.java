/**
 * The main part of the calculator performing the arithmetic logic 
 * of the calculations.
 * 
 * @author Hacker T. Largebrain 
 * @version 1.0
 */
public class CalcEngine
{
    // The value in the display.
    private int displayValue;
    // The previous operator typed (+ or -).
    private char previousOperator;
    // The left operand to previousOperator.
    private int leftOperand;

    /**
     * Create a CalcEngine instance.
     */
    public CalcEngine()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
        System.out.println(displayValue);
        System.out.println(previousOperator);
        System.out.println(leftOperand);
    }

    /**
     * Return the value of the calculator that should appear in the display right now.
     * @return The value to be shown on the calculator display.
     */
    public int getDisplayValue()
    {
        return displayValue;
    }

    /**
     * A number button was pressed. Process it.
     * @param number The single digit.
     */
    public void numberPressed(int number)
    {
        System.out.println(displayValue);
        displayValue = displayValue * 10 + number;
        System.out.println(displayValue);
    }

    /**
     * This method should be called when the '+' button was pressed. 
     */
    public void plus()
    {
        System.out.println(displayValue);
        System.out.println(previousOperator);
        applyPreviousOperator();
        System.out.println(previousOperator);
        previousOperator = '+';
        System.out.println(previousOperator);
        displayValue = 0;
        System.out.println(previousOperator);
    }

    /**
     * This method should be called when the '-' button was pressed.
     */
    public void minus()
    {
        System.out.println(displayValue);
        System.out.println(previousOperator);
        applyPreviousOperator();
        System.out.println(previousOperator);
        previousOperator = '-';
        System.out.println(previousOperator);
        displayValue = 0;
        System.out.println(displayValue);
    }
    
    /**
     * This method should be called when the '=' button was pressed.
     */
    public void equals()
    {
        System.out.println(displayValue);
        System.out.println(previousOperator);
        if(previousOperator == '+') {
            displayValue = leftOperand + displayValue;
            System.out.println(previousOperator);
            System.out.println(displayValue);
        }
        else if(previousOperator == '-'){
            displayValue = leftOperand - displayValue;
            System.out.println(displayValue);
        }else
        {
            //do nothing here!
            System.out.println(displayValue);
        }
        leftOperand = 0;
    }

    /**
     * This method should be called when the 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
    }

    /**
     * Return the name of this calculator to be shown as the title of the application.
     * @return The title of this calculation engine.
     */
    public String getTitle()
    {
        return "Super Calculator";
    }

    /**
     * Return the name of the author of this application.
     * @return The author of this engine.
     */
    public String getAuthor()
    {
        return "Hacker T. Largebrain";
    }

    /**
     * Return the version number of this application.
     * @return The version number of this engine.
     */
    public String getVersion()
    {
        return "version 0.2";
    }
    
    /**
     * An operator button has been pressed. Apply the immediately preceding operator to
     * calculate an intermediate result. This will form the left operand of the new operator.
     */
    private void applyPreviousOperator()
    {
        System.out.println();
        if(previousOperator == '+') {
            System.out.println();
            System.out.println();
            leftOperand += displayValue;
            System.out.println();
        }
        else if(previousOperator == '-') {
            System.out.println();
            System.out.println();
            leftOperand -= displayValue;
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println();
            // There was no preceding operator.
            leftOperand = displayValue;
        }
    }
}
