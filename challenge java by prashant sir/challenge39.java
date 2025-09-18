import java.util.Scanner;
public class challenge39 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("We are here to print patterns\n");
        System.out.print("please enter the no of rows:");
        int rows = input.nextInt();
        printfirstPatterns(rows);

        
    }
    public static void printfirstPatterns(int maxRows) {
        int rows = 0;
        while( rows < maxRows) {
            System.err.println("*");
            int i = 0;
            while (i < rows) {
                System.err.print("*");
                i++;
            }
            System.err.println();
            rows++;
        }
        
    }
    
}
