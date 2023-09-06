//A Project by Ritasree Deb Roy
//Creating a simple calculator to calculate addition, subtraction, multiplication and division of two numbers
//Using Switch-case 

import java.util.Scanner;
public class Project_calculator {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Simple Calculator that operates on 2 numbers entered by the user");
        System.out.println("Enter two numbers:");

        System.out.print("Number 1: ");
        double num1 = scanner.nextDouble();

        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");

        System.out.print("Enter your choice (1/2/3/4): ");
        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1: //Addition of 2 Numbers
                result = num1 + num2;
                break;
            case 2: //Subtraction of 2 Numbers
                if (num1 > num2) {
                    result = num1 - num2;
                } else {
                    result = num2 - num1;  
                }
                
                break;
            case 3: //Multiplication of 2 Numbers
                result = num1 * num2;
                break;
            case 4: //Division of 2 Numbers
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero.");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        System.out.println("Result: " + result); //Final output of the Project- Simple Calculator
        scanner.close();
    }
}
