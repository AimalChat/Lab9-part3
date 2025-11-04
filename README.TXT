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



23. Using the object you created in the previous exercise, call the testPlus method. What result does it 
give? Is that the same result as was printed by the call to testAll? Call testPlus one more time. What 
result does it give now? Should it always give the same answer? If so, what should that answer be? Take a 
look at the source of the testPlus method to check. 



24. Repeat the previous exercise with the testMinus method. Does it always give the same result? 



25. Perform a similar walkthrough of your own with the testMinus method. Does that raise any further 
questions in your mind about things you might like to check when looking at CalcEngine in detail? 



26. Complete the state table below based on the following subsequent calls found in the testPlus method:
 numberPressed(4);
 equals();
 getDisplayValue();



27. When walking through the equals method, did you feel the same reassurances that we felt in 
applyPreviousOperator about the default value of previousOperator? 



28. Walkthrough a call to clear immediately following the call to getDisplayValue at the end of your state 
table, and record the new state. Is the engine in the same state as it was at the previous call to clear? 
If not, what impact do you think this could have on any subsequent calculations?



29. In the light of your walkthrough, what changes do you think should be made to the CalcEngine class? 
Make those changes to a paper version of the class, and then try the walkthrough all over again. You 
should not need to walk through the CalcEngineTester class, just repeat the actions of its testAll 
method. 



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
