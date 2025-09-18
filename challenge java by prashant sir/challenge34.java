 import java.util.Scanner;
 class challenge34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Wellcome to prime number checker");
        System.err.println("please enter your number");
        int num = input.nextInt();
        boolean isprime = isprime(num);
        if (isprime) {
            System.out.println("your number is prime");
        } else {
            System.err.println("your number is not prime");
        }

        
    }

    public static boolean isprime(int num) {
        int i = 2;
        while(i < num) {
            if (num % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
