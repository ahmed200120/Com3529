# COM3529 Assignment 1

This assignment involves the `Assignment1.java` class that is part of the Gradle
project that lives in the code directory of this repository. See
[`code/lib/src/main/java/uk/ac/shef/com3529/Assignment1.java`](../code/lib/src/main/java/uk/ac/shef/com3529/Assignment1.java).

The class contains four methods: `findLast`, `countPositive`, `lastZero`, and
`oddOrPos`.

Each method has a defect. You will need to write JUnit tests for each defect
and establish a fix.
    
Specifically, for each method in `Assignment1.java`, you will need to answer the
following questions, which you'll need to submit as a PDF report. The tests you
write should be added to a class called `Assignment1Test.java` (NB: When naming
tests, `[methodName]` should be replaced by the name of the method you are
writing the test for.)

1. (a) What and where is the defect?
   *[1 mark]*

   (b) Under what condition(s) do inputs to the method cause it to fail?
   *[1 mark]*

   (c) Write a JUnit test case that causes the method to fail.
   This should be called `[methodName]_failure`. (Note that the test should also
   fail - i.e., the test should have an assertion for the _correct_ behaviour of the method.)
   *[1 mark]*

2. (a) Is it possible for inputs to the method to _not_ execute the defect? If so, describe
   the condition(s) necessary for the inputs to the method that would cause this to happen.
    *[1 mark]*

   (b) If possible, according to your last answer, write a JUnit test case that
   demonstrates the above. 
   This should be called `[methodName]_defectNotExecuted`.
   *[1 mark if test is possible]*

3. (a) Is it possible for an input to execute the defect but _not_ infect the
   program's state? If so, describe
   the condition(s) necessary for the inputs to the method that would cause this to happen.
   *[1 mark]*

   (b) If possible, according to your last answer, write a JUnit test case that
   demonstrates the above. 
   Call it `[methodName]_defectExecuted_noInfection`.
   *[1 mark if test is possible]*

4. (a) Is it possible for an input to cause an infection but _not_ cause the
   method to fail? (Note, program statements being executed when they shouldn't
   count as an infection.) If so, describe
   the condition(s) necessary for the inputs to the method that would cause this to happen.
   *[1 mark]*

   (b) If possible, according to your last answer, write a JUnit test case that
   demonstrates the above. 
   Call it `[methodName]_defectExecuted_infectionCaused_noFailure`. 
   *[1 mark if test is possible]*

5. Fix the defect and add the fixed method to a class called
   `Assignment1Fixed.java`, ensuring the test you wrote as part of Question 1
   passes with the fixed version of the method. 
   *[1 mark]*

## Submission of Materials

You will need to submit three files:

1. A short report, in PDF format, that should answer each of the above six
   questions for each method that appears in `Assignment1.java`. 
   
   Where you are able to write a test, add it to a class `Assignment1Test.java`.
   
2. Your test class, `Assignment1Test.java`.

3. Your fixed version of the original class, called `Assignment1Fixed.java`.

These three items should be submitted via the "Assessment" page of
the COM3529 module on Blackboard.

## Marking Scheme

Up to one point will be allocated for each correct answer to each question.

The deadline for this work to be handed in is **Wednesday 1st March, 5pm.**

## Unfair Means

This assignment is to done **independently**. [Standard department procedures apply
with respect to unfair means.](https://sites.google.com/sheffield.ac.uk/comughandbook/your-study/assessment/unfair-means?authuser=0)
