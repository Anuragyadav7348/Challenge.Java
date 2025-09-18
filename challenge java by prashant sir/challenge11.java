
import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        System.out.println("calculate the Area of a Triangle");
        Scanner input = new Scanner (System.in);
        System.out.println("Triangle of base");
        double base = input.nextDouble();
        System.out.println("Triangle of height");
        double height = input.nextDouble();

        double Area  = 0.5 * base * height ;

        System.out.println("the area of triangle is : " + Area);
    }
    
}
