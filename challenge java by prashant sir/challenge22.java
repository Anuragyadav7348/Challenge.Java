import java.util.Scanner;

public class challenge22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Two integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform bitwise OR
        int result = num1 | num2;

        // Display the result
        System.out.println("Bitwise OR of " + num1 + " and " + num2 + " is: " + result);

        // Optional: Show binary representations
        System.out.println("Binary of " + num1 + ": " + Integer.toBinaryString(num1));
        System.out.println("Binary of " + num2 + ": " + Integer.toBinaryString(num2));
        System.out.println("Binary result:      " + Integer.toBinaryString(result));

        scanner.close();
    }
}
