package kalkulatormp;

import java.util.Scanner;

public class Calculator {
	
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter the first number: ");
			double num1 = scanner.nextDouble();
			
			System.out.println ("Enter the second number: ");
			double num2 = scanner.nextDouble(); 
			
			System.out.println ("Enter the operator (+, -, *, /): ");
			String operator = scanner.next();
			
			double result = 0;
			switch (operator) {
				case "+": 
				result = num1 + num2; 
				break;
				case "-": 
					result = num1 - num2; 
					break;
				case "*": 
					result = num1 * num2; 
					break;
				case "/": 
					result = num1 / num2; 
					break;
					default: 
						System.out.println("Invalid operator");
						
						
					}
			
			System.out.println ("Result: " + result);
			scanner.close();
			
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
