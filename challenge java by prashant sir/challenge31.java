import java.util.Scanner;
public class challenge31 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.err.println("Welcome to sum of Digits");
        System.err.println("Please enter your number:");
        int num = input.nextInt();
        int sum = sumofDigit(num);
        System.out.println("sum of Digit is"+sum);

    }
public static int sumofDigit(int num) {
    int sum = 0;
    while(num > 0){
        sum += num%10;
        num /= 10;
    }
    return sum;

}
    
}
