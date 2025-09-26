import java.util.*;
public class array {
    // public static void main(String[] args) {
    //     int [] myArr = new int [5];
    //     myArr[0] = 98 ;
    //     myArr[1] = 65;
    //     myArr[2] = 78;
    //     myArr[3] = 45;
    //     myArr[4] = 65;
    //     System.err.println(myArr[0]);
    //     System.err.println(myArr[3]);
    //     System.err.println(myArr[4]);
        
    // }

    

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Rows and Columns input lo
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Step 2: 2D array banao
        int[][] arr = new int[rows][cols];

        // Step 3: Input lo
        System.out.println("Enter elements of 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Step 4: Output print karo
        System.out.println("\n2D Array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

    
}
