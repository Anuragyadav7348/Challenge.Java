import java.util.Scanner;

public class challenge12 {
    public static void main(String[] args) {
                Scanner input = new Scanner (System.in);
        System.err.println("calculate compound intrest");
        System.out.print("enter your principle amount Rs");
        int principle  = input .nextInt();
        System.out.print("enter your rate amount Rs");
        float Rate = input .nextFloat();
        System.out.print("enter your Year amount Rs");
        float years =  input.nextFloat();

        double compInt =principle  * Math.pow((1+Rate / 100),years);
        System.out.println("Your compund intrest is Rs" +compInt);


       
        
    }
    
    
}
