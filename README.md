"# Kalkulator" 
This code is a simple calculator that allows the user to perform basic mathematical operations (addition, subtraction, multiplication, and division) on two numbers. The calculator is split into three classes:

1. Calculator: This is the main class that contains the main method, which is the entry point for the program. It creates instances of InputHandler and MathematicalOperations, and uses them to get input from the user and perform the calculation.

2. InputHandler: This class is responsible for getting input from the user. It has two methods: getNumber, which prompts the user to enter a numeric value, and getOperator, which prompts the user to enter an operator.

3. MathematicalOperations: This class is responsible for performing the calculation based on the operator provided. It has a single method, calculate, which takes in two numbers and an operator, and returns the result of the calculation.

The main method starts by creating instances of InputHandler and MathematicalOperations. It then uses the getNumber method of InputHandler to get the two numbers that the user wants to operate on. It then uses the getOperator method of InputHandler to get the operator that the user wants to use. Finally, it uses the calculate method of MathematicalOperations to perform the calculation and print the result to the console.




