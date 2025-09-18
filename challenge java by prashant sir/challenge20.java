import java.util.Scanner;

public class challenge20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Person's age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Validate age
        if (age < 0) {
            System.out.println("Invalid age. Age cannot be negative.");
        } else {
            // Determine age group
            if (age < 13) {
                System.out.println("You are a Child.");
            } else if (age < 20) {
                System.out.println("You are a Teen.");
            } else if (age < 60) {
                System.out.println("You are an Adult.");
            } else {
                System.out.println("You are a Senior.");
            }
        }

        scanner.close();
    }
}
