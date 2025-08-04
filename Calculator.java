import java.util.Scanner;

public class Calculator {
	 // Method for addition
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Method for subtraction
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Method for multiplication
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Method for division
    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN; 
        }
        return num1 / num2;
    }
	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);
	        boolean continueCalculations = true;

	        System.out.println("--- Java Console Calculator ---");

	        while (continueCalculations) {
	            System.out.println("\nSelect an operation:");
	            System.out.println("1. Addition (+)");
	            System.out.println("2. Subtraction (-)");
	            System.out.println("3. Multiplication (*)");
	            System.out.println("4. Division (/)");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice (1-5): ");
	            int choice = scanner.nextInt();

	            if (choice == 5) {
	                continueCalculations = false;
	                System.out.println("Exiting the calculator. bye thanks!");
	                break;
	            }

	            System.out.print("Enter the first number: ");
	            double num1 = scanner.nextDouble();

	            System.out.print("Enter the second number: ");
	            double num2 = scanner.nextDouble();

	            double result = 0;

	            switch (choice) {
	                case 1:
	                    result = add(num1, num2);
	                    System.out.println("Result: " + num1 + " + " + num2 + " = " + result);
	                    break;
	                case 2:
	                    result = subtract(num1, num2);
	                    System.out.println("Result: " + num1 + " - " + num2 + " = " + result);
	                    break;
	                case 3:
	                    result = multiply(num1, num2);
	                    System.out.println("Result: " + num1 + " * " + num2 + " = " + result);
	                    break;
	                case 4:
	                    result = divide(num1, num2);
	                    if (!Double.isNaN(result)) {
	                        System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
	                    }
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose  a valid option.");
	                    break;
	            }
	        }
	        scanner.close(); 
	    }
	}


