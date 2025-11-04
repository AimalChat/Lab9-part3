------------------------------------------------------------------------
Super Calculator
Author: Hacker T. Largebrain
------------------------------------------------------------------------

This program implements a highly efficient calculating engine for
a pocket calculator. It includes a complete test rig to demonstrate
that the engine works as it should.

22. Make sure the classes in the project are compiled, and then create a CalcEngineTester object within 
BlueJ. Call the testAll method. What is printed in the terminal window? Do you believe the final line of 
what it says? 

22b.I kind of do.

23. Using the object you created in the previous exercise, call the testPlus method. What result does it 
give? Is that the same result as was printed by the call to testAll? Call testPlus one more time. What 
result does it give now? Should it always give the same answer? If so, what should that answer be? Take a 
look at the source of the testPlus method to check. 

23b.It returned an integer of value 1, when it said 7 in the terminal. It gives the correct answer this time
Yes, it should always give the same answer, or else it lacks an sort of sense. The answer should always be 
7.

24. Repeat the previous exercise with the testMinus method. Does it always give the same result? 

24b.No, it gives out the correct ouput the first time before giving -13 after the first time.

25. Perform a similar walkthrough of your own with the testMinus method. Does that raise any further 
questions in your mind about things you might like to check when looking at CalcEngine in detail? 

25b.  yes, the only thing that seems off is the clear method? It only resets the display value and nothing 
else. I corrected, I think!
/**
     * This method should be called when the 'C' (clear) button was pressed.
     */
    public void clear()
    {
        displayValue = 0;
        previousOperator = ' ';
        leftOperand = 0;
    }

26. Complete the state table below based on the following subsequent calls found in the testPlus method:
 numberPressed(4);
 equals();
 getDisplayValue();

26b.
Method called              displayValue                  leftOperand          previousOperator
initial state                   0                              0                    ' '
numberPressed(4)                4                              0                    ' '
equals                         -4                              0                    ' '
getDisplayValue                -4                              0                    ' '

CORRECTION TO BE MADE IN THE EQUALS METHOD:
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

27. When walking through the equals method, did you feel the same reassurances that we felt in 
applyPreviousOperator about the default value of previousOperator? 

27b.No, I did no longer feel reassured about the applyPreviousOperator.

28. Walkthrough a call to clear immediately following the call to getDisplayValue at the end of your state 
table, and record the new state. Is the engine in the same state as it was at the previous call to clear? 
If not, what impact do you think this could have on any subsequent calculations?

28b. I caught this error in Q25. After having done the calculation once, the clear method ONLY reseted the 
display value. Meaning the left operand and previous operator remain and sabotage the rest of the 
operations. 

29. In the light of your walkthrough, what changes do you think should be made to the CalcEngine class? 
Make those changes to a paper version of the class, and then try the walkthrough all over again. You 
should not need to walk through the CalcEngineTester class, just repeat the actions of its testAll 
method.

29b. Ive done the necessary changes in the Q25 &Q26.

30. Try a walkthrough of the following sequence of calls on your corrected version of the engine:
 clear();
 numberPressed(9);
 plus();
 numberPressed(1);
 minus();
 numberPressed(4);
 equals(); 
What should the result be? Does the engine appear to behave correctly and leave the correct answer in 
displayValue?

30b.it should result in 9 + 1 - 4 = 6! Just printed out each step and...It does!
Method called              displayValue                  leftOperand          previousOperator
initial state                   0                              0                    ' '
clear();                        0                              0                    ' '
numberPressed(9);               9                              0                    ' '
plus();                         0                              9                    '+'
numberPressed(1);               1                              9                    '+'
minus();                        0                             10                    '-'
numberPressed(4);               4                             10                    '-'
equals();                       6                              0                    ' '
