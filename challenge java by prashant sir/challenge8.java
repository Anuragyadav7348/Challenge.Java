// Create a program that takes two numbers and shows result of all 
//arithmetic operators (+,-,*,/,%).

import java.util.*;
public class challenge8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Wellcome the arithmetics calculator/n");
        System.out.print("Please enter first  number: ");
        int first = input.nextInt();
        System.out.print("Now, please enter second number");
        int second = input.nextInt();
        
        int add = first + second;
        int sub = first - second;
        int mul = first * second;
        int div = first / second;

        System.out.println("Addition is ;" + add);
        System.out.println(" subtraction is ;" + sub);
        System.out.println("multiplication is ;" + mul);
        System.out.println("division is ;" + div);

        
    }
    
}
