import java.util.Scanner;
public class practice {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.err.println("Enter a number ");
        int A = in.nextInt();
        System.err.println("Enter a number B");
        int B = in.nextInt();
        System.err.println("Enter a number C");

        int C = in.nextInt();
        if (A==B && C==B){
            System.err.println("3 number equal hai");
        }
         

         else if(A >= B && A>=C ){
            System.err.println("A is largest number");

         }else if ( B >= A && B >= C){
            System.err.println("B is greatest number");

         } else {
            System.err.println("C is greatest number");
         }

        
        

      
    }
}




        
    
    
    

