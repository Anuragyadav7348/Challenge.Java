import java.util.Scanner;
class challenge36 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in );
        System.err.println("Welcome to fibonacci series");
        System.err.println("Please enter the number uo to which series ");
        int num = input.nextInt();
        printfibonacci(num);

    }
public static void printfibonacci(int num){
    if (num < 0) return;
    System.err.print("0");
    if (num == 0) return;
    System.err.print("1");


    int first = 0 , second  = 1;
    while (first + second  <= num ) {
        int third = first + second;
        System.err.println( third+ "");
        first = second;
        second = third;
    }


}
    
}
    

