import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();
        boolean ans = isprime(num);
        System.out.println(ans);
    }

    static boolean isprime(int num) {
        if (num <= 1) {
            return false;  // 0, 1, negatives are not prime
        }

        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;  // divisible → not prime
            }
            c++;  // increment divisor
        }

        return true; // no divisors found → prime
    }
}





   

    

