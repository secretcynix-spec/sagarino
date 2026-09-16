
import java.util.Scanner;

public class Joshmil12 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            int choice;
            double num1, num2, result;
            System.out.println("================================");
            System.out.println("       MINI CALCULATOR SYSTEM");
            System.out.println("================================");
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
             switch (choice) {
                
                case 1 -> {
                    result = num1 + num2;
                    System.out.println("\nResult: " + result);
                }
                    
                case 2 -> {
                    result = num1 - num2;
                    System.out.println("\nResult: " + result);
                }
                    
                case 3 -> {
                    result = num1 * num2;
                    System.out.println("\nResult: " + result);
                }
                    
                case 4 -> {
                    if (num2 == 0) {
                        System.out.println("\nError: Cannot divide by zero.");
                    } else {
                        result = num1 / num2;
                        System.out.println("\nResult: " + result);
                    }
                }
                    
                default -> System.out.println("\nInvalid choice.");
            }
System.out.println("\n================================");
            System.out.println("     Thank you for using it!");
            System.out.println("================================");
        }
    }
}

