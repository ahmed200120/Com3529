# COM3529 Assignment 1

This assignment involves the `Assignment1.java` class that is part of the Gradle
project that lives in the code directory of this repository. See
[`code/lib/src/main/java/uk/ac/shef/com3529/Assignment1.java`](../code/lib/src/main/java/uk/ac/shef/com3529/Assignment1.java).

The class contains four methods: `findLast`, `countPositive`, `lastZero`, and
`oddOrPos`.

Each method has a defect. You will need to write a JUnit tests to detect the
defect and establish when it has been fixed.
    
Specifically, for each method in `Assignment1.java`, you will need to:

1. Identify the defect.

2. Attempt to write a JUnit test case that does _not_ execute the defect.

3. Attempt to write a JUnit test case that _executes_ the defect, but _does not_
   infect the program state.

4. Write a JUnit test case that causes the method to _infect_ the program state,
   but _not_ produce a failure.

5. For the given test case, identify the first infected (i.e., erroneous)
   program state. Be sure to describe the complete state.

6. Fix the fault and verify that the given test now produces the expected
output.


## Submission of Materials

You will need to submit three files:

1. A short report, in PDF format, that should answer each of the above six
   questions for each method that appears in `Assignment1.java`. Where you are
   able to write a test, add it to a class `Assignment1Test.java`, and write its
   name as a response to the question. Where you cannot write a test method to
   respond ot the question, explain in your report why you think it is not
   possible. 

2. Your test class, `Assignment1Test.java`.

3. Your fixed version of the original class, called `Assignment1Fixed.java`.

These three items should be zipped up and submitted via the "Assessment" page of
the COM3529 module on Blackboard.

## Marking Scheme

Marks are allocated based on how fast you turnaround this assignment, as well as
how well you answer the questions. 

One point will be allocated for each, wholly correct answer to each question, up
to a maximum of 24 marks. 

Your points total will then be scaled by the hand-in date as follows to
calculate a final mark:

* 100% for submissions before 11:59 Friday 10/2/2023
* 80% for submissions before 11:59 Friday 17/2/2023
* 60% for submissions thereafter (**hard deadline: Friday 24/2/2023, 5pm**)

The earlier you hand-in your work, the higher the mark you will be able to
achieve.
