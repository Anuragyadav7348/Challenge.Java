
import java.util.Scanner;

public class challange10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("we calculate perimeter of rectangele");
        System.out.println("enter side A");
        int A = input.nextInt();
        System.out.println("enter side B");
        int B = input.nextInt();
        System.out.println("enter side C");
        int C = input.nextInt();
        System.out.println("enter side D");
        int D = input.nextInt();

        int add = A+B+C+D;
        System.out.println("result of perimeter:" +add);




    }
    
}
