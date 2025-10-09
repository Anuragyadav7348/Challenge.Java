import java.util.Scanner;

public class challenge29 {

    // Function to calculate the sum of odd numbers from 1 to N
    public static int sumOddNumbers(int N) {
        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter  value of N: ");
        int N = scanner.nextInt();

        int sum = sumOddNumbers(N);

        System.out.println("The sum of odd numbers from 1 to " + N + " is: " + sum);

        scanner.close();
    }
}
