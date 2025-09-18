
import java.util.Scanner;

public class challenge19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Student's percentage marks
        System.out.print("Enter your percentage marks (0-100): ");
        double percentage = scanner.nextDouble();

        // Validate input
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid input. Percentage must be between 0 and 100.");
        } else {
            // Grade calculation logic
            if (percentage > 90) {
                System.out.println("Grade: A");
            } else if (percentage > 60) {
                System.out.println("Grade: C");
            } else {
                System.out.println("Grade: F");
            }
        }

        scanner.close();
    }
}
