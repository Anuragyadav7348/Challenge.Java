
import java.util.Scanner;

public class challenge15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to number checker/n");
        int num = input.nextInt();

        if(num>0) {
            System.out.println("Your number is postive");

        } else if (num == 0) {
            System.out.println("your number is zero");

        } else {
            System.err.println("your number is");
        }
        

    }

    
}
