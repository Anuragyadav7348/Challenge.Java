import java.util.Scanner;

public class challenge14 {
    public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for Fahrenheit input
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        // Convert to Celsius
        double celsius = (fahrenheit - 32) * 5.0 / 9.0;

        // Display result
        System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);

        scanner.close();
    }
}
    
}
