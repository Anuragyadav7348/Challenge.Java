import java.util.Scanner;
public class challenge {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.err.println("calculate simple intrest");
        System.out.print("enter  principle amount Rs");
        int Principle = input .nextInt();
        System.out.print("enter  rate amount Rs");
        float Rate = input .nextFloat();
        System.out.print("enter  Year amount Rs");
        float years =  input.nextFloat();

        float intrest =( Principle * Rate * years);

        System.out.print("result of simple in  intrest :" +intrest);

        
    }
    
}
