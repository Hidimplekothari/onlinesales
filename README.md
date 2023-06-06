# onlinesales Coding Ninjas Assignment 
assignment
Task-1
Simulation of an Event that Follows Given Biasness

Problem Statement: Write a program that accepts a map of all possible outcomes of an event along with their probabilities and every occurrence of the event would generate outcomes based on the given probabilities. This could be seen as a generalization of events like rolling of a dice (could be biased) or flipping of a coin (could be biased). 
Examples
Rolling of a six-faced biased dice
Input: [ {1, 10}, {2, 30}, {3, 15}, {4, 15}, {5, 30}, {6, 0} ]
Flipping of a coin
Input [ {“Head”: 35}, {“Tail”: 65} ]
Rules
Input: Probabilities given are as integers and percentages.
Each occurrence of the event should only generate one of the outcomes given in input
The outcome of each occurrence is independent of that of others.
On observing a large number (say 1000) of occurrences, the probability distribution should roughly follow the given biasness.
Example
Input: [ {1: 35}, {2: 65} ]  ## 1=Head, 2=Tail
Output:
On triggering the event 1000 times, Head appeared 332 times and Tail 668 times which is roughly inline with the biasness given.
This is just one of the possibilities.


**Solution - Refer EventGenerator class**




Task-2
Evaluate multiple mathematical expressions at once using a Web API

Problem Statement
Write a program that accepts multiple mathematical expressions and evaluates each of them using any public Web API available. The program should display the result of each expression on the console.
Rules
No expressions should be evaluated in the code. All evaluations should be using the Web API.
You can assume different expressions that are compatible with the API you choose. 
Example: Some API might use ^ operator for power some might use pow()
Example
Input (every line is an expression, evaluate when “end” is provided as an expression)
2 * 4 * 4
5 / (7 - 5)
sqrt(5^2 - 4^2)
sqrt(-3^2 - 4^2)
end
Output
2 * 4 * 4 => 32
5 / (7 - 5) => 2.5
sqrt(5^2 - 4^2) => 3
sqrt(-3^2 - 4^2) = 5i

**Solution - Refer MathExpressionEvaluator class**

Coding Guidelines
You can choose any programming language: Java, C++, Python, Node.js, etc.
You can hardcode the input within the code, no need to focus on input collection from a user.
Code has to be executable and free of any compile time or runtime errors.
Unit test cases need to be included as well.
Mention any assumptions clearly.
Add brief comments to describe the logic/code.
Follow best coding practices and structure your code to be modular and readable.
Add instructions on how to run the code.
Both the tasks are mandatory.
The assignment will have to be submitted within 24 hours from the time of sharing.
This document is read only, create your own files /documents for submissions.
