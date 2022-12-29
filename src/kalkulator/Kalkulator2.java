package kalkulator;

import java.util.InputMismatchException;
import java.util.Scanner;

	public class Kalkulator2 {
		public static void main(String[] args) {
			InputHandler inputHandler = new InputHandler();
			MathematicalOperations mathematicalOperations = new MathematicalOperations();
			
			double num1 = inputHandler.getNumber("Enter the first number: ");
			double num2 = inputHandler.getNumber("Enter the second number: ");
			String operator = inputHandler.getOperator("Enter the operator (+, -, *, /): ");
			
			double result = mathematicalOperations.calculate(num1, num2, operator);
			System.out.println("Result: " + result);
		}
	}

	class InputHandler {
		private Scanner scanner = new Scanner(System.in);
		
		public double getNumber(String prompt) {
			System.out.println(prompt);
			try {
				return scanner.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Invalid input, must be a numeric value");
				System.exit(1);
				return 0;
			}
		}
		
		public String getOperator(String prompt) {
			System.out.println(prompt);
			return scanner.next();
		}
	}

	class MathematicalOperations {
		public double calculate(double num1, double num2, String operator) {
			switch (operator) {
				case "+": 
					return num1 + num2; 
				case "-": 
					return num1 - num2; 
				case "*": 
					return num1 * num2; 
				case "/": 
					return num1 / num2; 
				default: 
					System.out.println("Invalid operator");
					System.exit(1);
					return 0;
			}
		}
	}


