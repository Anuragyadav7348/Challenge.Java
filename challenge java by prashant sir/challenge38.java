import java.util.Scanner;
public class challenge38 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.err.println("Wellcome to palindome Number");
        System.err.println("Please enter your number");
        int num  = input.nextInt();
        boolean ispalindrome = isPalindrome(num);
        if (ispalindrome) {
            System.err.println("Your number is a palindrome number");


        }else{
            System.err.println("your number is not palinrome number");
        }
        

    }
    public  static boolean isPalindrome(int num ){
        return num == reverse(num);

    }
    public static int reverse(int num) {
        int newNum =0;
        while (num>0){
            int digit = num % 10;
            newNum = newNum* 10+ digit;
            num /= 10;
        }
        return newNum;

    }

}
