import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object to take input
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();  // Read an integer from the user
        
        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println(number + " is Even.");
        } else {
            System.out.println(number + " is Odd.");
        }
        
        sc.close();  // Close the scanner
    }
}
