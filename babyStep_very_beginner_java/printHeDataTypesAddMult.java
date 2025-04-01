package babyStep_very_beginner_java;
import java.util.Scanner;

public class printHeDataTypesAddMult{

public static void main(String args[]) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    
    // Perform addition
    int sum = num1 + num2;
    
    // Perform multiplication
    int product = num1 * num2;
    
    // Display results
    System.out.println("Sum: " + sum);
    System.out.println("Product: " + product);
    
    // Close the scanner
    scanner.close();
}
}