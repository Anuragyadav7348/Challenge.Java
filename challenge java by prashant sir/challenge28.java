import java.util.Scanner;
class challenge28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.err.println("Welcome to multiplication world");
        System.err.println("please enter your number");
        int num = input.nextInt();
        printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        int i = 1;
        while (i <= 10) {
            System.out.println(num+"X"+i+"="+(num*i));
            i++;
        }
        
    }
}