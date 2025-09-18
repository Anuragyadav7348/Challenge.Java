import java . util. Scanner;
public class challenge16 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("wellcome to  check number even or odd\n");
        System.err.println(" please enter your number ");
        int num = input.nextInt();

        if(num%2==0) {
        System.err.println("your number is even number ");
        } else {
            System.out.print("your number is aodd number");
            
        }

    }
    
}
