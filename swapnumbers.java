import java.util.Scanner;

public class SwapWithTemp {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Get the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Get the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display numbers before swapping
        System.out.println("Before Swapping: num1 = " + num1 + ", num2 = " + num2);

        // Swap using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Display numbers after swapping
        System.out.println("After Swapping: num1 = " + num1 + ", num2 = " + num2);

        // Close the scanner
        scanner.close();
    }
}
